package com.example.admin.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
 //

     public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button mButtonChoice4;


    public String mAnswer;
    public double mScore = 0.0;
    public int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer) {

                    mScore = mScore + 2.5;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {

                         updateQuestion();
                    }


                } else {

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer) {

                    mScore = mScore + 2.5;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }

                } else {

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });


        //End of Button Listener for Button2


        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Start of Button Listener for Button3


                if (mButtonChoice3.getText() == mAnswer) {

                    mScore = mScore + 2.5;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }




                } else {

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mButtonChoice4.getText() == mAnswer) {

                    mScore = mScore + 2.5;
                    updateScore(mScore);

                    //check before button start

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {

                        updateQuestion();
                    }



                } else {

                    if (mQuestionNumber ==  QuestionLibrary.mQuestions.length) {

                        Intent i = new Intent(QuizActivity.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);

                    } else {
                        updateQuestion();

                    }
                }

            }
        });


    }

    private void updateQuestion() {


            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;


        }


        private void updateScore (double point) {
            mScoreView.setText("" + mScore);

        }
        }

















