import java.util.*;
public class CreateArray {

    public static void main(String[] args) {
        inputArray();
    }
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of elements: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
       while(i < size){
            System.out.print("Please enter element no: " + (i+1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
        
    }

        public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("please enter the number of column: ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
       while(i < rows){
        int j = 0;
        while(j < columns){
            System.out.print("Please enter element rows:"
             + (i+1) + ", column: " + (j+1) +  " : ");
            numArray[i][j] = input.nextInt();
            j++;

        }
            
            i++;
        }
        return numArray;
        
    }



    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
    
    
}


    

