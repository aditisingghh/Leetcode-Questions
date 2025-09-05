class Solution {
    public int reverse(int x) {
       
       boolean neg=x<0;
       if(neg)
       {
       x=-x;
       }

      int n=x;
      int rem=0;
      int no=0;
     // int l=x.length;
      while(n>0)
      {
        rem=n%10;
        n=n/10;
        if (no > 214748364 || no < -214748364)   // 2,147,483,647 / 10 and −2,147,483,648 / 10
            return 0;
        if (no == 214748364 && rem > 7) return 0;  // upper-boundary last digit
        if (no == -214748364 && rem < -8) return 0;
        no=no*10+rem;

      } 
     
      return neg?-no:no;
    }
}