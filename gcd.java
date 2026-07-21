import java.util.Scanner;
class gcd {
    public static void main (String[] args){
        System.out.println("Enter the Size oof the array");
        Scanner sc = new Scanner(System.in);
        int first =  sc.nextInt();
        int second = sc.nextInt();
        int gcd=gcd(first,second);
        System.out.println(gcd);

        
       
    }
    public static int gcd(int first , int second){
        int gcd = 1;
       
        int least = least(first,second);
         for(int i = 2;i<=least;i++){
            if(first%i==0&&second%i==0){
                gcd=i;
            }

         }
        return gcd;
    }
    public static int least(int first ,int second){
        if( first < second){
            return first;
        }else { 
            return second;
        }
    }

    
}