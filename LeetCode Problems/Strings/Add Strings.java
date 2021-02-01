class Solution {
    public String addStrings(String num1, String num2) {  int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int n1 = 0, n2 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0'; 
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        
        if (carry != 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
//         StringBuilder result = new StringBuilder();

//         int carry = 0;
//         int s1 = num1.length() - 1;
//         int s2 = num2.length() - 1;
//         while (s1 >= 0 || s2 >= 0) {
//             int n1 = 0, n2 = 0;
//             if (s1 >= 0) {
//                 n1 = num1.charAt(s1) - '0';
//             }
//             if (s2 >= 0) {
//                 n2 = num1.charAt(s2) - '0';
//             }
//             int sum = n1 + n2 + carry;
//             carry = sum / 10;
//             result.append(sum % 10);
//             s1--;
//             s2--;        
//         }
        
//         if (carry != 0) {
//             result.append(carry);
//         }
        
//         return result.reverse().toString();
    }
                  
}