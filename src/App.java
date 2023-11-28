import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("TEST MAXIMUM :\n");
        // System.out.println("Enter the 3 Strings for checking:");
        Scanner sc = new Scanner(System.in);

        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();
        // String str3 = sc.nextLine();

        // GenericMax<String> maxString = new GenericMax<>(str1, str2, str3);
        // maxString.testMax();

        // System.out.println("\nEnter the 3 numbers for checking:");
        // Integer num1 = sc.nextInt();
        // Integer num2 = sc.nextInt();
        // Integer num3 = sc.nextInt();
        // GenericMax<Integer> maxNum = new GenericMax<>(num1, num2, num3);
        // maxNum.testMax();  
        
        System.out.println("Enter the numver of elements :");
        int n = sc.nextInt();

        Integer[] intArr = new Integer[n];

        for(int i =0;i<n;i++){
            System.out.println("Enter element "+ (i+1));
            intArr[i]=sc.nextInt();
        }

        GenericMax<Integer> maxFind = new GenericMax<>(intArr);
        maxFind.testMax();

        sc.close();
    }
}
