package com.example.admin.multiplechoicequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {



   TextView point;
   TextView score_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       score_text = findViewById(R.id.score_text);
       point = findViewById(R.id.point);



        Bundle bundle = getIntent().getExtras();
        double score = bundle.getDouble("finalScore");

        point.setText( ""+ score);











    }
}
