package exercise.exc5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Set<String>> players=new LinkedHashMap<>();

        while(true){
            String[] input=scanner.nextLine().split(": ");
            if(input[0].equalsIgnoreCase("joker"))
                break;
            String name=input[0];
            String[] cards=input[1].split(", ");

            players.putIfAbsent(name,new HashSet<>());
            for(String card:cards){
                players.get(name).add(card);
            }
        }
        for(var player:players.entrySet()){
            String name=player.getKey();
            Set<String> cards=player.getValue();
            int totalValueOfCards =0;

            for (String card:cards){
                totalValueOfCards+=getCardValue(card);
            }
            System.out.println(name+": "+ totalValueOfCards);
        }

    }

    private static int getCardValue(String card){
        String power=card.substring(0,card.length()-1);
        char type=card.charAt(card.length()-1);

        int powerValue=switch (power){
            case"J"->11;
            case"Q"->12;
            case"K"->13;
            case"A"->14;
            default -> Integer.parseInt(power);
        };
        int typeValue=switch (type){
            case'S'->4;
            case'H'->3;
            case'D'->2;
            case'C'->1;
            default -> 0;
        };
        return powerValue*typeValue;
    }
}
