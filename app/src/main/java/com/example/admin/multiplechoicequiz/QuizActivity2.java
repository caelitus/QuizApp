package com.example.admin.multiplechoicequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity2 extends AppCompatActivity{


    private QuestionLibrary2 mQuestionLibrary2 = new QuestionLibrary2();

    public TextView mScoreView_1;
    public TextView mQuestionView_1;
    public Button mButtonChoice1_1;
    public Button mButtonChoice2_1;
    public Button mButtonChoice3_1;
    public Button mButtonChoice4_1;

    public String mAnswer_1;
    public double mScore_1 = 0.0;
    public int mQuestionNumber_1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2);

        mScoreView_1 = (TextView) findViewById(R.id.score_1);
        mQuestionView_1 = (TextView) findViewById(R.id.question_1);
        mButtonChoice1_1 = (Button) findViewById(R.id.choice1_1);
        mButtonChoice2_1 = (Button) findViewById(R.id.choice2_1);
        mButtonChoice3_1 = (Button) findViewById(R.id.choice3_1);
        mButtonChoice4_1 = (Button) findViewById(R.id.choice4_1);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1_1.getText() == mAnswer_1) {

                    mScore_1 = mScore_1 + 2.5;
                    updateScore(mScore_1);

                    //check before button start

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }


                } else {

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });


        mButtonChoice2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2_1.getText() == mAnswer_1) {

                    mScore_1 = mScore_1 + 2.5;
                    updateScore(mScore_1);

                    //check before button start

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }


                } else {

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });
        //End of Button Listener for Button2


        mButtonChoice3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice3_1.getText() == mAnswer_1) {

                    mScore_1 = mScore_1 + 2.5;
                    updateScore(mScore_1);

                    //check before button start

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }


                } else {

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });

        //button 4 Start

        mButtonChoice4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice4_1.getText() == mAnswer_1) {

                    mScore_1 = mScore_1 + 2.5;
                    updateScore(mScore_1);

                    //check before button start

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }


                } else {

                    if (mQuestionNumber_1 ==  QuestionLibrary2.mQuestionsTwo.length) {

                        Intent i = new Intent(QuizActivity2.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore_1);
                        i.putExtras(bundle);
                        QuizActivity2.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });
    }

    private void updateQuestion() {


        mQuestionView_1.setText(mQuestionLibrary2.getQuestionTwo(mQuestionNumber_1));
        mButtonChoice1_1.setText(mQuestionLibrary2.getChoice1_1(mQuestionNumber_1));
        mButtonChoice2_1.setText(mQuestionLibrary2.getChoice2_1(mQuestionNumber_1));
        mButtonChoice3_1.setText(mQuestionLibrary2.getChoice3_1(mQuestionNumber_1));
        mButtonChoice4_1.setText(mQuestionLibrary2.getChoice4_1(mQuestionNumber_1));

        mAnswer_1 = mQuestionLibrary2.getCorrectAnswer_1(mQuestionNumber_1);
        mQuestionNumber_1++;


    }


    private void updateScore (double point) {
        mScoreView_1.setText("" + mScore_1);

    }
}


