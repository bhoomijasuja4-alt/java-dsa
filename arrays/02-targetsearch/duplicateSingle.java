public class duplicateSingle {
    public static void main(String args[]){

        int[]arr={1,2,3,4,3,5,6,3,7};
        boolean[]visited=new boolean[arr.length];
        
        for(int i =0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(visited[i]==true){
                    continue;
                }
                if(arr[i]==arr[j]){
                    
                    count++;
                    visited[j] = true;


                }
                
                

            }

            if(count>1){
                System.out.println("there are"+" "+count+""+"duplicates of "+" "+arr[i] );
            }
        }



    }
}
