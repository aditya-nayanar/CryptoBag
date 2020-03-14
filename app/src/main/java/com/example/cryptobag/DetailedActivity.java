package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.TextView;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class DetailedActivity extends AppCompatActivity {
private static final String TAG = "DetailedActivity";
    private final List<Coin> mCoinList = Coin.getCoins();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent intent = getIntent();
        Coin coin = null;
        if(intent.getExtras() != null)

        {
            Bundle extra = intent.getExtras();
            coin = mCoinList.get(extra.getInt("pos"));
        }

        Coin selectedCoin = coin;

        TextView name = findViewById(R.id.name);
        name.setText(selectedCoin.getName());
        TextView symbol = findViewById(R.id.symbol);
        symbol.setText(selectedCoin.getSymbol());
        TextView value = findViewById(R.id.value);
        value.setText(Double.toString(selectedCoin.getValue()));
        TextView change1h = findViewById(R.id.change1h);
        change1h.setText(Double.toString(selectedCoin.getChange1h()));
        TextView change24h = findViewById(R.id.change24h);
        change24h.setText(Double.toString(selectedCoin.getChange24h()));
        TextView change7d = findViewById(R.id.change7d);
        change7d.setText(Double.toString(selectedCoin.getChange7d()));
        TextView marketcap = findViewById(R.id.marketcap);
        marketcap.setText(Double.toString(selectedCoin.getMarketcap()));
        TextView volume = findViewById(R.id.volume);
        volume.setText(Double.toString(selectedCoin.getVolume()));
        final String searchvalue = selectedCoin.getName();

        ImageButton search = findViewById(R.id.searchButton);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com.au/search?q="+searchvalue+" Cryptocurrency rate"));
                startActivity(intent);
            }
        });
    }
}
