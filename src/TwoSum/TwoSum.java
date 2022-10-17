package TwoSum;

public class TwoSum {

    static void getTargetSum(int[] arr, int target){
        int head=0;
        int tail = arr.length-1;
        int sum=0;
        boolean isTarget = false; //Adding to handle the case where target is not matched
        while(head<tail){
            sum = arr[head] + arr[tail];
            if(sum == target){
                isTarget = true;
                System.out.printf("[%d,%d], nums[%d] + nums[%d] = %d.%n", head, tail, head, tail, target);
                break;
            }else if(sum > target){
                tail-=1;
            }else{
                head+=1;
            }
        }
        if(!isTarget){
            System.out.println("Scanned the entire array, could not have a pairing which sums up to target number!");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        getTargetSum(arr, target);

        arr = new int[]{2,4,6};
        target = 8;
        getTargetSum(arr, target);

        arr = new int[]{4,4};
        target = 8;
        getTargetSum(arr, target);


        
    }
}
