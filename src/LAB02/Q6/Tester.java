package LAB02.Q6;

/*
Create a test program that creates one instance of generic class of
type Integer called numbers with the elements: {4, 5, 6}, {1, 2, 3}.
Display the minimum and maximum elements using the min and
max methods.
*/

public class Tester {
    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Min: " + MinMaxTwoDArray.min(numbers));
        System.out.println("Min: " + MinMaxTwoDArray.max(numbers));
    }
}
