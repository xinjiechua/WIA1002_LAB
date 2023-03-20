package LAB01;
import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        try {

            System.out.println("Input second part of letter: ");
            PrintWriter os = new PrintWriter(new FileOutputStream("ChuaXinJie_22004826.txt", true));
            Scanner sc2 = new Scanner(System.in);
            os.println();
            os.println();
            os.println(sc2.nextLine());
            os.println();
            os.println(sc2.nextLine());
            os.close();

            Scanner sc = new Scanner(new FileInputStream("ChuaXinJie_22004826.txt"));
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
