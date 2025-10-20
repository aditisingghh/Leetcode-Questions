class Solution {
    public int reverse(int x) {

      long rev=0; 
      int no=x;
      
      
      while(no!=0)
      {
        int rem=0;
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;
       if(rev>=Integer.MAX_VALUE  ||rev<=Integer.MIN_VALUE )
      {
        return 0;
      }
      }
     
      
      return (int) rev;
    }
}