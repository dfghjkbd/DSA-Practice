public int[] twoSum(int[] nums, int target) {
        int[] a2= new int[2];
        HashMap<Integer,Integer> hp1=new HashMap<>();
        hp1.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int a=target-nums[i];
            if(hp1.containsKey(a)){
                a2= new int[]{hp1.get(a),i};
                return a2;
            }
            hp1.put(nums[i],i);
        }
       return a2; 
    }