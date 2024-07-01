package exercise.exc21;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Set<String> periodicTable=new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input=scanner.nextLine().split(" ");
            periodicTable.addAll(List.of(input));
        }

        for(String elements:periodicTable){
            System.out.print(elements+ " ");
        }
    }
}
