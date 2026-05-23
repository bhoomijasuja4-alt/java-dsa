public class countOccurence{

    public static void main(String args[]){


        int []arr={1,2,3,4,1,2,3,4,2,3,4,5,6,7,8,4,9,8,7,6,3,2,5};
        boolean visited[]=new boolean[arr.length];
        
        for(int i=0; i<arr.length;i++){
            if( visited[i]==true){
                continue;
            }
            int count=1;
            for(int j =i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    
                    count++;
                    visited[j]=true;

                }
            }

            System.out.println(arr[i]+" "+ count);


        }


    }
    
}