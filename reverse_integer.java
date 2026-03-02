import java.util.*;
class Solution {
    public int reverse( int x) {
        long r=0;
        while(x!=0){
            r=r*10+x%10;
            x=x/10;
        }
    if(r >(Math.pow(2,31)-1) || r < Math.pow(-2,31)) return 0;
    return (int)r;    
        
    }
}
class reverse_integer{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter no.");
      int a = s.nextInt();
      Solution f = new Solution();
      System.out.println(f.reverse(a));
    }
}
