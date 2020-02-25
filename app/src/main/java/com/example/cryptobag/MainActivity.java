package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String textToDisplay = "Here is my text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toDetailedActivity = findViewById(R.id.toDetailedActivity);
        toDetailedActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailedActivity.class));

                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("message", textToDisplay);
                startActivity(intent);
            }
        });
        TextView text = findViewById(R.id.textView);
        text.setText(textToDisplay);

    }


}
