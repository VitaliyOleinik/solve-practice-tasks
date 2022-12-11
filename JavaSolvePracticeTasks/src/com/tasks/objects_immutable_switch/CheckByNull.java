package com.tasks.objects_immutable_switch;

import java.util.*;

public class CheckByNull {
    static List<Integer> numbers
            = Arrays.asList(1, 2, null, 4, null, 16, 7, null);

    private static List<Integer> evenIntegers(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if (Objects.nonNull(integers) && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }

    private static int sumIntegers(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
                .filter(i -> i != null)
                .mapToInt(Integer::valueOf).sum();
    }

    private static boolean integersContainsNulls(List<Integer> integers) {
        if (integers == null) {
            return false;
        }

        return integers.stream()
                .anyMatch(i -> i == null);
    }

    public static int sumIntegersStreams(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }
}

