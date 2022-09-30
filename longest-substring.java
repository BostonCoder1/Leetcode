public class Solution {
   public int lengthOfLongestSubstring(String s) {
		HashSet<Character> st = new HashSet<>();
		int i = 0, j = 0, max = 0;
		// remove all the charachet until we dont have duplicate character and add the
		// character in the hasSet.
		while (j < s.length()) {

			if (!st.contains(s.charAt(j))) {
				st.add(s.charAt(j));
				j++;
				if (st.size() > max) {

					max = st.size();
				}
			} else {
				st.remove(s.charAt(i));
				i++;
			}
		}

		return max;
	}

}

