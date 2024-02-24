import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean found = false;

        for (int i = 1; i <= 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found){
            System.out.println("HE GOT AWAY!");
        }
    }
}
