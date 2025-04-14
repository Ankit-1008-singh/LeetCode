public class problem278 {
    public boolean isBadVersion(int n){
        //it is given 
    }
    public int firstBadVersion(int n) {
        int ans=n;
        int start=1;
        int end=n;
        while(start<=end){
         int mid=start + (end-start)/2;
         if(isBadVersion(mid)){
             ans=mid;
             end=mid-1;
         }else{
             start=mid+1;
         }
        }
         return ans;
     }
}
