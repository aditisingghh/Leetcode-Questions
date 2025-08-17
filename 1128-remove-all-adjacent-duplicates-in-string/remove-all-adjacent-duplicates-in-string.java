class Solution {
    public String removeDuplicates(String s) {
        
       Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == character) {
                stack.pop();
            } else {
                stack.push(character);
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (char character : stack) {
            resultBuilder.append(character);
        }

        return resultBuilder.toString();
    }
}