import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
           if(hm.get(nums[i]) != null){
               return true;
           }else{
               hm.put(nums[i],nums[i]);
           }
        }
        return false;      
    }
}
