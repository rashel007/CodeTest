package Task1;

/**
 * Anagram Class
 * To Check if two string are similar in characters or not
 */

class Anagram {


    boolean functionCheckAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        shortedChar(s1Char);
        shortedChar(s2Char);


        for (int i = 0; i < s1Char.length; i++) {
            if (s1Char[i] != s2Char[i]) {
                return false;
            }
        }

        return true;
    }


    /**
     * Use Insertion short Algorithm to rearrange
     * @param charList list need to be shorted in alphabetic order
     */
    private void shortedChar(char[] charList) {

        char value;
        int hole;

        for (int i = 1; i < charList.length; i++) {
            value = charList[i];
            hole = i;

            while (hole > 0 && charList[hole - 1] > value) {
                charList[hole] = charList[hole - 1];
                hole = hole - 1;
            }
            charList[hole] = value;
        }


    }
}
