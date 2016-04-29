package com.example.owner.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    private void increment(){
        this.counter++;
        displayOnText();
    }

    private void decrement(){
        this.counter--;
        displayOnText();
    }

    public void displayOnText() {
        TextView textView = (TextView) findViewById(R.id.myTextView);
        textView.setText(this.counter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button incrementButton = (Button) findViewById(R.id.plus);
        Button decrementButton = (Button) findViewById(R.id.minus);

        incrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                MainActivity.this.increment();
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               MainActivity.this.decrement();
            }
        });

    }
}
