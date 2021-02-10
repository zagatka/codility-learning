package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class CodilityZad3 {

    public Solution solution = new Solution();

    class Solution {

        public int solution(int[] A) {
            int sumLeftSide = A[0];
            int leftIterator = 0;
            int sumRightSide = A[A.length-1];
            int rightIterator = A.length-1;
            int tempLeftSum, tempRightSum;
            if(A.length > 2){
                while(rightIterator-leftIterator!=1){
                    leftIterator++;
                    tempLeftSum = sumLeftSide + A[leftIterator];
                    rightIterator--;
                    tempRightSum = sumRightSide + A[rightIterator];
                    if(Math.abs(tempLeftSum-sumRightSide)<Math.abs(tempRightSum-sumLeftSide)){
                        sumLeftSide = tempLeftSum;
                        rightIterator++;
                    } else {
                        sumRightSide = tempRightSum;
                        leftIterator--;
                    }
                }
            }
            return Math.abs(sumLeftSide-sumRightSide);
        }
    }

}
