package com.codeprac.strings;

public class RemoveBracketsFromAnAlgebricExpression {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char ch : chars){
            if (ch != '(' && ch != '{' && ch != '[' && ch != ')'){
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
