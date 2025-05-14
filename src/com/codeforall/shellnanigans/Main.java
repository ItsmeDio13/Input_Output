package com.codeforall.shellnanigans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // open an input stream with a file path as the source
        FileInputStream inputStream = new FileInputStream("./Resources/linus.jpeg");

        // open an output stream with a file path as the destination
        FileOutputStream outputStream = new FileOutputStream("./Resources/linus-copy.jpeg");

        // read multiple bytes from the file
        byte[] buffer = new byte[1024];

        int counter = 0;
        int num=0;


        while (num != -1){
            num = inputStream.read(buffer);
            if (num != -1) {
                outputStream.write(buffer,0,num);
            }
            System.out.println( num + " bytes readen in this iteration");                              
           counter = num+counter;
        }
        counter++;

        // print the number of bytes read
        if (num == -1) {
            System.out.println("I have read this many bytes: " + counter);
        } else {
            System.out.println("Error reading file");
        }

        // don't forget to close the input stream
        inputStream.close();
    }

}