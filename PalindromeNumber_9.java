class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        int a = x ;
        int sum=0;
        while(x>0){
            int b = x%10;
            sum=sum*10+b;
            x=x/10;
        }
        System.out.print(sum);
        boolean flag= false;
        if(sum==a){
            flag=true;
        }
        return flag;
    }
}