package test;

public class test {  
    public static void main(String args[]) {  
        System.out.println(test.f(2, 1));
    }  
    
    public static int f(int m,int n){
        
        if(m==0){
            return n+1;
        }
        if(n==0){
            f(m-1,1);
        }
        return f(m,f(m,n-1));
    }
} 