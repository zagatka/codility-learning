package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class CodilityZad2 {

    public Solution solution = new Solution();

    public int[] calculateSolution(int[] A, int K) {
        return solution.solution(A, K);
    }


    class Solution {
        public int[] solution(int[] A, int K) {
            if(A.length!=0) {
                for (int i = 0; i < K; i++) {
                    A = moveRight(A);
                }
            }
            return A;
        }

        private int[] moveRight(int[] a) {
            int movedElement = a[lastElementIndex(a)];
            for(int i = lastElementIndex(a); i > 0 ; i--){
                a[i]= a[i-1];
            }
            a[0] = movedElement;
            return a;
        }


        // Do kitu gdy jest pusta tablica, albo gdy wielerazy przesuwamy
        private int[] moveRightAmountOfTime(int[] a, int k) {
            int[] tempArray = new int[k];
            int iterator = 0;
            for(int i = lastElementIndex(a); i > (lastElementIndex(a) - k); i--) {
                tempArray[iterator] = a[i];
                iterator++;
            }
            for(int i = lastElementIndex(a)-k; i >= 0 ; i--) {
                a[i+k] = a[i];
            }
            for(int i = 0; i < k ; i++) {
                a[i] = tempArray[lastElementIndex(tempArray)-i];
            }
            return a;
        }

        private int lastElementIndex(int[] a) {
            return a.length - 1;
        }
    }

}
