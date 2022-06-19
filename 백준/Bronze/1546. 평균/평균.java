import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        float[] record = new float[s];
        String[] a = br.readLine().split(" ");

        float max = 0;
        float avg = 0;

        for (int i = 0; i < record.length; i++) {
            record[i] = Integer.parseInt(a[i]);
            if (record[i] > max) {
                max = record[i];
            }
        }
        for (int i = 0; i < record.length; i++) {
            avg += (record[i]/max*100)/s;
        }
        bw.write(String.valueOf(avg));
        bw.flush();
    }
}