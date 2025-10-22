class Solution {
    public boolean isPalindrome(int x) {
       int n=x;
       int y=0;
       if(n<0)
       {
        return false;
       }
       while(n!=0)
       {
        int rem=n%10;
        y=y*10+rem;
        n=n/10;

       }
       if(y==x)
       {
        return true;
       }
       return false;
    }
}