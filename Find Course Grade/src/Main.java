import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Please Enter Your First Course");
        int course1 = read.nextInt();
        System.out.println("Please Enter Your First Course");
        int course2 = read.nextInt();
        System.out.println("Please Enter Your First Course");
        int course3 = read.nextInt();
        System.out.println("Please Enter Your First Course");
        int course4 = read.nextInt();
        System.out.println("Please Enter Your First Course");
        int course5 = read.nextInt();
        int total = (course1+course2+course3+course4+course5)/5;
        System.out.println("Your Total Grade is:" + total);
        if(total >=90){
            System.out.println("Your Grade is A");
        }else if(total >= 70 && total <=80){
            System.out.println("Your Grade is B");
        }else if(total >= 60 && total <=70){
            System.out.println("Your Grade is C");
        }else{
            System.out.println("You Failed");
        }
    }
}