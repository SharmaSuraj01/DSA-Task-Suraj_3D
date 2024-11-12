public class Plus_one_66 {
    // public static int[] plusOne(int[] digits) {
    //     String num="";
    //     int len = digits.length;
    //     for(int i=0;i<len;i++){
    //         num+=digits[i];
    //     }
    //     num+=1;
    //     System.out.print(num);
    //     // String s =Integer.toString(num);
    //     int arr[]=new int [num.length()];
    //     for(int i=0;i<num.length();i++){
    //         arr[i]=num.charAt(i)-'0';
    //     }
    //     return arr;
    // }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        arr=plusOne(arr);
    }
}
