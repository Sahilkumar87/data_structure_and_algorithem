public class sortedMedianArray4 {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int x = nums1.length;
        int y = nums2.length;

        int start = 0;
        int end = x;

        while(start<=end){
            int partx = (start + end)/2;
            int party = (x+y+1)/2 - partx;

            int xleft = partx == 0 ? Integer.MIN_VALUE : nums1[partx-1];
            int xright = partx == x ? Integer.MAX_VALUE : nums1[partx];
            int yleft = party == 0 ? Integer.MIN_VALUE : nums2[party-1];
            int yright = party == y ? Integer.MAX_VALUE : nums2[party];

            if(xleft<=yright && yleft<=xright){
                if((x+y)%2 == 0){
                return ((double) Math.max(xleft, yleft) + Math.min(xright, yright))/2;
            }
            
            else{
                return Math.max(xleft, yleft);
            }
        }

        else if(xleft>yright){
            end = partx-1;
        }
        else{
            start = partx+1;
        }
    }
        return 0;
    }
}
    
}
