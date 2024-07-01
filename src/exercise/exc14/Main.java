package exercise.exc14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Double> studentGrades=new LinkedHashMap<>();
        Map<String, ArrayList<Double>> avarageGrades=new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            avarageGrades.putIfAbsent(name,new ArrayList<>());
            avarageGrades.get(name).add(grade);
        }

        for(var entry: avarageGrades.entrySet()){
            String name=entry.getKey();
            List<Double> grades=entry.getValue();

            double averageGrade=grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            if(averageGrade>=4.50){
                studentGrades.putIfAbsent(name,averageGrade);
            }
        }

        for(var entry: studentGrades.entrySet()){

            System.out.printf("%s -> %.2f \n",entry.getKey(),entry.getValue());
        }

    }
}
