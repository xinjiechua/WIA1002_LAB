package LAB02;

/*
Create a generic class called MyGeneric that accepts one parameter.
Declare a variable called e for the type parameter. Create a no-arg
constructor. Create a constructor that accepts one generic parameter.
Create a setter and getter method for the generic type.

Create a test program that creates two instances of generic class of
type String called strObj and of type Integer called intObj. Set a
value for each of these objects. Display these values using the getter
method.
*/

public class MyGeneric <E> {
    private E e;

    public MyGeneric(){

    }

    public MyGeneric(E e){
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric<>();
        MyGeneric <Integer> intObj = new MyGeneric<>();

        strObj.setE("test");
        intObj.setE(123);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());

    }
}
