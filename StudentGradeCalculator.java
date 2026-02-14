import java.util.*;
public class StudentGradeCalculator{
    static final int MAX_SUBJECTS=6;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char choice;
        do{
            caluclateGrades(sc);
            System.out.println("Do you want clauclate a another student grade (y/n): ");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
            sc.close();
    }
    private static void caluclateGrades(Scanner sc) {
        int totalmarks=0;
        System.out.println("Enter marks for "+MAX_SUBJECTS+" subjects:");
        for(int i=1;i<=MAX_SUBJECTS;i++){
            System.out.print("subject "+i+" :");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        double percentage=(totalmarks/(MAX_SUBJECTS*100.0))*100;
        System.out.println("Total Marks: "+totalmarks+"/"+(MAX_SUBJECTS*100));
        System.out.printf("percentage: %.2f%%\n",percentage);
        if(percentage>=90){
            System.out.println("Grade: A");
        }else if(percentage>=80){
            System.out.println("Grade: B");
        }else if(percentage>=70){
            System.out.println("Grade: C");
        }else if(percentage>=60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }
    
}