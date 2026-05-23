public class lastOccur {
    public static void main(String args[]){
        int[]arr={1,2,3,4,5,6,2,3,4,2,3,4,5,6,7,8,8,2,4};
        int lastindex = -1;
        int target = 4;
        for(int i =0; i<arr.length;i++){
            if (arr[i]==target){
                lastindex=i;

            }

            




        }

        System.out.print(lastindex);

    }
}
