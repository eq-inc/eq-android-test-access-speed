package jp.eq_inc.android_testaccessspeed;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

            mDialog = new ProgressDialog(MainActivity.this, ProgressDialog.STYLE_SPINNER);
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
                for (int i = 0, sizeI = mAverageCount; i < sizeI; i++) {
                    for (int j = 0, sizeJ = mTargetTextViewArray.length; j < sizeJ; j++) {
                        TextView targetTextView = mTargetTextViewArray[j];

                        if (targetTextView == mTvIntStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessIntStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvLongStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessLongStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessFloatStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessDoubleStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessIntClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessLongClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessFloatClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessDoubleClStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvStringStaticAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(static): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessStringStaticVariable(mAccessCount);
                        } else if (targetTextView == mTvIntInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessIntInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvLongInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessLongInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessFloatInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessDoubleInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessIntClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessLongClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessFloatClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessDoubleClInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvStringInstanceAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(instance): ";
                            }
                            tempRetArray[i][j] = new ReadWriteSpeedTester().testAccessStringInstanceVariable(mAccessCount);
                        } else if (targetTextView == mTvIntStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessIntStackVariable(mAccessCount);
                        } else if (targetTextView == mTvLongStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessLongStackVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessFloatStackVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessDoubleStackVariable(mAccessCount);
                        } else if (targetTextView == mTvIntClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to int Cl(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessIntClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvLongClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to long Cl(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessLongClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvFloatClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to float Cl(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessFloatClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvDoubleClStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to double Cl(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessDoubleClStackVariable(mAccessCount);
                        } else if (targetTextView == mTvStringStackAccess) {
                            if (tempRetArray[mAverageCount][j] == null) {
                                tempRetArray[mAverageCount][j] = "access to String(stack): ";
                            }
                            tempRetArray[i][j] = ReadWriteSpeedTester.testAccessStringStackVariable(mAccessCount);
                        }
                    }
                }

                for (int j = 0, sizeJ = mTargetTextViewArray.length; j < sizeJ; j++) {
                    long tempRet = 0;

                    for (int i = 0, sizeI = mAverageCount; i < sizeI; i++) {
                        tempRet += (Long) (tempRetArray[i][j]);
                    }

                    retList.add((String) (tempRetArray[mAverageCount][j]) + (((double)tempRet) / 1000000 / mAverageCount) + "ms");
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
