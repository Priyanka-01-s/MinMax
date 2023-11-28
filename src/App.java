import java.util.Scanner;

public class App {

    public static void checkLargest(String str1, String str2, String str3){
        int res1 = str1.compareTo(str2);
        int res2 = str2.compareTo(str3);
        int res3 = str3.compareTo(str1);

        if (res1 > 0 && res2 > 0) {
            System.out.println(str1 + " is greater than both " + str2 + " and " + str3);
        } else if (res2 > 0 && res3 > 0) {
            System.out.println(str2 + " is greater than both " + str1 + " and " + str3);
        } else {
            System.out.println(str3 + " is greater than both " + str1 + " and " + str2);
        }
    }
    public static void main(String[] args) {
        System.out.println("TEST MAXIMUM :\n");
        System.out.println("Enter the 3 Strings for checking:");
        Scanner sc = new Scanner(System.in);

        //use of interger onject
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        checkLargest(str1, str2, str3);               

        sc.close();
    }
}
