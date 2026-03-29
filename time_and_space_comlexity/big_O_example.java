public class big_O_example {
    public static void main(String[] args) {
        
    }

    public static int getFirstElemment(int[] arr){
        return arr[0]; // always one step regardless of size
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;                       // 
        int right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
           
        }
         return -1;
    }


    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
         return -1;
    }

    public static void printPair(int[] arr){  // O(N^2)
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.println(arr[i] + " , " + arr[j]);
            }
        }
    }

    public static int fib(int n){
        if(n <=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void permute(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
        }
    }




    
}
