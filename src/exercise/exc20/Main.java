package exercise.exc20;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstSet=new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet=new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < m; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        firstSet.retainAll(secondSet);

        for(int num:firstSet){
            System.out.println(num);
        }

    }
}
