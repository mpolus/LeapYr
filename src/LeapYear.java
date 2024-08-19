public class LeapYear {
    public static void main(String[] args) {
        System.out.println((-1600));
        System.out.println((1600));
        System.out.println((2017));
        System.out.println((2000));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
