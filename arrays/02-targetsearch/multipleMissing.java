public class multipleMissing {
    public static void main(String args[]){
        int[]arr={1,3,5,8};
        for(int i=1;i<11;i++){
            boolean found = false;
            for(int j =0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
                
                
                
            }
            if(found==false){
                System.out.println("missing num is "+i);hg
            }
            
            
        }
        
    }
}
