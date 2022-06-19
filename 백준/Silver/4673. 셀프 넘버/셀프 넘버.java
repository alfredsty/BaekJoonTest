public class Main {
    public static int d(int a) {
        int sum=a;
        while(a!=0) {
            sum += a%10;
            a/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for(int i=1;i<=10000;i++) {
            int n=d(i);
            if(n<=10000) {
                arr[n]=true;
            }
        }
        for(int i=1;i<=10000;i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
