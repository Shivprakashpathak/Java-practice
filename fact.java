public class fact {
    static int fact(int n){
        if (n == 0 || n ==1){
            return  1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Shiv prakash pathak \n22scse1040189");
        int s = 5;
        int h = fact(s);
        System.out.format("The fact of %d is: %d",s,h);
    }
}
