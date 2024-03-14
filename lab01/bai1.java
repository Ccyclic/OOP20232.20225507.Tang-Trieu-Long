import java.util.Scanner;
public class bai1 {
    
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        double num1 = sc1.nextDouble();
        double num2 = sc1.nextDouble();
        
        System.out.println(num1+num2);
        System.out.println(Math.abs(num1-num2));
        System.out.println(num1*num2);
        if (num2==0 || num1==0){
            System.out.println("Error");
        }
        
        else{
            System.out.println(num1/num2);
        }
}
}