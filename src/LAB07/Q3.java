package LAB07;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyQueue<Integer> shareQ = new MyQueue<>();
        MyQueue<Integer> priceQ = new MyQueue<>();
        int totalCapitalGL = 0;
        while(true){
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String tempInput = in.nextLine();
            if (tempInput.equals("")) {
                System.out.println("Final Capital Gain / Loss: " + totalCapitalGL);
                break;
            }
            String[] input = tempInput.split(" ");
            String priceStr = input[4].substring(1,input[4].length());
            int num = Integer.parseInt(input[1]);
            int price = Integer.parseInt(priceStr);
            if (input[0].equals("Buy")){
                System.out.println("Buying now...");
                shareQ.enqueue(num);
                priceQ.enqueue(price);
            }
            else if(input[0].equals("Sell")){
                System.out.println("Selling the shares now...");
                while (num > 0){
                    int balance = shareQ.peek() - num;
                    if (balance > 0){
                       // shareQ.setFirstElement(balance);
                        totalCapitalGL += (num * price) - (num * priceQ.peek());
                        num = 0;
                    } else {
                        totalCapitalGL += (shareQ.peek() * price) - (shareQ.peek() * priceQ.peek());
                        num -= shareQ.peek();
                        shareQ.dequeue();
                        priceQ.dequeue();
                    }
                    System.out.println("Total Capital Gain / Loss: " + totalCapitalGL);
                    if (shareQ.isEmpty()){
                        System.out.println("No shares to sell!");
                        break;
                    }
                }
            }
            System.out.println("Queue for Share: " + shareQ.toString());
            System.out.println("Queue for Price: " + priceQ.toString());
        }
    }
}
