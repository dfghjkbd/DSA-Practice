 int lowerBound(int[] arr, int target) {
        int m=arr.length;
        int low=0;
        int high=m-1;
        int ans=m-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
               high=mid-1; 
            }
            else
            low=mid+1;
            
        }
        if(arr[m-1]<target){
            return m;
        }
        return ans;
    }