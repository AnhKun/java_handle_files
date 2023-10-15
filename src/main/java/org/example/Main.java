package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hoang\\Documents\\java_oop\\HandleFiles\\src\\test\\all_files";
        File sourceFolder = new File(path);

        Path sourcePath;
        Path destPath;
        for (File file : sourceFolder.listFiles()){
            String extension = file.getName().substring(file.getName().lastIndexOf('.'));
            try{
                switch (extension){
                    case ".docx":
                        sourcePath = Paths.get(path, file.getName());
                        destPath = Paths.get("C:\\Users\\hoang\\Documents\\java_oop\\HandleFiles\\src\\test\\word_folder", file.getName());
                        Files.move(sourcePath, destPath);
                        break;
                    case ".pdf":
                        sourcePath = Paths.get(path, file.getName());
                        destPath = Paths.get("C:\\Users\\hoang\\Documents\\java_oop\\HandleFiles\\src\\test\\pdf", file.getName());
                        Files.move(sourcePath, destPath);
                        break;
                    case ".png":
                        sourcePath = Paths.get(path, file.getName());
                        destPath = Paths.get("C:\\Users\\hoang\\Documents\\java_oop\\HandleFiles\\src\\test\\hinh_anh", file.getName());
                        Files.move(sourcePath, destPath);
                        break;
                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}