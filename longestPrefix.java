class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        StringBuffer buffer = new StringBuffer("");
        Arrays.sort(strs);
        char [] first = strs[0].toCharArray();
        char [] last = strs[strs.length-1].toCharArray();
        
        for(int i =0; i<first.length;i++){
            if(first[i]!=last[i]) break;
            buffer.append(first[i]);
         
        }
        return buffer.toString();
        
    }
}
