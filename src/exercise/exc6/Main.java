package exercise.exc6;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String, Map<String,Integer>> countries=new HashMap<>();
        Map<String ,Integer> countryPopulation=new LinkedHashMap<>();
        String line= scanner.nextLine();
        while(!line.equalsIgnoreCase("report")){
            String[] data=line.split("\\|");
            String town=data[0];
            String country=data[1];
            int population=Integer.parseInt(data[2]);

            countries.putIfAbsent(country,new LinkedHashMap<>());
            countries.get(country).putIfAbsent(town,population);
            countryPopulation.put(country,countryPopulation.getOrDefault(country,0)+population);

            line=scanner.nextLine();
        }

        List<Map.Entry<String,Integer>> sortedCountries=new ArrayList<>(countryPopulation.entrySet());
        sortedCountries.sort((a,b)->b.getValue().compareTo(a.getValue()));


        for(var counrty:sortedCountries){
            String country=counrty.getKey();
            int totalPopulation=counrty.getValue();
            System.out.println(country + " (total population: " + totalPopulation + ")");

            countries.get(country).entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(cityEntry -> {
                        System.out.println("=>" + cityEntry.getKey() + ": " + cityEntry.getValue());
                    });
        }
    }
}
