class Solution {
    public String reverseWords(String s) {
        String[] reverseArray = s.split(" ");

        for (int i = 0; i < reverseArray.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = reverseArray[i].length() - 1; j >= 0; j--) {
                reversedWord.append(reverseArray[i].charAt(j));
            }
            reverseArray[i] = reversedWord.toString();
        }
        return String.join(" ",reverseArray);
    }
}
