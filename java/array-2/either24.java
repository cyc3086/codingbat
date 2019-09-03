/*
* Given an array of ints, return true if the array contains 
* a 2 next to a 2 or a 4 next to a 4, but not both.
*/

public boolean either24(int[] nums) {
  int count2 = 0;
  int count4 = 0;
  
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 2 && nums[i+1] == 2)
      count2++;
    if(nums[i] == 4 && nums[i+1] == 4)
      count4++;
  }
  if(count2 > 0 && count4 > 0)
    return false;
  if(count2 > 0 || count4 > 0)
    return true;
  return false;
}
