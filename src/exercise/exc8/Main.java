package exercise.exc8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] inputWords=sc.nextLine().toLowerCase().split(" ");
        Map<String,Integer> wordCount=new LinkedHashMap<>();

        for(String word:inputWords){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        StringBuilder result=new StringBuilder();
        for(var word: wordCount.entrySet()){
            if(word.getValue()%2==1){
                result.append(word.getKey()).append(", ");
            }
        }
        if(result.length()>0){
            result.setLength(result.length()-2);
        }
        System.out.println(result);
    }
}
