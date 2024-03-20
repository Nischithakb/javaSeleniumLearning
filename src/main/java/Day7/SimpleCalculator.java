package Day7;

import java.util.Scanner;

public class SimpleCalculator {
    int result;
    static SimpleCalculator simplecalc= new SimpleCalculator();
    public int Addition(int num1,int num2){
        result=num1+num2;
        return result;
    }
    public int Subtraction(int num1,int num2){
        result=num1-num2;
        return result;
    }

    public double Multiplication(double num1,double num2){
        double result=num1*num2;
        return result;
    }

    public double Division(double num1,double num2){
        double result=num1/num2;
        return result;
    }
    public int Addition(int num1,int num2,int num3){
        result=num1+num2+num3;
        return result;
    }

    public double Subtraction(double num1,int num2){
        double result=num1-num2;
        return result;
    }

    public static void main(String[] args){
        Scanner SC= new Scanner(System.in);
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("Enter user input:");
        int UserInput= SC.nextInt();
        int Input1=SC.nextInt();
        int Input2=SC.nextInt();
        double DInput1=SC.nextDouble();
        double DInput2=SC.nextDouble();
        SC.close();

        switch (UserInput){

            case 1:
                System.out.println(simplecalc.Addition(Input1,Input2));
                break;
            case 2:
                System.out.println(simplecalc.Subtraction(Input1,Input2));
                break;
            case 3:
                System.out.println(simplecalc.Multiplication(DInput1,DInput2));
                break;
            case 4:
                if(DInput2==0){
                    System.out.println("Invalid input");
                }
                else {
                    System.out.println(simplecalc.Division(DInput1, DInput2));
                }
                break;
        }
    }
}
