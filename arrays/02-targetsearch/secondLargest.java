public class secondLargest {
    public static void main(String args[]){


        int[]arr={1,2,3,4,22,45,78,29,90,89,100,78,58,210};
        int largest;
        int secondlargest;
        if(arr[0]>arr[1]){
            largest=arr[0];
            secondlargest=arr[1];

        }else{
            largest=arr[1];
            secondlargest= arr[0];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else{if(secondlargest>arr[i] && arr[i]!=largest){
                secondlargest=arr[i];
            }

            }
        }

        System.out.print(secondlargest);

    }
}
