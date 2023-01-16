package com.tasks.path_files_buffers_scannig_formating_IO;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathToFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/learning/packt/JavaModernChallenge.pdf");
        Path absolute_path = Paths.get("С:/learning/packt", "JavaModernChallenge.pdf");
        Path short_path = Paths.get(
                "C:/learning/packt/chapters/../JavaModernChallenge.pdf")
                .normalize();
        String pathToString = path.toString();
        URI pathToURI = path.toUri ();
        URI uri = URI.create(
                "https://www.learning.com/packt/JavaModernChallenge.pdf");
        Path URIToPath = Paths.get(uri.getPath()).getFileName();
        URL url = new URL(
                "https://www.learning.com/packt/JavaModernChallenge.pdf");
        Path URLToPath = Paths.get(uri.getPath()).getFileName();

        Path path1 = Paths.get(
                "/learning/books/../PACKT/./", "JavaModernChallenge.pdf");
// D:\learning\packt\JavaModernChallenge.pdf
        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);

        File pathToFile = path.toFile();
        Path fileToPath = pathToFile.toPath();
    }
}
