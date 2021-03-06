/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public StringBuilder convertNormalStringToBinaryString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <userInputStringInLowerCase.length() ; i++) {
            int a = userInputStringInLowerCase.charAt(i);
            String string = Integer.toBinaryString(a);
            String zero="0";
            stringBuilder.append(zero.repeat(8-string.length()));
            stringBuilder.append(string);
        }
        return stringBuilder;
    }
}
