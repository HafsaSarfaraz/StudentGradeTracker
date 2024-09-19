import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int grade;
        System.out.println("Enter grade of student OR (-1) to Stop");
        while (true){
            grade= sc.nextInt();
            if(grade==-1){
                break;
            }

            if(grade==-1){
                break;
            }
            grades.add(grade);

            }

        if(grades.isEmpty()){
            System.out.println("No grade Enter");
        }
        else {
            double avg;
            double max;
            double min;
            int sum=0;
            for(int Grade : grades){
                sum=sum+Grade;
            }
            avg = sum/grades.size();
            System.out.println("avg Grade: " + avg);

             max = grades.get(0);
             min = grades.get(0);
            for(int Grade : grades){
                if(Grade > max){
                    max= Grade;
                }
                else if(Grade<min){
                    min=Grade;
                }

            }
            System.out.println("Maximum Grade: " + max);
            System.out.println("Minimum Grade: " + min);
        }

    }
}