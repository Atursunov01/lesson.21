package com.company;


import  java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import  java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        FileWriter Akzhol = new FileWriter("Song.java");

        Akzhol.write("ab\n");
        Akzhol.write("xd\n");
        Akzhol.write("pay\n");
        Akzhol.write("ed\n");
        Akzhol.write(1+"\n");
        Akzhol.write(3453 + "\n");
        Akzhol.close();

        FileReader fileReader = new FileReader("Song.java");
        Scanner scanner = new Scanner(fileReader);
        System.out.println(scanner.nextLine());
       System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
       System.out.println(scanner.nextLine());

        fileReader.close();
    }
}
