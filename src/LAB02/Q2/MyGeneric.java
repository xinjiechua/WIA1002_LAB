package LAB02.Q2;

/*
Create a generic class called MyGeneric that accepts one parameter.
Declare a variable called e for the type parameter. Create a no-arg
constructor. Create a constructor that accepts one generic parameter.
Create a setter and getter method for the generic type.
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
}
