package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class Nesting {
    public int solution(String S) {
        if (S == null || S.equals("")) {
            return 1;
        }
        char[] tab = S.toCharArray();
        if (tab[0] == '(') {

            int sumOfRightNesting = 0;
            int sumOfLeftNesting = 0;
            for (int i = 0; i < tab.length; i++) {
                if((sumOfRightNesting - sumOfLeftNesting) < 0) return 0;

                if (tab[i] == '(') {
                    sumOfRightNesting += 1;
                }
                if (tab[i] == ')') {
                    sumOfLeftNesting += 1;
                }
            }
            if (sumOfRightNesting == sumOfLeftNesting) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
