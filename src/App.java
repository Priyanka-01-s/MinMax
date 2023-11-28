import java.util.Scanner;

public class App {

    public static void checkLargest(Integer num1, Integer num2, Integer num3){
        int res1 = num1.compareTo(num2);
        int res2 = num2.compareTo(num3);
        int res3 = num3.compareTo(num1);

        if (res1 > 0 && res2 > 0) {
            System.out.println(num1 + " is greater than both " + num2 + " and " + num3);
        } else if (res2 > 0 && res3 > 0) {
            System.out.println(num2 + " is greater than both " + num1 + " and " + num3);
        } else {
            System.out.println(num3 + " is greater than both " + num1 + " and " + num2);
        }
    }
    public static void main(String[] args) {
        System.out.println("TEST MAXIMUM :\n");
        System.out.println("Enter the 3 numbers for checking:");
        Scanner sc = new Scanner(System.in);

        //use of interger onject
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();

        checkLargest(num1, num2, num3);               

        sc.close();
    }
}
