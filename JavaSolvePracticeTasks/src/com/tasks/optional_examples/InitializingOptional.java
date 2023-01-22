package com.tasks.optional_examples;

import java.awt.print.Book;
import java.util.Optional;

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
}
