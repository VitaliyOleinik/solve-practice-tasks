package com.tasks.optional_examples;

import javax.swing.text.html.Option;
import java.awt.print.Book;
import java.util.*;
import java.util.function.Supplier;

public class InitializingOptional {
    public static void main(String[] args) {
        Optional<String> book = Optional.empty();
        // Если "book" является пустым, то следующий ниже код
        // выбросит исключение java.util.NoSuchElementException
        String theBook = book.get();

        // Предпочтительно
        if (book.isPresent()) {
            String theBook1 = book.get();
            // сделать что-то c "theBook"
        } else {
            // сделать что-то, что не вызывает book.getO
        }
    }

    public static final String BOOK_STATUS = "UNKNOWN";

    public static String findStatus() {
        Optional<String> status = Optional.of("");

        return status.orElse(BOOK_STATUS);
    }

    // Предпочтительно
    public String findStatus1() {
        Supplier<String> supplier = () -> "supplier";
        Optional<String> status = Optional.of(""); // эта переменная может быть пустой
        // supplier вызывается, только если "status" является пустым
        return status.orElseGet(supplier);
    }

    public String findStatusThrow() {
        Optional<String> status = Optional.of("");
        return status.orElseThrow(
                () -> new NoSuchElementException("Не получается найти элемент"));
    }

    public String findStatusThrow1() {
        Optional<String> status = Optional.of("");
        return status.orElseThrow(
                () -> new IllegalStateException("Не получается найти элемент"));
    }

    // Предпочтительно (JDK 10+) NoSuchElementException:
    public String findStatusThrowJdk10() {
        Optional<String> status = null;// эта переменная может быть пустой
        return status.orElseThrow();
    }

    // Предпочтительно
    public void displayStatus() {
        Optional<String> status = Optional.of("I'm exist!"); // эта переменная может быть пустой
        status.ifPresent(System.out::println);
    }

    public void displayStatusIfPresentOrElse() {
        Optional<String> status = Optional.of("21312");
        status.ifPresentOrElse(System.out::println,
                () -> System.out.println("Статус не найден..."));
    }

    public Optional<String> findStatusWithOR() {
        Optional<String> status = null;

        return status.or(() -> Optional.of(BOOK_STATUS));
    }

    private static final String NOT_FOUND = "NOT FOUND";

    // Предпочтительно
    static class Book {
        String name;
        int price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public String findFirstCheaperBook(int price, List<Book> books) {
        return books.stream()
                .filter(b -> b.getPrice() < price)
                .findFirst()
                .map(Book::getName)
                .orElse(NOT_FOUND);
    }

    class Author {
        List<Book> books;

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    }

    public void validateAuthorOfBook(Book book) {
        Optional<Author> author = Optional.empty();
        author.filter(a -> a.getBooks().contains(book))
                .orElseThrow();
    }

    public void OptionalIntLongDouble() {
        // Предпочтительно
        // развернуть посредством getAsIntO
        OptionalInt priceInt = OptionalInt.of(50);
        // развернуть посредством getAsLongO
        OptionalLong priceLong = OptionalLong.of(50L);
        // развернуть посредством getAsDouble()
        OptionalDouble priceDouble = OptionalDouble.of(49.99d);
    }

}
