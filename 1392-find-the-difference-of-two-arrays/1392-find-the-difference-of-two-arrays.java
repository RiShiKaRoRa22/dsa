import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int i=0;
        List<Integer> one= new ArrayList<>();
        List<Integer> two= new ArrayList<>();
        Set<Integer> inone= new HashSet<>();
        Set<Integer> intwo= new HashSet<>();

        for(int num: nums1){
            inone.add(num);
        }

        for(int num: nums2){
            intwo.add(num);
        }

        for(int num: inone){
            if(intwo.contains(num)==false){
                one.add(num);
            }
        }

        for(int num: intwo){
            if(inone.contains(num)==false){
                two.add(num);
            }
        }

        List<List<Integer>> res= new ArrayList<>();
        res.add(one);
        res.add(two);

        return res;

    }
}