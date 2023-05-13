package LAB05.Q2;

import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> studentList = new MyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        String student, oldName, newName;

        System.out.println("Enter your student name list. Enter 'n' to end...... ");

        do{
            student = sc.nextLine();
            if(student.equals("n")) //the loop will terminate if "n"
                break;
            studentList.add(student);
        } while(true); //continue if it is "n"

        System.out.println();
        System.out.println("You have entered the following students' name :");
        studentList.printList();

        System.out.println();
        System.out.println("The number of students entered is : " + studentList.getSize());

        System.out.println();

        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n, to proceed.");
        String changeStudent = sc.nextLine();
        System.out.println();

        if(changeStudent.equalsIgnoreCase("r")){
            System.out.println("Enter the existing student name that u want to rename : ");
            oldName = sc.nextLine();
            System.out.println();
            System.out.println("Enter the new name : ");
            newName = sc.nextLine();
            System.out.println();

            if(studentList.contains(oldName)){
                studentList.replace(oldName, newName);
                System.out.println("The new student list is : ");
                studentList.printList();
                System.out.println();
            }
            else{
                System.out.println("The student you entered is not in your current student list.");
                System.out.println();
            }
        }

        String choiceRemoveStudent;

        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        choiceRemoveStudent = sc.nextLine();
        System.out.println();

        String removeStudent;

        if(choiceRemoveStudent.equalsIgnoreCase("y")){
            System.out.println("Enter a student name to remove : ");
            removeStudent = sc.nextLine();
            System.out.println();

            if(studentList.contains(removeStudent)){
                studentList.removeElement(removeStudent);
            }
            else{
                System.out.println("Item you want to remove is not in the existing list");
            }

            System.out.println("The number of updated student is :" + studentList.getSize());
            System.out.println("The updated students list is :");
            studentList.printList();
        }
        else{
            System.out.println();
            System.out.println("The number of student is :" + studentList.getSize());
            System.out.println("You entered the following students list : ");
            studentList.printList();
        }

        sc.close();
        System.out.println();
        System.out.println("All student data captured complete. Thank you!");
    }
}
