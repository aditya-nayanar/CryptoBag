package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.TextView;
import android.util.Log;

public class DetailedActivity extends AppCompatActivity {
private static final String TAG = "DetailedActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Button toVideo = findViewById(R.id.toVideo);
        toVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=mWsvsE27nOY"));
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String textToShowString = intent.getStringExtra("message");

        TextView textPlaceholder = findViewById(R.id.detailedText);
        textPlaceholder.setText(textToShowString);
    }
}
