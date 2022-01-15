package com.jasleen.StringsPQ;
// https://leetcode.com/problems/goal-parser-interpretation/submissions/
  /* Using String Builder */
public class GoalParser {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder sol = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                sol.append("G");
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sol.append("o");
                i++;
            } else {
                sol.append("al");
                i += 3;
            }
        }
        return sol.toString();
    }
}
