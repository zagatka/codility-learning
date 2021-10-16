package Codility;

public class ParkingBill {
    public int solution(String E, String L) {
        int minParking = calculateMinutes(L) - calculateMinutes(E);
        return pay(minParking);
    }

    private int calculateMinutes(String str) {
        int h = Integer.valueOf(str.substring(0, 2));
        int min = Integer.valueOf(str.substring(3));
        return h * 60 + min;
    }

    private int pay(int minutes) {
        if (minutes == 0) {
            return 2;
        } else if (minutes > 0 && minutes <= 60) {
            return 3 + pay(0);
        } else if (minutes > 60) {
            return 4 + pay(minutes - 60);
        }
        return 0;
    }
}

