public class checkSort {
    public static void main(String args[]){

        int[]arr={1,3,4,7,2,10};
        boolean sorted = true;
        
        for(int i =0; i<arr.length-1;i++){
            
            if(arr[i+1]>arr[i]){
                sorted=true;
                
                
            }else{
                sorted = false;
                break;
               
            } 
            
            
            
        }
        if(sorted==true){
            System.out.println("array is sorted");
        }
        if(sorted==false){
            System.out.println("array is not sorted ");
        }
       
            

            
    
        
    }  
}
