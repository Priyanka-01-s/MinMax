import java.util.Scanner;

public class App {

    // Generic method that ensures T extends Comparable
    public static <T extends Comparable<T>> T Compare(T obj1, T obj2, T obj3) {
        int res1 = obj1.compareTo(obj2);
        int res2 = obj2.compareTo(obj3);
        int res3 = obj3.compareTo(obj1);

        if (res1 > 0 && res2 > 0) {
            return obj1;
        } else if (res2 > 0 && res3 > 0) {
            return obj2;
        } else {
            return obj3;
        }
    }

    public static void main(String[] args) {
        System.out.println("TEST MAXIMUM :\n");
        System.out.println("Enter the 3 Strings for checking:");
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        String maxString = Compare(str1, str2, str3);
        System.out.println("\nMAXIMUM INTEGER: " + maxString);

        System.out.println("\nEnter the 3 numbers for checking:");
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();

        Integer maxInt = Compare(num1,num2,num3);
        System.out.println("\nMAXIMUM NUMBER : " +maxInt);

        sc.close();
    }
}
