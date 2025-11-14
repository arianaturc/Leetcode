package Add_Binary_67;

/// take each character and convert to a number
/// add the numbers into sum variable
/// sum % 2 will be appended to the res
///  1 + 1 = 2 => res <= 1
/// carry will be sum / 2
/// 1 + 1 = 2 => carry = 2 / 2 = 1

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int n = a.length() - 1;
        int m  = b.length() - 1;
        int carry = 0;

      while(n >= 0 || m >= 0){
          int sum = carry;

          if(n >= 0)
              sum += a.charAt(n--) - '0';
          if(m >= 0)
              sum += b.charAt(m--) - '0';

          res.append(sum % 2);
          carry = sum / 2;

      }
      if(carry != 0)
          res.append(carry);
      return res.reverse().toString();
    }
}
