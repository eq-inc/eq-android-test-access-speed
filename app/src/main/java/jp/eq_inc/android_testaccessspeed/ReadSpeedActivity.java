package jp.eq_inc.android_testaccessspeed;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ReadSpeedActivity extends AppCompatActivity {
    private TextView mTvIntStaticAccess;
    private TextView mTvLongStaticAccess;
    private TextView mTvFloatStaticAccess;
    private TextView mTvDoubleStaticAccess;
    private TextView mTvStringStaticAccess;
    private TextView mTvIntInstanceAccess;
    private TextView mTvLongInstanceAccess;
    private TextView mTvFloatInstanceAccess;
    private TextView mTvDoubleInstanceAccess;
    private TextView mTvStringInstanceAccess;
    private TextView mTvIntStackAccess;
    private TextView mTvLongStackAccess;
    private TextView mTvFloatStackAccess;
    private TextView mTvDoubleStackAccess;
    private TextView mTvStringStackAccess;
    private TextView mTvIntClStaticAccess;
    private TextView mTvLongClStaticAccess;
    private TextView mTvFloatClStaticAccess;
    private TextView mTvDoubleClStaticAccess;
    private TextView mTvIntClInstanceAccess;
    private TextView mTvLongClInstanceAccess;
    private TextView mTvFloatClInstanceAccess;
    private TextView mTvDoubleClInstanceAccess;
    private TextView mTvIntClStackAccess;
    private TextView mTvLongClStackAccess;
    private TextView mTvFloatClStackAccess;
    private TextView mTvDoubleClStackAccess;
    private TextView mTvIntFinalStaticAccess;
    private TextView mTvLongFinalStaticAccess;
    private TextView mTvFloatFinalStaticAccess;
    private TextView mTvDoubleFinalStaticAccess;
    private TextView mTvStringFinalStaticAccess;
    private TextView mTvIntFinalInstanceAccess;
    private TextView mTvLongFinalInstanceAccess;
    private TextView mTvFloatFinalInstanceAccess;
    private TextView mTvDoubleFinalInstanceAccess;
    private TextView mTvStringFinalInstanceAccess;
    private TextView mTvIntFinalStackAccess;
    private TextView mTvLongFinalStackAccess;
    private TextView mTvFloatFinalStackAccess;
    private TextView mTvDoubleFinalStackAccess;
    private TextView mTvStringFinalStackAccess;
    private TextView mTvIntClFinalStaticAccess;
    private TextView mTvLongClFinalStaticAccess;
    private TextView mTvFloatClFinalStaticAccess;
    private TextView mTvDoubleClFinalStaticAccess;
    private TextView mTvIntClFinalInstanceAccess;
    private TextView mTvLongClFinalInstanceAccess;
    private TextView mTvFloatClFinalInstanceAccess;
    private TextView mTvDoubleClFinalInstanceAccess;
    private TextView mTvIntClFinalStackAccess;
    private TextView mTvLongClFinalStackAccess;
    private TextView mTvFloatClFinalStackAccess;
    private TextView mTvDoubleClFinalStackAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_speed);

        ((SwitchCompat) findViewById(R.id.scOutputLog)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ReadSpeedTester.changeLogLevel(isChecked ? Log.DEBUG : Log.INFO);
            }
        });

        mTvIntStaticAccess = (TextView) findViewById(R.id.tvIntStaticVariable);
        mTvLongStaticAccess = (TextView) findViewById(R.id.tvLongStaticVariable);
        mTvFloatStaticAccess = (TextView) findViewById(R.id.tvFloatStaticVariable);
        mTvDoubleStaticAccess = (TextView) findViewById(R.id.tvDoubleStaticVariable);
        mTvStringStaticAccess = (TextView) findViewById(R.id.tvStringStaticVariable);
        mTvIntInstanceAccess = (TextView) findViewById(R.id.tvIntInstanceVariable);
        mTvLongInstanceAccess = (TextView) findViewById(R.id.tvLongInstanceVariable);
        mTvFloatInstanceAccess = (TextView) findViewById(R.id.tvFloatInstanceVariable);
        mTvDoubleInstanceAccess = (TextView) findViewById(R.id.tvDoubleInstanceVariable);
        mTvStringInstanceAccess = (TextView) findViewById(R.id.tvStringInstanceVariable);
        mTvIntStackAccess = (TextView) findViewById(R.id.tvIntStackVariable);
        mTvLongStackAccess = (TextView) findViewById(R.id.tvLongStackVariable);
        mTvFloatStackAccess = (TextView) findViewById(R.id.tvFloatStackVariable);
        mTvDoubleStackAccess = (TextView) findViewById(R.id.tvDoubleStackVariable);
        mTvStringStackAccess = (TextView) findViewById(R.id.tvStringStackVariable);
        mTvIntClStaticAccess = (TextView) findViewById(R.id.tvIntClStaticVariable);
        mTvLongClStaticAccess = (TextView) findViewById(R.id.tvLongClStaticVariable);
        mTvFloatClStaticAccess = (TextView) findViewById(R.id.tvFloatClStaticVariable);
        mTvDoubleClStaticAccess = (TextView) findViewById(R.id.tvDoubleClStaticVariable);
        mTvIntClInstanceAccess = (TextView) findViewById(R.id.tvIntClInstanceVariable);
        mTvLongClInstanceAccess = (TextView) findViewById(R.id.tvLongClInstanceVariable);
        mTvFloatClInstanceAccess = (TextView) findViewById(R.id.tvFloatClInstanceVariable);
        mTvDoubleClInstanceAccess = (TextView) findViewById(R.id.tvDoubleClInstanceVariable);
        mTvIntClStackAccess = (TextView) findViewById(R.id.tvIntClStackVariable);
        mTvLongClStackAccess = (TextView) findViewById(R.id.tvLongClStackVariable);
        mTvFloatClStackAccess = (TextView) findViewById(R.id.tvFloatClStackVariable);
        mTvDoubleClStackAccess = (TextView) findViewById(R.id.tvDoubleClStackVariable);
        mTvIntFinalStaticAccess = (TextView) findViewById(R.id.tvIntFinalStaticConstant);
        mTvLongFinalStaticAccess = (TextView) findViewById(R.id.tvLongFinalStaticConstant);
        mTvFloatFinalStaticAccess = (TextView) findViewById(R.id.tvFloatFinalStaticConstant);
        mTvDoubleFinalStaticAccess = (TextView) findViewById(R.id.tvDoubleFinalStaticConstant);
        mTvStringFinalStaticAccess = (TextView) findViewById(R.id.tvStringFinalStaticConstant);
        mTvIntFinalInstanceAccess = (TextView) findViewById(R.id.tvIntFinalInstanceConstant);
        mTvLongFinalInstanceAccess = (TextView) findViewById(R.id.tvLongFinalInstanceConstant);
        mTvFloatFinalInstanceAccess = (TextView) findViewById(R.id.tvFloatFinalInstanceConstant);
        mTvDoubleFinalInstanceAccess = (TextView) findViewById(R.id.tvDoubleFinalInstanceConstant);
        mTvStringFinalInstanceAccess = (TextView) findViewById(R.id.tvStringFinalInstanceConstant);
        mTvIntFinalStackAccess = (TextView) findViewById(R.id.tvIntFinalStackConstant);
        mTvLongFinalStackAccess = (TextView) findViewById(R.id.tvLongFinalStackConstant);
        mTvFloatFinalStackAccess = (TextView) findViewById(R.id.tvFloatFinalStackConstant);
        mTvDoubleFinalStackAccess = (TextView) findViewById(R.id.tvDoubleFinalStackConstant);
        mTvStringFinalStackAccess = (TextView) findViewById(R.id.tvStringFinalStackConstant);
        mTvIntClFinalStaticAccess = (TextView) findViewById(R.id.tvIntClFinalStaticConstant);
        mTvLongClFinalStaticAccess = (TextView) findViewById(R.id.tvLongClFinalStaticConstant);
        mTvFloatClFinalStaticAccess = (TextView) findViewById(R.id.tvFloatClFinalStaticConstant);
        mTvDoubleClFinalStaticAccess = (TextView) findViewById(R.id.tvDoubleClFinalStaticConstant);
        mTvIntClFinalInstanceAccess = (TextView) findViewById(R.id.tvIntClFinalInstanceConstant);
        mTvLongClFinalInstanceAccess = (TextView) findViewById(R.id.tvLongClFinalInstanceConstant);
        mTvFloatClFinalInstanceAccess = (TextView) findViewById(R.id.tvFloatClFinalInstanceConstant);
        mTvDoubleClFinalInstanceAccess = (TextView) findViewById(R.id.tvDoubleClFinalInstanceConstant);
        mTvIntClFinalStackAccess = (TextView) findViewById(R.id.tvIntClFinalStackConstant);
        mTvLongClFinalStackAccess = (TextView) findViewById(R.id.tvLongClFinalStackConstant);
        mTvFloatClFinalStackAccess = (TextView) findViewById(R.id.tvFloatClFinalStackConstant);
        mTvDoubleClFinalStackAccess = (TextView) findViewById(R.id.tvDoubleClFinalStackConstant);


        findViewById(R.id.btnStartTest).setOnClickListener(mClickListener);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText etAccessCount = (EditText) findViewById(R.id.etAccessCount);
            EditText etAverageCount = (EditText) findViewById(R.id.etAverageCount);
            int accessCount = Integer.valueOf(etAccessCount.getText().toString());
            int averageCount = Integer.valueOf(etAverageCount.getText().toString());

            TextView[] targetTextViewArray = {
                    mTvIntClStaticAccess,
                    mTvLongClStaticAccess,
                    mTvFloatClStaticAccess,
                    mTvDoubleClStaticAccess,
                    mTvIntClInstanceAccess,
                    mTvLongClInstanceAccess,
                    mTvFloatClInstanceAccess,
                    mTvDoubleClInstanceAccess,
                    mTvIntClStackAccess,
                    mTvLongClStackAccess,
                    mTvFloatClStackAccess,
                    mTvDoubleClStackAccess,
                    mTvIntStaticAccess,
                    mTvLongStaticAccess,
                    mTvFloatStaticAccess,
                    mTvDoubleStaticAccess,
                    mTvStringStaticAccess,
                    mTvIntInstanceAccess,
                    mTvLongInstanceAccess,
                    mTvFloatInstanceAccess,
                    mTvDoubleInstanceAccess,
                    mTvStringInstanceAccess,
                    mTvIntStackAccess,
                    mTvLongStackAccess,
                    mTvFloatStackAccess,
                    mTvDoubleStackAccess,
                    mTvStringStackAccess,
                    mTvIntFinalStaticAccess,
                    mTvLongFinalStaticAccess,
                    mTvFloatFinalStaticAccess,
                    mTvDoubleFinalStaticAccess,
                    mTvStringFinalStaticAccess,
                    mTvIntFinalInstanceAccess,
                    mTvLongFinalInstanceAccess,
                    mTvFloatFinalInstanceAccess,
                    mTvDoubleFinalInstanceAccess,
                    mTvStringFinalInstanceAccess,
                    mTvIntFinalStackAccess,
                    mTvLongFinalStackAccess,
                    mTvFloatFinalStackAccess,
                    mTvDoubleFinalStackAccess,
                    mTvStringFinalStackAccess,
                    mTvIntClFinalStaticAccess,
                    mTvLongClFinalStaticAccess,
                    mTvFloatClFinalStaticAccess,
                    mTvDoubleClFinalStaticAccess,
                    mTvIntClFinalInstanceAccess,
                    mTvLongClFinalInstanceAccess,
                    mTvFloatClFinalInstanceAccess,
                    mTvDoubleClFinalInstanceAccess,
                    mTvIntClFinalStackAccess,
                    mTvLongClFinalStackAccess,
                    mTvFloatClFinalStackAccess,
                    mTvDoubleClFinalStackAccess,
            };
            AccessSpeedTestTask task = new AccessSpeedTestTask(averageCount, accessCount);
            task.execute(targetTextViewArray);
        }
    };

    private class AccessSpeedTestTask extends AsyncTask<TextView[], Void, String[]> {
        private TextView[] mTargetTextViewArray;
        private int mAverageCount = 0;
        private int mAccessCount = 0;
        private ProgressDialog mDialog = null;

        public AccessSpeedTestTask(int averageCount, int accessCount) {
            mAverageCount = averageCount;
            mAccessCount = accessCount;

            mDialog = new ProgressDialog(ReadSpeedActivity.this, ProgressDialog.STYLE_SPINNER);
            mDialog.setCancelable(false);
            mDialog.setCanceledOnTouchOutside(false);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mDialog.show();
        }

        @Override
        protected String[] doInBackground(TextView[]... params) {
            ArrayList<String> retList = new ArrayList<String>();

            if (params != null && params.length > 0) {
                mTargetTextViewArray = params[0];

                Object[][] tempRetArray = new Object[mAverageCount + 1][mTargetTextViewArray.length];
                ReadSpeedTester tester = new ReadSpeedTester();
                for (int i = 0, sizeI = mAverageCount; i < sizeI; i++) {
                    for (int j = 0, sizeJ = mTargetTextViewArray.length; j < sizeJ; j++) {
                        TextView targetTextView = mTargetTextViewArray[j];

                        if (targetTextView == mTvIntStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvLongStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvStringStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvIntInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvLongInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvStringInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvIntStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntStackVariable(mAccessCount);
                        } else if (targetTextView == mTvLongStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongStackVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatStackVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleStackVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvStringStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringStackVariable(mAccessCount);
                        } else if (targetTextView == mTvIntFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvLongFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvIntClFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvLongClFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatClFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleClFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvStringFinalStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(final static): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringStaticConstant(mAccessCount);
                        } else if (targetTextView == mTvIntFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvLongFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvIntClFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvLongClFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatClFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleClFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvStringFinalInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(final instance): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringInstanceConstant(mAccessCount);
                        } else if (targetTextView == mTvIntFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntStackConstant(mAccessCount);
                        } else if (targetTextView == mTvLongFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongStackConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatStackConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleStackConstant(mAccessCount);
                        } else if (targetTextView == mTvIntClFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessIntClStackConstant(mAccessCount);
                        } else if (targetTextView == mTvLongClFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessLongClStackConstant(mAccessCount);
                        } else if (targetTextView == mTvFloatClFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessFloatClStackConstant(mAccessCount);
                        } else if (targetTextView == mTvDoubleClFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessDoubleClStackConstant(mAccessCount);
                        } else if (targetTextView == mTvStringFinalStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(final stack): ";
                            }
                            tempRetArray[i][j] = tester.testAccessStringStackConstant(mAccessCount);
                        }
                    }
                }

                for (int j = 0, sizeJ = mTargetTextViewArray.length; j < sizeJ; j++) {
                    long tempRet = 0;

                    for (int i = 0, sizeI = mAverageCount; i < sizeI; i++) {
                        tempRet += (Long) (tempRetArray[i][j]);
                    }

                    retList.add(((String)tempRetArray[mAverageCount][j]) + (tempRet / mAverageCount) + "ns");
                }
            }
            return retList.toArray(new String[0]);
        }

        @Override
        protected void onPostExecute(String[] s) {
            super.onPostExecute(s);

            for (int i = 0, size = mTargetTextViewArray.length; i < size; i++) {
                mTargetTextViewArray[i].setText(s[i]);
                Log.i("AccessSpeed", s[i]);
            }
            mDialog.dismiss();
        }
    }
}
