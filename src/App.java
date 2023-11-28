import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("TEST MAXIMUM :\n");
        // System.out.println("Enter the 3 Strings for checking:");
        Scanner sc = new Scanner(System.in);
        
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
