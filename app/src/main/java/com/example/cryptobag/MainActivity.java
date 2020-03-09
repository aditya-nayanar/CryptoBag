package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    String textToDisplay = "Here is my text";
    private final LinkedList<String> mWordList = new LinkedList<>();
    // Put initial data into the word list.

    private RecyclerView currencyList;
    private CoinListAdapter cAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 20; i++) {
            mWordList.addLast("Word " + i);
        }

        // Get a handle to the RecyclerView.
        currencyList = findViewById(R.id.coinList);
        // Create an adapter and supply the data to be displayed.
        cAdapter = new CoinListAdapter(this, mWordList);
        // Connect the adapter with the RecyclerView.
        currencyList.setAdapter(cAdapter);
        // Give the RecyclerView a default layout manager.
        currencyList.setLayoutManager(new LinearLayoutManager(this));

        /*Button toDetailedActivity = findViewById(R.id.toDetailedActivity);
        toDetailedActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("coin", "BCH");
                startActivity(intent);
            }
        });
*/
    }


}
