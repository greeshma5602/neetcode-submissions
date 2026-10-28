class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap();
        for(int i=0;i<nums.length;i++)
        {
          
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(Map.Entry<Integer, Integer> s:map.entrySet())
        {
            int key=s.getKey();
           int frequency=s.getValue();
           if(bucket[frequency]==null)
           bucket[frequency]=new ArrayList();
           bucket[frequency].add(key);
        }
        int[] list=new int[k];
        int f=0;
        for(int i=bucket.length-1;i>=0 && f < k;i--)
        {
            if(bucket[i]!=null)
            {
                for(int h:bucket[i])
                {
                    list[f++]=h;
                    if(f == k) {
                        return list;
                    }
                }

            }
        }
        return list;
        
    }
}
