import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < t; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26];
            
            boolean isGroupWord = true;
            char prev = word.charAt(0);
            visited[prev - 'a'] = true;
            for (int j = 1; j < word.length(); j++) {
                char current = word.charAt(j);
                if (prev != current && visited[current - 'a']) {
                    isGroupWord = false;
                    break;
                }
                visited[current - 'a'] = true;
                prev = current;
            }
            if (isGroupWord) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
