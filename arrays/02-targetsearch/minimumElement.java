public class minimumElement {
    public static void main(String args[]){
        int[]arr={1,2,3,4,7,2,3,12,34,5,60,0,3};
        int small= arr[0];
        for(int i =0 ; i<arr.length;i++){
            if ( arr[i]<small){
                small= arr[i];
            }
        }
        System.out.print(small);
    }
}
