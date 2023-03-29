package LAB02;

/* Q4 Provide a declaration and implementation of the generic method
minmax() that takes in an array of generic type and returns a string
with the following format: Min = <minValue> Max = <maxValue>. For
instance, in your main method, create one object of type array for
integers and one object of type string: */

public class MinMax {

    public static <T extends Comparable<T>> String minmax(T[]arr){
        T min = arr[0], max = arr[0];

        for(T obj : arr){
            if(obj.compareTo(min) < 0)
                min = obj;
            if(obj.compareTo(max) > 0)
                max = obj;
        }
        return "Min = " + min + "Max = " +max;
        // return String.format("Min = %s Max = %s",min,max );
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
