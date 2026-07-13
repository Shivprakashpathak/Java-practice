import java.util.Scanner;
class arraysearch{
    public static void main(String[] args){
        System.out.println("Enter the no.");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int arr[]= {11,21,3,43,55,63,72,86,9};
        search(arr,num2);
        
    }
    public static void search(int arr[] , int num2){

        for(int index=0;index<arr.length;index++){
            if(arr[index]==num2){
                System.out.println("founded");
                return;
            }
            
           
        }
        System.out.println("Not Found");
    }
}