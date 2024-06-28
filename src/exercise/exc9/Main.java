package exercise.exc9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] inputData=scanner.nextLine().split(" ");
        Map<String,Integer> wordFilter=new LinkedHashMap<>();
        //First-Way
//        for(var word: inputData){
//
//            wordFilter.putIfAbsent(word,word.length());
//        }
//        for(var entry:wordFilter.entrySet()){
//            if(entry.getValue()%2==0){
//                System.out.println(entry.getKey());
//            }
//        }
        //SecondWay

        for(String word:inputData){
            if(word.length()%2==0){
                wordFilter.put(word,word.length());
            }
        }
        for (String word:wordFilter.keySet()){
            System.out.println(word);
        }
    }
}
