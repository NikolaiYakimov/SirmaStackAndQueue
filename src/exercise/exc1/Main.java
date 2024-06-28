package exercise.exc1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String[] input=sc.nextLine().split(" ");
       Map<Double,Integer> realNumberCount=new LinkedHashMap<>();

       for(var number: input){
           double num=Math.round(Double.parseDouble(number)*10)/10.0;

           realNumberCount.put(num,realNumberCount.getOrDefault(num,0)+1);
       }

       for(var entry:realNumberCount.entrySet()){
           System.out.println(STR."\{entry.getKey()} -> \{entry.getValue()}");
       }

    }
}
