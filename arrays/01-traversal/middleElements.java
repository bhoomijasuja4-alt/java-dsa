public class middleElements{
    public static void main(String args[]){
        int[]nums = { 1,2,3,4,5,6,7,8,9,10};
        if(nums.length%2!=0){

            System.out.print(nums[nums.length/2]);

        }else{
            System.out.println(nums[nums.length/2-1]);
            System.out.print(nums[nums.length/2]);
        }


    }
}