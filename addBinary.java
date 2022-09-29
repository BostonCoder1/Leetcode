class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        String ans = "";
        int sum = 0;
        int carry = 0;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(i >= 0)sum += a.charAt(i)-'0';
            if(j >= 0)sum += b.charAt(j)-'0';
            
           ans = ((char)sum % 2)+ ans ;
            carry = sum/2;
            i--;
            j--;
        }
        if(carry > 0){
          ans = carry + ans;
        }
        return ans;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.addBinary("11","1"));
	}
}
