package org.example;

public class RLEncoder {

    public String encode(String str) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        if (str == null || str.isEmpty()) {
            return "";
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(str.charAt(i - 1));
                encodedString.append(count);
                count = 1;
            }
        }

        encodedString.append(str.charAt(str.length() - 1));
        encodedString.append(count);
        return encodedString.toString();
    }


}
