
public class Remove_Duplicates_from_Sorted_Array_26 extends Array{
    public static int removeDuplicates(int[] arr) {
        int currentEl= 0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[currentEl]!=arr[i]){
                arr[currentEl+1]=arr[i];
                currentEl+=1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Array array =new Array();
        int arr[]=array.input();
        int count = removeDuplicates(arr);
        System.out.println(count);
    }
}
