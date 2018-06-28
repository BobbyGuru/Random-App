package com.example.bobby.randomapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Multiplication extends AppCompatActivity {

    TextView user;
    EditText ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
    }


    public void nextQuestion(View view) {
        //generate 2 Random numbers

        Integer num1, num2;
        num1=generateRandomNumber(100);
        num2=generateRandomNumber(100);

        //set random number in textview
        TextView tv;
        tv=findViewById(R.id.question);
        tv.setText(Integer.toString(num1)+ "X" + Integer.toString(num2));

    }

    public void checkAnswer(View view) {
        //read the text/question from textview
        TextView tv=findViewById(R.id.question);
        String question=tv.getText().toString();

        //split the question into numbers
        String [] numbers=question.split("X");


        //convert the numbers into integer
        Integer num1, num2;
        num1=Integer.valueOf(numbers[0]);
        num2=Integer.valueOf(numbers[1]);


        user=findViewById(R.id.printAns);
        ans=findViewById(R.id.answer);
        Integer uer=Integer.parseInt(ans.getText().toString());



        int total=uer;


        if (num1*num2==total){
            user.setText("Your answer is correct");

        }else{
            user.setText("Try Again");
        }



    }

    public int generateRandomNumber(int limit) {
        Random r = new Random();
        Integer i;
        i = r.nextInt(limit);

        return i;
    }
}
