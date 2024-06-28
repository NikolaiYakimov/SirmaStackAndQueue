package exercise.exc7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> synonyms = new LinkedHashMap<>();


        for(int i=0;i<n;i++){
            String word=scanner.nextLine();
            String synonym= scanner.nextLine();
             synonyms.putIfAbsent(word,new ArrayList<>());
             synonyms.get(word).add(synonym);
        }

        for(var entry:synonyms.entrySet()){
            String word=entry.getKey();
            ArrayList<String> synonymList=entry.getValue();

//            System.out.println(word+" - "+ synonymList.stream().map(Objects::toString).collect(Collectors.joining(",")));
              System.out.println(word+" - "+String.join(", ",synonymList));
        }
    }
}
