package com.example.android.familiarmequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Test;

public class FamiliarMe_Quiz extends AppCompatActivity {
    int score = 0;
    EditText text_twitter, text_gmail;
    RadioButton questiontwo;
    private Button submit_button;
    RadioGroup radio_group;
    CheckBox question_three, question_four, question_five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiar_me__quiz);
        text_twitter=(EditText)findViewById(R.id.twitter_text);
        text_gmail=(EditText)findViewById(R.id.gmail_text);
        questiontwo=(RadioButton)findViewById(R.id.communicate_pictures);
        submit_button=(Button)findViewById(R.id.results_button);
        radio_group=(RadioGroup)findViewById(R.id.radio_group);
        question_three=(CheckBox)findViewById(R.id.reconnect_friends);
        question_four=(CheckBox)findViewById(R.id.broadcast_thoughts);
        question_five=(CheckBox)findViewById(R.id.promote_business);
    }

    /**
     * This button allows you to go back to the MainActivity.
     *
     * @param v
     */
    public void go_back_button(View v) {
        startActivity(new Intent(FamiliarMe_Quiz.this, MainActivity.class));
    }

    /**
     * This is for answering all of the quiz questions and getting the results of the quiz.
     */
    public void Correct_Answers(View v) {

        EditText text_twitter = (EditText) findViewById(R.id.twitter_text);

        String response_twitter = text_twitter.getText().toString();

        if (response_twitter.toLowerCase().contains("twitter")) {

            score += 1;}
        else {
            score = 0;
        }

        EditText text_gmail = (EditText) findViewById(R.id.gmail_text);

        String response_gmail = text_gmail.getText().toString();

        if (response_gmail.toLowerCase().contains("gmail")) {

            score += 1;}
        else {
            score = 0;
        }

        RadioButton questiontwo = (RadioButton) findViewById(R.id.communicate_pictures);
        boolean answertwoischecked = questiontwo.isChecked();

        if (answertwoischecked) {

            score += 1;}
        else {
            score = 0;
        }
        CheckBox questionthree = (CheckBox) findViewById(R.id.reconnect_friends);

        boolean questionthreeischecked = questionthree.isChecked();

        if (questionthreeischecked) {

            score += 1;}
        else {
            score = 0;
        }
        CheckBox questionfour = (CheckBox) findViewById(R.id.broadcast_thoughts);

        boolean questionfourischecked = questionfour.isChecked();

        if (questionfourischecked) {

            score += 1;}
        else {
            score = 0;
        }
        CheckBox questionfive = (CheckBox) findViewById(R.id.promote_business);

        boolean questionfiveischecked = questionfive.isChecked();

        if (questionfiveischecked) {

            score += 1;}
        else {
            score = 0;
        }
        submit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "You scored" + score + "points out of a possible 6 points!", Toast.LENGTH_SHORT ).show();
            }
        });
    }
}