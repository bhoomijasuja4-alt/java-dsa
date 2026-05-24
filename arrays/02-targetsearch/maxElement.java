public class maxElement {

    public static void main(String args[]){

        int[]arr={1,2,4,6,8,12,4,9,8};
        int tallest=arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>tallest){
                tallest=arr[i];
                
            }
            

            
        }
        System.out.print(tallest);
    }
    
}
