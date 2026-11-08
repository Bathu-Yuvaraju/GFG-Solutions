
class Solution {
    static String decodedString(String s) {
        java.util.Stack<Integer> countStack = new java.util.Stack<>();
        java.util.Stack<StringBuilder> stringStack = new java.util.Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decodedSubstring = stringStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    decodedSubstring.append(currentString);
                }
                currentString = decodedSubstring;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}