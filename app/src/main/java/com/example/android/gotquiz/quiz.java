package com.example.android.gotquiz;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by RAJAT on 19-03-2018.
 */


public class quiz extends Activity {


    int quizScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }



    public void displayScore(View view) {


        RadioGroup radioGroupSelected = findViewById(R.id.q1o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q1o3) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q2o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q2o1) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q3o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q3o1) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q4o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q4o3) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q5o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q5o1) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q6o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q6o2) {
            quizScore++;
        }
        radioGroupSelected = findViewById(R.id.q7o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q7o2) {
            quizScore++;
        }

        CheckBox checkBox0 = findViewById(R.id.q8o1);
        CheckBox checkBox1 = findViewById(R.id.q8o2);
        CheckBox checkBox2 = findViewById(R.id.q8o3);
        CheckBox checkBox3 = findViewById(R.id.q8o4);

        if (checkBox0.isChecked() && checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked()) {
            quizScore++;
        }

        radioGroupSelected = findViewById(R.id.q9o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q9o4) {
            quizScore++;
        }

        radioGroupSelected = findViewById(R.id.q10o);
        if (radioGroupSelected.getCheckedRadioButtonId() == R.id.q10o1) {
            quizScore++;
        }

        EditText textfield = findViewById(R.id.q11o);
        String q11 = textfield.getText().toString();
        if (q11.equals("Bran")) {
            quizScore++;
        }


        RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.ratingBar); // initiate a rating bar
        float ratingNumber = simpleRatingBar.getRating(); // get rating number from a rating bar

        TextView tv = findViewById(R.id.submit_btn);
        tv.setText("Your score = "+quizScore);

        if (ratingNumber == 5.0) {
            Toast.makeText(this, "You rated 5, You are true GOT Fan!!", Toast.LENGTH_SHORT).show();
            ratingNumber = 0;
        } else {
            Toast.makeText(this, "You are not a True GOT Fan, unless you rate 5 Stars!!", Toast.LENGTH_SHORT).show();
            ratingNumber = 0;
        }
        quizScore = 0;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                TextView tv = findViewById(R.id.submit_btn);
                tv.setText("SUBMIT");
            }
        }, 3000);
    }
}