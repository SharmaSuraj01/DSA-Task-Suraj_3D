public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        // boolean flag = false;
        return powerOf4(n);
    }
    public static boolean powerOf4(float n){
        if(n<1){
            // System.out.println("first if");
            return false;
        }
        if(n==1){
            // System.out.println("second if");
            // f=true;
            return true;
        }
        n=n/4;
        boolean flag = powerOf4(n);
        // System.out.println(n);
        return flag;
    }
    public static void main(String [] args ){
        System.out.print(isPowerOfFour(16));
    }
}
// public class PowerOfFour {
//     public static boolean isPowerOfFour(int n) {
//         boolean flag = false;
//         while(n>=1){
//         if(n<1){
//             break;
//         }
//         else if(n==1){
//             flag = true;
//             break;
//         }
//         n=n/4;
//     }
//     return flag;
// }
//     public static void main(String [] args ){
//         System.out.print(isPowerOfFour(16));
//     }
    
// }
