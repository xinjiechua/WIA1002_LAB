package LAB02;
/*
Q6 In a class called MinMaxTwoDArray, write two generic methods:

a. First method returns the minimum element in a two-dimensional
array. Below is the method signature:
public static <E extends Comparable<E>> E min(E[][] list)

b. Second method returns the maximum element in a two-dimensional
array. Below is the method signature:
public static <E extends Comparable<E>> E max(E[][] list)

Create a test program that creates one instance of generic class of
type Integer called numbers with the elements: {4, 5, 6}, {1, 2, 3}.
Display the minimum and maximum elements using the min and
max methods.
*/
public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        for(E[] row : list){
            for(E obj : row){
                if(obj.compareTo(min) < 0)
                    min = obj;
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for(E[] row : list){   //for(int i=0; i<list.length; i++)
            for(E obj : row){   //for(int j=0; j<list[i].length; j++)
                if(obj.compareTo(max) < 0)
                    max = obj;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Min: " + min(numbers));
        System.out.println("Min: " + max(numbers));
    }
}
