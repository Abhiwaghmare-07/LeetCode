class Solution {
    public int myAtoi(String s) {
        int i=0;
        int l=s.length();
        while(i<l && Character.isWhitespace(s.charAt(i))){
          i++;
        }
        if(i==l){
            return 0;
        }
        char sign=s.charAt(i);
        boolean negative=false;
        if(sign=='+'){
            i++;
        }
        else if(sign=='-'){
            negative=true;
            i++;
        }
        else if(!Character.isDigit(s.charAt(i))){
           return 0;
        }
         if(i==l){
            return 0;
        }
         while(i<l && s.charAt(i)=='0'){
          i++;
        }
          if(i==l){
            return 0;
        }
        long value=0;
        int max=Integer.MAX_VALUE/10;
        int min=Integer.MIN_VALUE/10;

        while(i<l && Character.isDigit(s.charAt(i))){

             int digit=s.charAt(i)-'0';
            if (value > max) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            } else if (value == max && digit > (negative ? 8 : 7)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

             
            
                 value=value*10+(digit);
           
            i++;
        }
        return negative? (int)-value:(int)value;
    }
}