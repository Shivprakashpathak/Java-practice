import java.util.Scanner;
class Selection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

       

        SelectionSort(arr , n);
         for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void SelectionSort(int [] arr , int n){
        for(int i =0;i<n-1;i++){
            int mini = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }



}