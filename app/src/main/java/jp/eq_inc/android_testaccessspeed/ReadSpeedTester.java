package jp.eq_inc.android_testaccessspeed;

import android.util.Log;

import java.util.concurrent.TimeUnit;

public class ReadSpeedTester {
    private static final int sIntStaticConstant0 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant1 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant2 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant3 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant4 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant5 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant6 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant7 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant8 = (int) (Math.random() * 1000);
    private static final int sIntStaticConstant9 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant0 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant1 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant2 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant3 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant4 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant5 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant6 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant7 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant8 = (int) (Math.random() * 1000);
    private static final long sLongStaticConstant9 = (int) (Math.random() * 1000);
    private static final float sFloatStaticConstant0 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant1 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant2 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant3 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant4 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant5 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant6 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant7 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant8 = (float) (Math.random() * 1000);
    private static final float sFloatStaticConstant9 = (float) (Math.random() * 1000);
    private static final double sDoubleStaticConstant0 = Math.random() * 1000;
    private static final double sDoubleStaticConstant1 = Math.random() * 1000;
    private static final double sDoubleStaticConstant2 = Math.random() * 1000;
    private static final double sDoubleStaticConstant3 = Math.random() * 1000;
    private static final double sDoubleStaticConstant4 = Math.random() * 1000;
    private static final double sDoubleStaticConstant5 = Math.random() * 1000;
    private static final double sDoubleStaticConstant6 = Math.random() * 1000;
    private static final double sDoubleStaticConstant7 = Math.random() * 1000;
    private static final double sDoubleStaticConstant8 = Math.random() * 1000;
    private static final double sDoubleStaticConstant9 = Math.random() * 1000;
    private static final Integer sIntClStaticConstant0 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant1 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant2 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant3 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant4 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant5 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant6 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant7 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant8 = (int) (Math.random() * 1000);
    private static final Integer sIntClStaticConstant9 = (int) (Math.random() * 1000);
    private static final Long sLongClStaticConstant0 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant1 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant2 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant3 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant4 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant5 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant6 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant7 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant8 = (long) (Math.random() * 1000);
    private static final Long sLongClStaticConstant9 = (long) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant0 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant1 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant2 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant3 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant4 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant5 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant6 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant7 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant8 = (float) (Math.random() * 1000);
    private static final Float sFloatClStaticConstant9 = (float) (Math.random() * 1000);
    private static final Double sDoubleClStaticConstant0 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant1 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant2 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant3 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant4 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant5 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant6 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant7 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant8 = Math.random() * 1000;
    private static final Double sDoubleClStaticConstant9 = Math.random() * 1000;
    private static final String sStringStaticConstant0 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant1 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant2 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant3 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant4 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant5 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant6 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant7 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant8 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private static final String sStringStaticConstant9 = String.format("%020.10f", (Math.random() * 1000 * 1000));

    private static int sIntStaticVariable = 0;
    private static long sLongStaticVariable = 0;
    private static float sFloatStaticVariable = 0f;
    private static double sDoubleStaticVariable = 0f;
    private static Integer sIntClStaticVariable = null;
    private static Long sLongClStaticVariable = null;
    private static Float sFloatClStaticVariable = null;
    private static Double sDoubleClStaticVariable = null;
    private static String sStringStaticVariable = null;

    private final int mIntInstanceConstant0 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant1 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant2 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant3 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant4 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant5 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant6 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant7 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant8 = (int) (Math.random() * 1000);
    private final int mIntInstanceConstant9 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant0 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant1 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant2 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant3 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant4 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant5 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant6 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant7 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant8 = (int) (Math.random() * 1000);
    private final long mLongInstanceConstant9 = (int) (Math.random() * 1000);
    private final float mFloatInstanceConstant0 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant1 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant2 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant3 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant4 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant5 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant6 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant7 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant8 = (float) (Math.random() * 1000);
    private final float mFloatInstanceConstant9 = (float) (Math.random() * 1000);
    private final double mDoubleInstanceConstant0 = Math.random() * 1000;
    private final double mDoubleInstanceConstant1 = Math.random() * 1000;
    private final double mDoubleInstanceConstant2 = Math.random() * 1000;
    private final double mDoubleInstanceConstant3 = Math.random() * 1000;
    private final double mDoubleInstanceConstant4 = Math.random() * 1000;
    private final double mDoubleInstanceConstant5 = Math.random() * 1000;
    private final double mDoubleInstanceConstant6 = Math.random() * 1000;
    private final double mDoubleInstanceConstant7 = Math.random() * 1000;
    private final double mDoubleInstanceConstant8 = Math.random() * 1000;
    private final double mDoubleInstanceConstant9 = Math.random() * 1000;
    private final Integer mIntClInstanceConstant0 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant1 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant2 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant3 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant4 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant5 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant6 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant7 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant8 = (int) (Math.random() * 1000);
    private final Integer mIntClInstanceConstant9 = (int) (Math.random() * 1000);
    private final Long mLongClInstanceConstant0 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant1 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant2 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant3 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant4 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant5 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant6 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant7 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant8 = (long) (Math.random() * 1000);
    private final Long mLongClInstanceConstant9 = (long) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant0 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant1 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant2 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant3 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant4 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant5 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant6 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant7 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant8 = (float) (Math.random() * 1000);
    private final Float mFloatClInstanceConstant9 = (float) (Math.random() * 1000);
    private final Double mDoubleClInstanceConstant0 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant1 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant2 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant3 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant4 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant5 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant6 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant7 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant8 = Math.random() * 1000;
    private final Double mDoubleClInstanceConstant9 = Math.random() * 1000;
    private final String mStringInstanceConstant0 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant1 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant2 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant3 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant4 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant5 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant6 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant7 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant8 = String.format("%020.10f", (Math.random() * 1000 * 1000));
    private final String mStringInstanceConstant9 = String.format("%020.10f", (Math.random() * 1000 * 1000));

    private int mIntInstanceVariable = 0;
    private long mLongInstanceVariable = 0;
    private float mFloatInstanceVariable = 0f;
    private double mDoubleInstanceVariable = 0f;
    private Integer mIntClInstanceVariable = null;
    private Long mLongClInstanceVariable = null;
    private Float mFloatClInstanceVariable = null;
    private Double mDoubleClInstanceVariable = null;
    private String mStringInstanceVariable = null;

    private static int sLogLevel = Log.INFO;

    public static void changeLogLevel(int logLevel) {
        sLogLevel = logLevel;
    }

    private static void logD(String tag, String content) {
        if (sLogLevel <= Log.DEBUG) {
            Log.d(tag, content);
        }
    }

    private static void logI(String tag, String content) {
        if (sLogLevel <= Log.INFO) {
            Log.i(tag, content);
        }
    }

    public static long testAccessIntStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        sIntStaticVariable = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sIntStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        sLongStaticVariable = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sLongStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0;

        sFloatStaticVariable = (float) (Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sFloatStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        sDoubleStaticVariable = Math.random() * 100;
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sDoubleStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        sIntClStaticVariable = Integer.valueOf((int) (Math.random() * 10000 % 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sIntClStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntClStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        sLongClStaticVariable = Long.valueOf((long) (Math.random() * 10000 % 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sLongClStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongClStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0f;

        sFloatClStaticVariable = Float.valueOf((float) (Math.random() * 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sFloatClStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatClStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStaticVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        sDoubleClStaticVariable = Double.valueOf(Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sDoubleClStaticVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleClStaticVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStaticVariable(int count) {
        long ret = 0;
        int ascii = 0;
        long startTimeNS = 0;
        long variable = 0;

        sStringStaticVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += sStringStaticVariable.charAt(i % 10);
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessStringStaticVariable: ascii = " + ascii + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntStackVariable(int count) {
        long ret = 0;
        int variable = 0;
        long startTimeNS = 0;

        int randomValue = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStackVariable(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;

        int randomValue = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStackVariable(int count) {
        long ret = 0;
        float variable = 0;
        long startTimeNS = 0;

        float randomValue = (float) (Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStackVariable(int count) {
        long ret = 0;
        double variable = 0;
        long startTimeNS = 0;

        double randomValue = Math.random() * 100;
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStackVariable(int count) {
        long ret = 0;
        int variable = 0;
        long startTimeNS = 0;

        Integer randomValue = Integer.valueOf((int) (Math.random() * 10000 % 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntClStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStackVariable(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;

        Long randomValue = Long.valueOf((long) Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongClStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStackVariable(int count) {
        long ret = 0;
        float variable = 0;
        long startTimeNS = 0;

        Float randomValue = Float.valueOf((float) (Math.random() * 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatClStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStackVariable(int count) {
        long ret = 0;
        double variable = 0;
        long startTimeNS = 0;

        float randomValue = (float) (Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += randomValue;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleClStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStackVariable(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;

        String stackVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += stackVariable.charAt(i % 10);
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessStringStackVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessIntInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        mIntInstanceVariable = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mIntInstanceVariable;
        }
        ret += (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntInstanceVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        mLongInstanceVariable = (long) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mLongInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongInstanceVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0;

        mFloatInstanceVariable = (float) (Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mFloatInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatInstanceVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        mDoubleInstanceVariable = (float) (Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mDoubleInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleInstanceVariable: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessIntClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        mIntClInstanceVariable = (int) (Math.random() * 10000 % 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mIntClInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessIntClInstanceVariable: hash = " + mIntClInstanceVariable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        mLongClInstanceVariable = Long.valueOf((long) (Math.random() * 10000 % 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mLongClInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessLongClInstanceVariable: hash = " + mLongClInstanceVariable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0;

        mFloatClInstanceVariable = Float.valueOf((float) (Math.random() * 100));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mFloatClInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessFloatClInstanceVariable: hash = " + mFloatClInstanceVariable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleClInstanceVariable(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        mDoubleClInstanceVariable = Double.valueOf(Math.random() * 100);
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mDoubleClInstanceVariable;
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessDoubleClInstanceVariable: hash = " + mDoubleClInstanceVariable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessStringInstanceVariable(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;

        mStringInstanceVariable = String.format("%020.10f", (Math.random() * 1000 * 1000));
        startTimeNS = System.nanoTime();
        for (int i = 0; i < count; i++) {
            variable += mStringInstanceVariable.charAt(i % 10);
        }
        ret = (System.nanoTime() - startTimeNS);
        logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        ret /= count;
        print("testAccessStringInstanceVariable: hash = " + mStringInstanceVariable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sIntClStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntClStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sLongClStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongClStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0f;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sFloatClStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatClStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStaticConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sDoubleClStaticConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleClStaticConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStaticConstant(int count) {
        long ret = 0;
        int ascii = 0;
        long startTimeNS = 0;
        long variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant0.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant1.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant2.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant3.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant4.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant5.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant6.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant7.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant8.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += sStringStaticConstant9.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessStringStaticConstant: ascii = " + ascii + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntStackConstant(int count) {
        long ret = 0;
        int variable = 0;
        long startTimeNS = 0;
        final int stackConstant0 = sIntStaticConstant0;
        final int stackConstant1 = sIntStaticConstant1;
        final int stackConstant2 = sIntStaticConstant2;
        final int stackConstant3 = sIntStaticConstant3;
        final int stackConstant4 = sIntStaticConstant4;
        final int stackConstant5 = sIntStaticConstant5;
        final int stackConstant6 = sIntStaticConstant6;
        final int stackConstant7 = sIntStaticConstant7;
        final int stackConstant8 = sIntStaticConstant8;
        final int stackConstant9 = sIntStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongStackConstant(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;
        final long stackConstant0 = sLongStaticConstant0;
        final long stackConstant1 = sLongStaticConstant1;
        final long stackConstant2 = sLongStaticConstant2;
        final long stackConstant3 = sLongStaticConstant3;
        final long stackConstant4 = sLongStaticConstant4;
        final long stackConstant5 = sLongStaticConstant5;
        final long stackConstant6 = sLongStaticConstant6;
        final long stackConstant7 = sLongStaticConstant7;
        final long stackConstant8 = sLongStaticConstant8;
        final long stackConstant9 = sLongStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatStackConstant(int count) {
        long ret = 0;
        float variable = 0;
        long startTimeNS = 0;
        final float stackConstant0 = sFloatStaticConstant0;
        final float stackConstant1 = sFloatStaticConstant1;
        final float stackConstant2 = sFloatStaticConstant2;
        final float stackConstant3 = sFloatStaticConstant3;
        final float stackConstant4 = sFloatStaticConstant4;
        final float stackConstant5 = sFloatStaticConstant5;
        final float stackConstant6 = sFloatStaticConstant6;
        final float stackConstant7 = sFloatStaticConstant7;
        final float stackConstant8 = sFloatStaticConstant8;
        final float stackConstant9 = sFloatStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleStackConstant(int count) {
        long ret = 0;
        double variable = 0;
        long startTimeNS = 0;
        final double stackConstant0 = sDoubleStaticConstant0;
        final double stackConstant1 = sDoubleStaticConstant1;
        final double stackConstant2 = sDoubleStaticConstant2;
        final double stackConstant3 = sDoubleStaticConstant3;
        final double stackConstant4 = sDoubleStaticConstant4;
        final double stackConstant5 = sDoubleStaticConstant5;
        final double stackConstant6 = sDoubleStaticConstant6;
        final double stackConstant7 = sDoubleStaticConstant7;
        final double stackConstant8 = sDoubleStaticConstant8;
        final double stackConstant9 = sDoubleStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessIntClStackConstant(int count) {
        long ret = 0;
        int variable = 0;
        long startTimeNS = 0;
        final Integer stackConstant0 = sIntClStaticConstant0;
        final Integer stackConstant1 = sIntClStaticConstant1;
        final Integer stackConstant2 = sIntClStaticConstant2;
        final Integer stackConstant3 = sIntClStaticConstant3;
        final Integer stackConstant4 = sIntClStaticConstant4;
        final Integer stackConstant5 = sIntClStaticConstant5;
        final Integer stackConstant6 = sIntClStaticConstant6;
        final Integer stackConstant7 = sIntClStaticConstant7;
        final Integer stackConstant8 = sIntClStaticConstant8;
        final Integer stackConstant9 = sIntClStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntClStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessLongClStackConstant(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;
        final Long stackConstant0 = sLongClStaticConstant0;
        final Long stackConstant1 = sLongClStaticConstant1;
        final Long stackConstant2 = sLongClStaticConstant2;
        final Long stackConstant3 = sLongClStaticConstant3;
        final Long stackConstant4 = sLongClStaticConstant4;
        final Long stackConstant5 = sLongClStaticConstant5;
        final Long stackConstant6 = sLongClStaticConstant6;
        final Long stackConstant7 = sLongClStaticConstant7;
        final Long stackConstant8 = sLongClStaticConstant8;
        final Long stackConstant9 = sLongClStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongClStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessFloatClStackConstant(int count) {
        long ret = 0;
        float variable = 0;
        long startTimeNS = 0;
        final Float stackConstant0 = sFloatClStaticConstant0;
        final Float stackConstant1 = sFloatClStaticConstant1;
        final Float stackConstant2 = sFloatClStaticConstant2;
        final Float stackConstant3 = sFloatClStaticConstant3;
        final Float stackConstant4 = sFloatClStaticConstant4;
        final Float stackConstant5 = sFloatClStaticConstant5;
        final Float stackConstant6 = sFloatClStaticConstant6;
        final Float stackConstant7 = sFloatClStaticConstant7;
        final Float stackConstant8 = sFloatClStaticConstant8;
        final Float stackConstant9 = sFloatClStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatClStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessDoubleClStackConstant(int count) {
        long ret = 0;
        double variable = 0;
        long startTimeNS = 0;
        final Double stackConstant0 = sDoubleClStaticConstant0;
        final Double stackConstant1 = sDoubleClStaticConstant1;
        final Double stackConstant2 = sDoubleClStaticConstant2;
        final Double stackConstant3 = sDoubleClStaticConstant3;
        final Double stackConstant4 = sDoubleClStaticConstant4;
        final Double stackConstant5 = sDoubleClStaticConstant5;
        final Double stackConstant6 = sDoubleClStaticConstant6;
        final Double stackConstant7 = sDoubleClStaticConstant7;
        final Double stackConstant8 = sDoubleClStaticConstant8;
        final Double stackConstant9 = sDoubleClStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = stackConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleClStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public static long testAccessStringStackConstant(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;
        final String stackConstant0 = sStringStaticConstant0;
        final String stackConstant1 = sStringStaticConstant1;
        final String stackConstant2 = sStringStaticConstant2;
        final String stackConstant3 = sStringStaticConstant3;
        final String stackConstant4 = sStringStaticConstant4;
        final String stackConstant5 = sStringStaticConstant5;
        final String stackConstant6 = sStringStaticConstant6;
        final String stackConstant7 = sStringStaticConstant7;
        final String stackConstant8 = sStringStaticConstant8;
        final String stackConstant9 = sStringStaticConstant9;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant0.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant1.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant2.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant3.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant4.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant5.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant6.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant7.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant8.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += stackConstant9.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessStringStackConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessIntInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        int variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntInstanceConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        long variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongInstanceConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        float variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatInstanceConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        double variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleInstanceConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessIntClInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        Integer variable = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mIntClInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessIntClInstanceConstant: hash = " + variable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessLongClInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        Long variable = null;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mLongClInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessLongClInstanceConstant: hash = " + variable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessFloatClInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        Float variable = null;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mFloatClInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessFloatClInstanceConstant: hash = " + variable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessDoubleClInstanceConstant(int count) {
        long ret = 0;
        long startTimeNS = 0;
        Double variable = null;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant0;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant1;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant2;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant3;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant4;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant5;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant6;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant7;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant8;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable = mDoubleClInstanceConstant9;
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessDoubleClInstanceConstant: hash = " + variable.hashCode() + ", access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    public long testAccessStringInstanceConstant(int count) {
        long ret = 0;
        long variable = 0;
        long startTimeNS = 0;

        {
            switch ((int) (Math.random() * 10000 % 10)) {
                case 0:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant0.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 1:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant1.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 2:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant2.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 3:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant3.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 4:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant4.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 5:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant5.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 6:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant6.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 7:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant7.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 8:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant8.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
                case 9:
                    startTimeNS = System.nanoTime();
                    for (int i = 0; i < count; i++) {
                        variable += mStringInstanceConstant9.charAt(i % 10);
                    }
                    ret = (System.nanoTime() - startTimeNS);
                    break;
            }
            logD(ReadSpeedTester.class.getSimpleName(), "variable = " + variable);
        }
        ret /= count;
        print("testAccessStringInstanceConstant: access time(ms) = " + TimeUnit.NANOSECONDS.toMillis(ret));

        return ret;
    }

    private static void print(String content) {
        android.util.Log.i(ReadSpeedTester.class.getSimpleName(), content);
    }
}
