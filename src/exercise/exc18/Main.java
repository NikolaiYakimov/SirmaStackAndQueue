package exercise.exc18;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String[] inputPlayer1=sc.nextLine().split(" ");
       String[] inputPlayer2=sc.nextLine().split(" ");

       LinkedHashSet<Integer> player1Cards=new LinkedHashSet<>();
       LinkedHashSet<Integer> player2Cards=new LinkedHashSet<>();

       for (String card:inputPlayer1){
           player1Cards.add(Integer.parseInt(card));
       }
        for (String card:inputPlayer2){
            player2Cards.add(Integer.parseInt(card));
        }

        ArrayDeque<Integer> firstPlayerDeck=new ArrayDeque<>(player1Cards);
        ArrayDeque<Integer> secondPlayerDeck=new ArrayDeque<>(player2Cards);

        //We have 50 rounds
        for (int i = 0; i < 50; i++) {
            if (firstPlayerDeck.isEmpty()||secondPlayerDeck.isEmpty()){
                break;
            }

            int firstPlayerCard=firstPlayerDeck.poll();
            int secondPlayerCard=secondPlayerDeck.poll();

            if(firstPlayerCard>secondPlayerCard){
                firstPlayerDeck.offer(firstPlayerCard);
                firstPlayerDeck.offer(secondPlayerCard);
            } else if (secondPlayerCard>firstPlayerCard) {
                secondPlayerDeck.offer(firstPlayerCard);
                secondPlayerDeck.offer(secondPlayerCard);
            }
        }

        if(firstPlayerDeck.size()>secondPlayerDeck.size()){
            System.out.println("First player wins!");
        } else if (firstPlayerDeck.size()<secondPlayerDeck.size()) {
            System.out.println("Second player wins!");
        }else {
            System.out.println("Draw");
        }
    }
}
