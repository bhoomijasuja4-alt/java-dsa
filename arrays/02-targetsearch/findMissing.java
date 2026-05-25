public class findMissing {
    public static void main(String args[]){
        int n = 5;
        

        int[] arr={1,5,4,2};

        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int j =0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;

                }




                
            }

            if(found==false){
                System.out.print("missing num is" +" "+i);
                break;
            }
            
        }

        

    }
}
