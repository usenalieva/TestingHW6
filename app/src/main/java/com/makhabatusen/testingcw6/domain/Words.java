package com.makhabatusen.testingcw6.domain;

public class Words {

    public String reverseWords(String str) {
        if (str == null ) {
            return "";
        }
        if (str.contains(" ")) {
            String[] words = str.split(" ");
            StringBuilder builder = new StringBuilder();

            for (int i = words.length-1; i >= 0; i--) {
                if (i==0)
                    builder.append(words[i]);
                else
                    builder.append(words[i]).append(" ");
            }
          //  builder.append(words[1]).append(" ").append(words[0]);
            return builder.toString();
        } else
            return str;

    }
}
