package fileIO;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
//        System.out.println(getFilePath("fileIO","test.txt").toAbsolutePath());

//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());

//        System.out.println("Does the path exist?");
//        System.out.println(doesPathExist(
//                getFilePath("src","fileIO","test.txt")));


//        tryCreateDirectory(getPath("src","fileIO","files"));

        init();
    }

    public static void init(){

        // try to create the directory.
        Path path = FileDirectoryUtil.getPath("src","fileIO","files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // try to create the file.
        path = Paths.get(path.toAbsolutePath().toString(),"test.txt");
        FileDirectoryUtil.tryCreateFile(path);

         // Print out the final location of the file. // Before we Write
        System.out.println(path.toAbsolutePath());


        // Try to write to the file. // After we Write.
        IOutil.trywriteToFile(getContent(),path);

        // try to print the contents of the file.
        IOutil.tryPrintContents(path);

    }

    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<String>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("Another line");
        contentToWrite.add("You get the point");

        return contentToWrite;
    }

    }


