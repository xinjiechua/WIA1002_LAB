package LAB02.Q2;

/*
Create a test program that creates two instances of generic class of
type String called strObj and of type Integer called intObj. Set a
value for each of these objects. Display these values using the getter
method.
*/

public class Tester {
    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric<>();
        MyGeneric <Integer> intObj = new MyGeneric<>();

        strObj.setE("test");
        intObj.setE(123);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());

    }
}
