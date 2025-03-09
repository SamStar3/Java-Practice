package HackerRank;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean hasDigit = false, hasLower = false, hasUpper = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) != -1) hasDigit = true;
            else if (lower_case.indexOf(c) != -1) hasLower = true;
            else if (upper_case.indexOf(c) != -1) hasUpper = true;
            else if (special_characters.indexOf(c) != -1) hasSpecial = true;
        }

        int missingTypes = 0;
        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;

        return Math.max(missingTypes, 6 - n);
    }
}
