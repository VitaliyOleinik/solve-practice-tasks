package com.tasks.path_files_buffers_scannig_formating_IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FromStringToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "Vit";
        String text = "Hi there\" \"\";\"\" one -> \\ double -> \\\\ triple -> \\\\\\";
        PrintWriter out = new PrintWriter("filename.txt");
        out.println(text);
        out.close();
    }
}
