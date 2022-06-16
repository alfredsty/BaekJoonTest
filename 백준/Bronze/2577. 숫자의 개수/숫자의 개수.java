import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int Mul = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        String a = Integer.toString(Mul);
        for(int i = 0; i< a.length(); i++){
            for(int j= 0; i < 10; j++){
                if((a.charAt(i) -'0') == j){
                        ++arr[j];
                        break;
                }
            }
        }
        for(int i = 0; i< 10; i++){
            System.out.println(arr[i]);
        }
    }
}