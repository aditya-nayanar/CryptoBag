package com.example.cryptobag;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptobag.Entities.Coin;

import java.util.LinkedList;
import java.util.List;

public class CoinListAdapter extends RecyclerView.Adapter<CoinListAdapter.CoinViewHolder>{
    private static final String TAG = "CoinListAdapter";
    //private final LinkedList<String> mWordList;
    private  List<Coin> mCoinList;
    private LayoutInflater mInflater;
    boolean mIsDualPane;
    private Context context;

    public CoinListAdapter(Context context,
                           List<Coin> coinList) {
        mInflater = LayoutInflater.from(context);
        this.mCoinList = coinList;
    }

    @NonNull
    @Override
    public CoinListAdapter.CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.coinlist_item,
                parent, false);
        return new CoinViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinListAdapter.CoinViewHolder holder, int position) {

        Coin mCurrent = mCoinList.get(position);
        String mName = mCurrent.getName();
        holder.coinName.setText(mName);
        String mValue = mCurrent.getPriceUsd();
        holder.value.setText("$"+mValue);
        String mPercentage = mCurrent.getPercentChange1h();
        holder.percentage.setText(mPercentage+ " %");
    }

    @Override
    public int getItemCount() {
        return mCoinList.size();
    }

    public void setData(List<Coin> coins){
        mCoinList.clear();
        this.mCoinList = coins;
    }


    class CoinViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //public final TextView coinItemView;
        public final TextView coinName;
        public final TextView value;
        public final TextView percentage;
        final CoinListAdapter mAdapter;

        public CoinViewHolder(View itemView, CoinListAdapter adapter) {
            super(itemView);
            coinName = itemView.findViewById(R.id.name);
            value = itemView.findViewById(R.id.value);
            percentage = itemView.findViewById(R.id.percentage);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Coin coin = mCoinList.get(mPosition);
            Log.d(TAG, "Launch ONCLICK");
            View articleView = v.getRootView().findViewById(R.id.tablet_coinDetails);
            mIsDualPane = articleView != null &&
                    articleView.getVisibility() == View.VISIBLE;
            Log.d(TAG, Boolean.toString(mIsDualPane));
            if(mIsDualPane){
            DetailFragment fragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("pos", coin);
            fragment.setArguments(bundle);
                ((FragmentActivity) v.getContext()).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.tablet_coinDetails, fragment)
                        .commit();
            }else {
                Log.d(TAG, "Launching Intent");
                Intent intent = new Intent(v.getContext(), DetailedActivity.class);
                intent.putExtra("pos", coin);
                v.getContext().startActivity(intent);
            }
        }
    }

}
