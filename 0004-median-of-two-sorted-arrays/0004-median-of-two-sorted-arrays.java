class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]= new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;

            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int mid=0;


        if(arr.length%2!=0){
            mid=arr.length/2;
            return (double)arr[mid];

        }
        else{
            mid= arr.length/2;
            int mid1= (arr.length-1)/2;
            return (double)(arr[mid]+arr[mid1])/2;
        }
        
    }
}