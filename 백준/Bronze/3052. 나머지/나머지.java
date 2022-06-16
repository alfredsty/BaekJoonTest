import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i = 0; i < 10; i++){
            a.add(sc.nextInt() % 42);
        }
        System.out.println(a.size());


    }
}