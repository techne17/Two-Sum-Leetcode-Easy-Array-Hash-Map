class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        int a[]=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(target-nums[i]))
            {
                a[0]=h.get(target-nums[i]);
                a[1]=i;
                return a;
            }
            h.put(nums[i],i);
        }
        return a;
    }
}


// Time Complexity - O(n)
