package LAB02.Q6;
/*
In a class called MinMaxTwoDArray, write two generic methods:

a. First method returns the minimum element in a two-dimensional
array. Below is the method signature:
public static <E extends Comparable<E>> E min(E[][] list)

b. Second method returns the maximum element in a two-dimensional
array. Below is the method signature:
public static <E extends Comparable<E>> E max(E[][] list)
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
        for(E[] row : list){
            for(E obj : row){
                if(obj.compareTo(max) < 0)
                    max = obj;
            }
        }
        return max;
    }
}
