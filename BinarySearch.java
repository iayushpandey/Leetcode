class BinarySearch{
    public int search(int[] nums, int target) {
        int st=0;
        int en=nums.length-1;
        while(st<=en){
           int mid= (st+en)/2;
            if(target>nums[mid]){
                st=mid+1;
            }else if(target<nums[mid]){
                en=mid-1;
            }else{
               return mid;
            }
        }
        return -1;
    }
}