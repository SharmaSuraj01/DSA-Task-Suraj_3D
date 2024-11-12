/*Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:
Input: s = "a"
Output: [["a"]]
 */

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_131 {
 public List<List<String>> partition(String st) {
       List<List<String>> ls = new ArrayList<>();
        allPartition(ls,new ArrayList<>(),st);
        return ls;
    }

    private static void allPartition(List<List<String>> ls, ArrayList<String> tempList, String st) {
        if(st.length()==0){
            ls.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<st.length();i++){
            if(isPalindrome(st.substring(0,i+1))){
                tempList.add(st.substring(0,i+1));
                allPartition(ls,tempList,st.substring(i+1));
                tempList.remove(tempList.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String st){
        int i = 0;
        int j = st.length()-1;
        while(i<=j){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
