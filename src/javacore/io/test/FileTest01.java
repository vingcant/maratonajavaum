package javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try{
            boolean created = file.createNewFile();
            System.out.println("Created: "+created);
            System.out.println("path: "+file.getPath());
            System.out.println("absolute path: "+file.getAbsolutePath());
            System.out.println("directory: "+file.isDirectory());
            System.out.println("is file: "+file.isFile());
            System.out.println("hidden: "+file.isHidden());
            Instant instant = Instant.ofEpochMilli(file.lastModified());
            LocalDateTime lastModificated = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println("Last modification: "+ lastModificated);
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
