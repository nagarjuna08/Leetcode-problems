class Solution {
    public double angleClock(int hour, int minutes) {
        double ha=0;
        double ma=0;
        hour%=12;
        ha=hour*30;
        ha+=minutes*(0.5);
        ma=minutes*6;
        return Math.min(Math.abs(ha-ma),360-Math.abs(ha-ma));
    }
}