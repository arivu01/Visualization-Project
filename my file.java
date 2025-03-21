package Error;

public class Bisection_Method {

    public static double v,t;
    public static void main(String[] args) {
        System.out.println(root(2,3));

    }
    public static double func(double x){
        return Math.pow(x,3)-4*x-9;
    }

    public static double root(double a,double b){
        return root(a,b,0,10);
    }
    private static double root(double a,double b,int count,int last){
        if(count==9){
            t=a;
            v=b;
        }
        if(count==last){
            if(a==t){
                return b;
            }
            else{
                return a;
            }
        }
        double c=(a+b)/2;
        if(func(c)<0){
            return root(c,b,count+1,last);
        }
        if(func(c)>0){
            return root(a,c,count+1,last);
        }
        return c;
    }
}
