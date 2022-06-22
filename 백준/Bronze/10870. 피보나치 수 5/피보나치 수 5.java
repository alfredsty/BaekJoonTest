import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1]; 

        for(int i=0; i<arr.length; i++) {
            if(i==0) {
                arr[0] = 0;
            }
            else if(i==1) {
                arr[1] = 1;
            }
            else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        System.out.println(arr[n]);
    }
}
