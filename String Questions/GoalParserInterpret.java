package com.jasleen.StringsPQ;
// https://leetcode.com/problems/goal-parser-interpretation/submissions/
public class GoalParserInterpret {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        String sol = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                sol += "G";
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sol += "o";
                i++;
            } else {
                sol += "al";
                i += 3;
            }
        }
            return sol;
        }
    }
