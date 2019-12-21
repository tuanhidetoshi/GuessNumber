package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int myNum = (int) (Math.random() * 20 + 1);
    public void onGuess(View view) {
        TextView guessNum = findViewById(R.id.inputNum);
        String clientNum = guessNum.getText().toString();
        Log.i("Info", "Btn was clicked!");
        Log.i("Guess", clientNum);
        Log.i("Num",  Integer.toString(myNum));
        if(myNum > Integer.valueOf(clientNum)) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        } else if (myNum < Integer.valueOf(clientNum)) {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        } else {
            myNum = (int) (Math.random() * 20 + 1);
            Toast.makeText(this, "You are right and I was thinking about another one...", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
