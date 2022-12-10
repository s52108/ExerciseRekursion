public class PalindromChecker {
    public static boolean check(String palindrom) {
        /*
        palindrom = palindrom.toUpperCase();
        palindrom = palindrom.trim();
        palindrom = palindrom.replaceAll("[^A-Za-z0-9]", "");
        boolean p = false;

        if (palindrom.isEmpty() || palindrom.length() == 1) {
            p = true;
            return p;
        } else if (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1) && palindrom.length() > 1) {
            palindrom = palindrom.substring(1, palindrom.length() - 1);
            check(palindrom);

        } else if (palindrom.length() <= 1) {
            p = true;
            return p;

        }
        return p;
        }
         */

        {
            // Changes all Characters to Uppercase
            palindrom = palindrom.toUpperCase();
            palindrom = palindrom.trim();
            palindrom = palindrom.replaceAll("[^A-Z]", "");

            if (palindrom.length() <= 1) {
                return true;
            } else if (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1)) {
                palindrom = palindrom.substring(1, palindrom.length() - 1);
                if (check(palindrom) == false) {
                    return false;
                } else if (palindrom.length() <= 1) {
                    return true;
                }
            } else {
                return false;
            }
            return true;
        }


    }

    public static void main(String[] args) {
        String p1 = "Erika feuert nur untreue Fakire?!";
        System.out.println(check(p1));
    }

}
