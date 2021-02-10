package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class CodilityZad3_2 {

    public int solution2(int x, int y, int d) {
        return (y-x)%d>0 ? 1+(y-x)/d :(y-x)/d;
    }

    public int solution(int X, int Y, int D) {
        int x = calculateNumberOfJump(X, Y, D);
        return x;

    }

    public int calculateNumberOfJump(int x, int y, int d) {
        double doubleValue = (y-x)/(double)d;
        int numberOfJump = roundValueUp(doubleValue);
        return numberOfJump;
    }

    public int  roundValueUp(double doubleValue) {
        int intValue = (int)doubleValue;
        return (double)intValue < doubleValue ? (intValue + 1) : intValue;
    }
}
