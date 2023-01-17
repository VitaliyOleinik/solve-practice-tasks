package com.tasks.path_files_buffers_scannig_formating_IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConnectingPathToNamesOfFiles {
    public static void main(String[] args) {
        Path base = Paths.get("D:/learning/packt");
        Path path = base.resolve("JBossTools3.pdf");

        Path basePath = Paths.get("D:/learning/packt");
        String[] books = {
                "Book1.pdf", "Book2.pdf", "Book3.pdf"
        };
        for (String book: books) {
            Path nextBook = basePath.resolve(book);
            System.out.println(nextBook);
        }

    }
}
