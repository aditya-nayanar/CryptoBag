package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cryptobag.Entities.Coin;
import com.example.cryptobag.Entities.CoinLoreResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    List<Coin> newCoinList = CoinLoreResponse.getCoinList();
    List<Coin> secondList = new ArrayList<>();

    private RecyclerView currencyList;
    private CoinListAdapter cAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Launch ONCREATE");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                    currencyList = findViewById(R.id.coinList);
                    if(currencyList != null) {
                        // Create an adapter and supply the data to be displayed.
                        cAdapter = new CoinListAdapter(MainActivity.this, new ArrayList<>());
                        new MyTask().execute();

                        // Connect the adapter with the RecyclerView.
                        currencyList.setAdapter(cAdapter);
                        // Give the RecyclerView a default layout manager.
                        currencyList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    }
    }

    public class MyTask extends AsyncTask<Void, Integer, Integer>{

        Retrofit rf = new Retrofit.Builder()
                .baseUrl("https://api.coinlore.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CoinService cs = rf.create(CoinService.class);
        List<Coin> newCoinList;

        @Override
        protected Integer doInBackground(Void... voids) {
        try {
            Call<CoinLoreResponse> coinListCall = cs.getCoinList();
            Response<CoinLoreResponse> clr = coinListCall.execute();
            newCoinList = clr.body().getData();
        }catch(IOException e){
            e.printStackTrace();
        }
            return null;
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            cAdapter.setData(newCoinList);
            cAdapter.notifyDataSetChanged();
            Toast.makeText(MainActivity.this, "Coin list has been refreshed", Toast.LENGTH_SHORT).show();
        }
    }


}
