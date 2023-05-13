package LAB05.SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String>list = new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        System.out.println("The removed word is " + list.removeInitial());
        System.out.println("Does the list contain the word 'difficult'? " + list.contains("difficult"));
        list.clear();
    }
}
