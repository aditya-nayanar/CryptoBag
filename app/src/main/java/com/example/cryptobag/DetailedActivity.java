package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.TextView;
import android.util.Log;

import com.example.cryptobag.Entities.Coin;

import java.util.ArrayList;
import java.util.List;

public class DetailedActivity extends AppCompatActivity {
private static final String TAG = "DetailedActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent intent = getIntent();
        Coin coin = new Coin();
        if(intent.getExtras() != null)

        {
            Bundle extra = intent.getExtras();
            coin= (Coin) extra.getSerializable("pos");
        }

        DetailFragment fragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pos", coin);
        fragment.setArguments(bundle);
        FragmentManager myManager = getSupportFragmentManager();
        FragmentTransaction myTransaction = myManager.beginTransaction();
        myTransaction.replace(R.id.tablet_coinDetails, fragment);
        myTransaction.commit();
    }
}
