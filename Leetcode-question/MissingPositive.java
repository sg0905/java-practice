public class MissingPositive {
    public static void main(String args[]){
        int ar[] = {1,2,6,3,5,4};
        MissingPositive obj = new MissingPositive();
        System.out.println(obj.firstMissingPositive(ar));
        //firstMissingPositive(ar);
    }

    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]> 0){
                if(min > nums[i]){
                    min = nums[i];
                }
                if (max < nums[i]){
                    max = nums[i];
                }
            } else if(nums[i]<= 0) {
                continue;
            }
        }
        System.out.println("min: " + min + " max :" +max );
        if(min != 1){
            return 1; 
            
        }
        

        if(min <= max){
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i]!= min){
                    return min; 
                }
                else{
                    min = min + 1;
                }
            }
        }
        return max+1;
        
              
    }
}
