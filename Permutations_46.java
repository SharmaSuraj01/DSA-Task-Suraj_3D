/*Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:
Input: nums = [1]
Output: [[1]] */
import java.util.ArrayList;
import java.util.List;
public class Permutations_46 {
public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        gen(nums,new ArrayList<>(),ans);
        return ans;
    }
    public void gen(int [] arr,List<Integer> templist,List<List<Integer>> ans){
        if(templist.size()==arr.length){
            ans.add(new ArrayList<>(templist));
            return;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(templist.contains(arr[i])) continue;
                templist.add(arr[i]);
                gen(arr,templist,ans);
                templist.remove(templist.size()-1);
            }
        }
    }
}