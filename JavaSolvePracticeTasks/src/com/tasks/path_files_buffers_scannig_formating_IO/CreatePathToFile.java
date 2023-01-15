package com.tasks.path_files_buffers_scannig_formating_IO;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathToFile {
    public static void main(String[] args) {
        Path path = Paths.get("/learning/packt/JavaModernChallenge.pdf");
        Path absolute_path = Paths.get("С:/learning/packt", "JavaModernChallenge.pdf");
        Path short_path = Paths.get(
                "C:/learning/packt/chapters/../JavaModernChallenge.pdf")
                .normalize();

    }
}
