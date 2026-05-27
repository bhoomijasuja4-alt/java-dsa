public class sortSimultaneously {
    public static void main(String args[]){
        int[]arr={1,2,4,7,8,9,11,23};
        boolean ascending = true;
        boolean descending = true;
        for(int i = 0 ; i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                descending = false;
            }
            if(arr[i+1]<arr[i]){
                ascending = false;
            }
        }

        if(ascending||descending){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

    }
}
