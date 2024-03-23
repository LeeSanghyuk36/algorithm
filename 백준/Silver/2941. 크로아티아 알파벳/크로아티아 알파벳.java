import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cAlphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String croatian = br.readLine();


        for (String alphabet : cAlphabet) {
            croatian = croatian.replace(alphabet, " ");
        }
        int cnt = croatian.length();

        System.out.println(cnt);

    }
}
