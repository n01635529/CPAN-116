public class test {
 
    public static void main(String[] args) {
            int a = 5; 
            int b = 2;
            System.out.println("multiply result:"+ multiply(add(a,b),5));
    }
 
    public static int multiply(int x, int y) {
        return x*y;
    }
    
    public static int add(int x, int y) {
        return x+y;
    }
}