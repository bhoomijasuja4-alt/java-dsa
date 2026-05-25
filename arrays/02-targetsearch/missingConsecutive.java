public class missingConsecutive {
    public static void main(String args[]){


        int[]arr={1,2,4,5};
        
        
        
        for( int i=0;i<arr.length;i++){
            
            
            if(arr[i]!=i+1){
                
                System.out.println("missing num is"+" "+(i+1));
                break;
            }
            

        }

        

        
    }
}
