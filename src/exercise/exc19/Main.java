package exercise.exc19;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames=new LinkedHashSet<>();
        String input;
        for (int i = 0; i < n; i++) {
            input=scanner.nextLine();
            usernames.add(input);
        }
        for (String username:usernames){
            System.out.println(username);
        }

    }
}
