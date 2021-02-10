package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class CodilityZad3_3 {

    public int solution(int[] A) {
        long idealSum = ((long)(A.length+1)*(long)(A.length+2))/(long)2;
        long realSum = 0;
        for(int i = 0 ; i < A.length ; i++){
            realSum+=A[i];
        }
        long finValue = idealSum-realSum;
        return (int)finValue;
    }


}
