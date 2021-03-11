import java.util.Scanner;
 
public class SelectionSort 
{
    public static void sort( int arr[] ){
        int N = arr.length;
        int i, j, position, temp;
        for (i = 0; i < N-1; i++)
        {
            position = i;
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[position])
                {
                    position = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[position];
            arr[position]= temp;            
        }        
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );
        int n, i;

        System.out.println("Enter number of integer elements");
        n = scan.nextInt();

        int arr[] = new int[ n ];

        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        sort(arr);

        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }
 
}
