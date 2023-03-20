package LAB01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("text1.txt"));
            int num1=0;
            while(sc.hasNextLine()){
                String [] line = sc.nextLine().split(",");
                for(int i=0; i<line.length; i++){
                    System.out.println(line[i]);
                    num1++;
                }
            }
            System.out.println("Number of characters: " + num1 + "\n");

            sc = new Scanner(new FileInputStream("text2.txt"));
            int num2=0;
            while(sc.hasNextLine()){
                String [] line = sc.nextLine().split(", ");
                for(int i=0; i<line.length; i++){
                    System.out.println(line[i]);
                    num2++;
                }
            }
            System.out.println("Number of characters: " + num2 + "\n");

            sc = new Scanner(new FileInputStream("text3.txt"));
            int num3=0;
            while(sc.hasNextLine()){
                String [] line = sc.nextLine().split("; ");
                for(int i=0; i<line.length; i++){
                    System.out.println(line[i]);
                    num3++;
                }
            }
            System.out.println("Number of characters: " + num3 + "\n");

            sc = new Scanner(new FileInputStream("text4.txt"));
            String line = "";
            int num4=0;
            while(sc.hasNextLine()){
                String text = sc.nextLine();
                for(int i=0; i<text.length(); i++){
                    if(Character.isDigit(text.charAt(i)) == false) {
                        line += text.charAt(i);
                    }
                }
                num4 += line.length();
                System.out.println(line);
            }
            System.out.println("Number of characters: " + num4 + "\n");

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
