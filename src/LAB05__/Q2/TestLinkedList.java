package LAB05__.Q2;

import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String input;
        while (!(input = sc.nextLine()).equals("n"))
            list.add(input);
        System.out.println();

        System.out.println("You have entered the following students' name :");
        list.printList();
        System.out.println();

        System.out.println("The number of students entered is : " + list.getSize());
        System.out.println();

        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        input = sc.nextLine();
        System.out.println();

        if (input.equals("r")) {
            System.out.println("Enter the existing student name that u want to rename : ");
            String oldName = sc.nextLine();
            System.out.println();
            System.out.println("Enter the new name : ");
            String newName = sc.nextLine();
            System.out.println();
            list.replace(oldName, newName);
            System.out.println("The new student list is : ");
            list.printList();
            System.out.println();
        }

        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        input = sc.nextLine();
        System.out.println();

        if (input.equals("y")) {
            System.out.println("Enter a student name to remove :");
            String name = sc.nextLine();
            list.removeElement(name);
            System.out.println();

            System.out.println("The number of updated student is : " + list.getSize());
            System.out.println("The updated students list is :");
            list.printList();
            System.out.println();
        }

        System.out.println("All student data captured complete. Thank you!");
    }
}
