/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class Product_of_Array_Except_Self_238 {
    public int[] productExceptSelf1(int[] nums) {
        int len=nums.length;
        int prefixproduct[] =new int [len];
        int suffixproduct[] =new int [len];
        prefixproduct[0]=1;
        suffixproduct[len-1]=1;
        prefixproduct[len-1]=1;
        for(int i=1;i<len;i++){
            prefixproduct[i]=nums[i-1]*prefixproduct[i-1];
        }
        for(int i=len-2;i>=0;i--){
            suffixproduct[i]=nums[i+1]*suffixproduct[i+1];
        }
        int ans[]=new int[len];
        for(int i=0;i<len;i++){
            ans[i]= prefixproduct[i]*suffixproduct[i];
        }
        return ans;
    }
    public int[] productExceptSelf2(int[] nums) {
        int len=nums.length;
        int ans[]=new int [len];
        ans[0]=1;
        for(int i=1;i<len;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int right=1;
        for(int i=len-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*nums[i];
        }
        return ans;
    }
}