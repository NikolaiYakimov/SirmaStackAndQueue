package exercise.exc10;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,LinkedHashMap<String, HashSet<String>>> continents=new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            String[] inputData=sc.nextLine().split(" ");
            String continent=inputData[0];
            String country=inputData[1];
            String city=inputData[2];

            continents.putIfAbsent(continent,new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country,new HashSet<>());
            continents.get(continent).get(country).add(city);
        }

        for(var entry:continents.entrySet()){
            String continent=entry.getKey();
            LinkedHashMap<String,HashSet<String>> countryMap=entry.getValue();

            System.out.println(continent+": ");
            for(var coutryEntrys:countryMap.entrySet()){
                String country=coutryEntrys.getKey();
                HashSet<String> cities=coutryEntrys.getValue();

                System.out.print(country+" -> ");
                System.out.println(String.join(", ",cities));
            }

        }

    }
}
