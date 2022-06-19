import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int testcase = Integer.parseInt(br.readLine());
       int  a = 0,b = 0;
       String[] arr = new String[testcase];

       for(int i =0; i< testcase; i++){
           arr[i] = br.readLine();
       }
       for(int i = 0; i< testcase; i++) {
           a = 0;
           b = 0;
           for (int j = 0; j < arr[i].length(); j++) {
               if (arr[i].charAt(j) == 'O') {
                   b++;

               }
               else {
                   b =0;
               }
               a += b;
           }
           bw.write(String.valueOf(a) +"\n");
       }
       bw.flush();


    }
}