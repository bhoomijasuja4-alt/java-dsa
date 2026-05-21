public class countFrequency {
    public static void main(String args[]){
        int[]arr={1,2,3,3,4,5,1,1,6,7,8,9,3,5,8,9,6,7};
        //we need memory for visited elements.
        boolean[]visited= new boolean[arr.length];

        //outer loop for selection of element 

        for(int i =0 ; i<arr.length;i++){

            if(visited[i]==true){
                continue;

            }

            int count =1 ;

            for(int j = i+1 ; j<arr.length;j++){

                if (arr[i]==arr[j]){

                    count++;
                    visited[j]=true;




                }

            }

            System.out.println( arr[i]+ " "+ count);





        }

    }
}
