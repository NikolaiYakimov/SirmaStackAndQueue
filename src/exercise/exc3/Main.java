package exercise.exc3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> mapOfSymbols=new TreeMap<>();
        String input=sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            mapOfSymbols.put(input.charAt(i),mapOfSymbols.getOrDefault(input.charAt(i),0)+1);
        }

        for (var el: mapOfSymbols.entrySet()) {
            System.out.println(el.getKey()+" : "+el.getValue());
        }

    }
}
