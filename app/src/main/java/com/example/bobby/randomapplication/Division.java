package com.example.bobby.randomapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Division extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
    }

    public int generateRandomNumber(int limit) {
        Random r = new Random();
        Integer i;
        i = r.nextInt(limit);
        return i;

    }

    public void nextQuestion(View view) {
        //generate 2 Random numbers

        Integer num1, num2;
        num1 = generateRandomNumber(100);
        num2 = generateRandomNumber(10);

        //set random number in textview
        TextView tv;
        tv = findViewById(R.id.question);
        tv.setText(Integer.toString(num1) + " " + "/" + " " + Integer.toString(num2));

    }

    public void checkAnswer(View view) {
        //read the text/question from textview
        TextView tv = findViewById(R.id.question);
        String question = tv.getText().toString();

        //split the question into numbers
        String numbers[] = question.split(" ");


        //convert the numbers into integer
        Integer num1, num2;
        num1 = Integer.valueOf(numbers[0]);
        num2 = Integer.valueOf(numbers[2]);

        EditText answer = findViewById(R.id.answer);
        String ans = answer.getText().toString();
        int ans_int = Integer.valueOf(ans);

        TextView tx = findViewById(R.id.printAns);

        int sum = (num1 / num2);


        if (ans_int == sum) {
            tx.setText("Your answer is Correct");

        } else {
            tx.setText("Try Again");
        }

    }
}
