package Codility;

/**
 * @author Agata Stanek - Pietrucha
 */
public class CodilityZad1Binary {
    static class Solution {

        public int solution(int n) {
            BinaryNumber binaryNumber = convertNumberToBinary(n);
            calculateMaxZero(binaryNumber);
            return binaryNumber.maxZero;
        }

        private void calculateMaxZero(BinaryNumber binaryNumber) {
            int maxZero = 0;
            char[] binaryInArray = binaryNumber.binary.toCharArray();
            for(int i = 0; i < binaryInArray.length; i++){
                if(binaryInArray[i] == '1'){
                    if(binaryNumber.maxZero < maxZero){
                        binaryNumber.maxZero = maxZero;
                    }
                    maxZero = 0;
                } else {
                    maxZero++;
                }
            }
        }

        public BinaryNumber convertNumberToBinary(int n){
            BinaryNumber bN = new BinaryNumber();
            for(int i = n; i > 0; i= i/2){
                bN.binary+=addBinarySegment(i);
            }
            bN.binary = new StringBuffer(bN.binary).reverse().toString();
            return bN;
        }

        private String addBinarySegment(int i) {
            return i%2 == 0 ? "0" : "1";
        }
    }

    static class BinaryNumber {
        String binary;
        int maxZero;
    }
}
