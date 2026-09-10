class Solution {
    public String intToRoman(int num) {

        int x = num;
        int d = 0;
        int place = 1;
        String s = "";

        while(x != 0) {

            d = x % 10;
            x = x / 10;

            String temp = "";

            // ONES
            if(place == 1) {
                if(d == 1) temp = "I";
                if(d == 2) temp = "II";
                if(d == 3) temp = "III";
                if(d == 4) temp = "IV";
                if(d == 5) temp = "V";
                if(d == 6) temp = "VI";
                if(d == 7) temp = "VII";
                if(d == 8) temp = "VIII";
                if(d == 9) temp = "IX";
            }

            // TENS
            if(place == 10) {
                if(d == 1) temp = "X";
                if(d == 2) temp = "XX";
                if(d == 3) temp = "XXX";
                if(d == 4) temp = "XL";
                if(d == 5) temp = "L";
                if(d == 6) temp = "LX";
                if(d == 7) temp = "LXX";
                if(d == 8) temp = "LXXX";
                if(d == 9) temp = "XC";
            }

            // HUNDREDS
            if(place == 100) {
                if(d == 1) temp = "C";
                if(d == 2) temp = "CC";
                if(d == 3) temp = "CCC";
                if(d == 4) temp = "CD";
                if(d == 5) temp = "D";
                if(d == 6) temp = "DC";
                if(d == 7) temp = "DCC";
                if(d == 8) temp = "DCCC";
                if(d == 9) temp = "CM";
            }

            // THOUSANDS
            if(place == 1000) {
                if(d == 1) temp = "M";
                if(d == 2) temp = "MM";
                if(d == 3) temp = "MMM";
            }

            // We are extracting from right to left,
            // so put the new part BEFORE the old part
            s = temp + s;

            place = place * 10;
        }

        return s;
    }
}
