package 二分查找.L69的平方根;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int mySqrt(int x) {
        int l=0;
        int r=x;
        while (l<=r){
            int mid = (l+r)/2;
            int mid2= mid*mid;
            if (mid2<=x){
                if(mid2==x||(mid+1)*(mid+1)>x){
                    return mid;
                }
                l=mid+1;
            }

            if (mid2>x){
                r=mid-1;
            }

        }
        return  -1;
    }

}
