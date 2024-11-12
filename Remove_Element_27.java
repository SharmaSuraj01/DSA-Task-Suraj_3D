public class Remove_Element_27 {
    public static int removeElement(int[] arr, int val) {
        int i=0;
        int len=arr.length;
        for(int j=0;j<len;j++){
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }
        int k=0;
        for(int j=i;j<len;j++){
            arr[j]=-1;
            k++;
        }
        for(int j=0;j<len;j++){
            System.out.print(arr[j]+" ");
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int val =2;
        System.out.println(removeElement(arr,val));
    }
}
