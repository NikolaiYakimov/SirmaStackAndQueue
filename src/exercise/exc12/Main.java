package exercise.exc12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedHashMap<Character,Integer> countChar=new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)!=' '){
                countChar.put(input.charAt(i),countChar.getOrDefault(input.charAt(i),0)+1);
            }
        }

        for (Map.Entry<Character,Integer> chars:countChar.entrySet()){
            System.out.println(chars.getKey()+ " -> "+chars.getValue());

        }
    }
}
