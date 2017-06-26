package jp.eq_inc.android_testaccessspeed;

import java.util.concurrent.TimeUnit;

public class ReadWriteSpeedTester {
    public static boolean ENABLE_STRING_TEST = false;

    private static int sIntStaticVariable = 0;
    private static long sLongStaticVariable = 0;
    private static float sFloatStaticVariable = 0f;
    private static double sDoubleStaticVariable = 0f;
    private static Integer sIntClStaticVariable = null;
    private static Long sLongClStaticVariable = null;
    private static Float sFloatClStaticVariable = null;
    private static Double sDoubleClStaticVariable = null;
    private static String sStringStaticVariable = null;

    private int mIntInstanceVariable = 0;
    private long mLongInstanceVariable = 0;
    private float mFloatInstanceVariable = 0f;
    private double mDoubleInstanceVariable = 0f;
    private Integer mIntClInstanceVariable = null;
    private Long mLongClInstanceVariable = null;
    private Float mFloatClInstanceVariable = null;
    private Double mDoubleClInstanceVariable = null;
    private String mStringInstanceVariable = null;

    public static long testAccessIntStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        sIntStaticVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sIntStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessIntStaticVariable: random = " + sIntStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        sLongStaticVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sLongStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessLongStaticVariable: random = " + sLongStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        sFloatStaticVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sFloatStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatStaticVariable: random = " + sFloatStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        sDoubleStaticVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sDoubleStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessDoubleStaticVariable: random = " + sDoubleStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        sIntClStaticVariable = Integer.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sIntClStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessIntClStaticVariable: random = " + sIntClStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        sLongClStaticVariable = Long.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sLongClStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessLongClStaticVariable: random = " + sLongClStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        sFloatClStaticVariable = Float.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sFloatClStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatClStaticVariable: random = " + sFloatClStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        sDoubleClStaticVariable = Double.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sDoubleClStaticVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessDoubleClStaticVariable: random = " + sDoubleClStaticVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStaticVariable(int count) {
        long ret = 0;
        int ascii = 0;

        if (ENABLE_STRING_TEST) {
            long startTimeNS = 0;

            sStringStaticVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
            int stackVariableLength = sStringStaticVariable.length();

            startTimeNS = System.nanoTime();
            for (int i = 0; i < count; i++) {
                ascii += sStringStaticVariable.getBytes()[i % stackVariableLength];
            }
            ret = (System.nanoTime() - startTimeNS);
            print("testAccessStringStaticVariable: random = " + sStringStaticVariable + ", ascii = " + ascii + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));
        }

        return ret;
    }

    public static long testAccessIntStackVariable(int count) {
        long ret = 0;
        int stackVariable = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessIntStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStackVariable(int count) {
        long ret = 0;
        long stackVariable = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessLongStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStackVariable(int count) {
        long ret = 0;
        float stackVariable = 0;

        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStackVariable(int count) {
        long ret = 0;
        double stackVariable = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessDoubleStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStackVariable(int count) {
        long ret = 0;
        Integer stackVariable = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessIntClStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStackVariable(int count) {
        long ret = 0;
        Long stackVariable = 0l;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessLongClStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStackVariable(int count) {
        long ret = 0;
        Float stackVariable = Float.valueOf("0");
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatClStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStackVariable(int count) {
        long ret = 0;
        Double stackVariable = Double.valueOf("0");
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            stackVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessDoubleClStackVariable: random = " + stackVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStackVariable(int count) {
        long ret = 0;
        int ascii = 0;
        String stackVariable = null;

        if (ENABLE_STRING_TEST) {
            long startTimeNS = 0;

            stackVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
            int stackVariableLength = stackVariable.length();

            startTimeNS = System.nanoTime();
            for (int i = 0; i < count; i++) {
                ascii += stackVariable.getBytes()[i % stackVariableLength];
            }
            ret = (System.nanoTime() - startTimeNS);
            print("testAccessStringStackVariable: stackVariable = " + stackVariable + ", ascii = " + ascii + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));
        }

        return ret;
    }

    public long testAccessIntInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        mIntInstanceVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mIntInstanceVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessIntInstanceVariable: random = " + mIntInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        mLongInstanceVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mLongInstanceVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessLongInstanceVariable: random = " + mLongInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        mFloatInstanceVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mFloatInstanceVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatInstanceVariable: random = " + mFloatInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        mDoubleInstanceVariable = 0;

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mDoubleInstanceVariable += randomValue;
        }
        ret += (System.nanoTime() - startTimeNS);
        print("testAccessDoubleInstanceVariable: random = " + mDoubleInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessIntClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        mIntClInstanceVariable = Integer.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mIntClInstanceVariable += randomValue;
        }
        ret += (System.nanoTime() - startTimeNS);
        print("testAccessIntClInstanceVariable: random = " + mIntClInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int randomValue = (int) (Math.random() * 10000 % 100);
        mLongClInstanceVariable = Long.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mLongClInstanceVariable += randomValue;
        }
        ret += (System.nanoTime() - startTimeNS);
        print("testAccessLongClInstanceVariable: random = " + mLongClInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        mFloatClInstanceVariable = Float.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mFloatClInstanceVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessFloatClInstanceVariable: random = " + mFloatClInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float randomValue = (float) (Math.random() * 100);
        mDoubleClInstanceVariable = Double.valueOf("0");

        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            mDoubleClInstanceVariable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        print("testAccessDoubleClInstanceVariable: random = " + mDoubleClInstanceVariable + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessStringInstanceVariable(int count) {
        long ret = 0;
        int ascii = 0;

        if (ENABLE_STRING_TEST) {
            long startTimeNS = 0;

            mStringInstanceVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
            int stackVariableLength = mStringInstanceVariable.length();

            startTimeNS = System.nanoTime();
            for (int i = 0; i < count; i++) {
                ascii += mStringInstanceVariable.getBytes()[i % stackVariableLength];
            }
            ret = (System.nanoTime() - startTimeNS);
            print("testAccessStringInstanceVariable: random = " + mStringInstanceVariable + ", ascii = " + ascii + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));
        }

        return ret;
    }

    private static void print(String content) {
        android.util.Log.i(ReadWriteSpeedTester.class.getSimpleName(), content);
    }
}
