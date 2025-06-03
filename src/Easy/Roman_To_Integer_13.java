package Easy;

public class Roman_To_Integer_13 {

    public static void main(String[] args) {
        String s ="MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int nums = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanCharToNumber(s.charAt(i)) < romanCharToNumber(s.charAt(i + 1))) {
                nums -= romanCharToNumber(s.charAt(i));
            } else {
                nums += romanCharToNumber(s.charAt(i));
            }
        }
        return nums + romanCharToNumber(s.charAt(s.length() - 1));
    }

    public static int romanCharToNumber(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}

/*
//Using HashMap
public int romanToInt(String s) {
    int res = 0;
    Map<Character, Integer> roman = new HashMap<>();
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    for (int i = 0; i < s.length() - 1; i++) {
        if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
            res -= roman.get(s.charAt(i));
        } else {
            res += roman.get(s.charAt(i));
        }
    }

    return res + roman.get(s.charAt(s.length() - 1));
}*/
