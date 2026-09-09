class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            for (int j = i + 1; j < pattern.length(); j++) {

                char ch1 = pattern.charAt(i);
                char ch2 = pattern.charAt(j);

                // Same character → same word
                if (ch1 == ch2) {
                    if (!words[i].equals(words[j])) {
                        return false;
                    }
                }

                // Same word → same character
                if (words[i].equals(words[j])) {
                    if (ch1 != ch2) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
