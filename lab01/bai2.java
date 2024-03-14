public class bai2 {
    static void firstDegree(double a,double b){
        if (a!=0){
            System.out.println(-b/a);
        }
        else{
            System.out.println("Error");
        }
        
    }

    static void firstDegreeLinear(double a11, double a12, double a21, double a22, double b1, double b2){
        double der = a11*b2-a21*b1;
        if (der>=0){
            System.out.println((a21*b1-a11*b2)/(a12*a21-a11*a22));
            System.out.println((a22*b1-a12*b2)/(a11*a22-a12*a21));
        }
        else{
            System.out.println("Error");
        }
    }
    static void secondDegree(double a,double b,double c){
        double delta = b*b-4*a*c;
        if (delta>=0){
            System.out.println((-b-Math.pow( delta, 0.5)/(2*a)));
            System.out.println((-b+Math.pow( delta, 0.5)/(2*a)));
        }
        else{
            System.out.println("Error");
        }
    } 
    public static void main(String[] args){
        //Enter function here
        firstDegreeLinear(1,2,3,4,5,6);
    }

}