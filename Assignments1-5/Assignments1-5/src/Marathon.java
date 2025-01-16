class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        System.out.println(getLowestTimeIndex(times));
        System.out.println(getSecLowestTimeIndex(times));
    }

    public static int getLowestTimeIndex(int[] a) {
        int minVal = Integer.MAX_VALUE, minIdx = 0;
        for (int i = 0; i < a.length; i ++) {
            if (a[i] < minVal) {
                minIdx = i;
                minVal = a[i];
            }
        }
        return minIdx;
    }
    public static int getSecLowestTimeIndex(int[] a) {
        int minVal = Integer.MAX_VALUE;
        int sminVal = Integer.MAX_VALUE, sminIdx = 0;
        for (int i = 0; i < a.length; i ++) {
            if (a[i] < minVal) {
                minVal = a[i];
            } else if (a[i] < sminVal) {
                sminIdx = i;
                sminVal = a[i];
            }
        }
        return sminIdx;
    }
}
