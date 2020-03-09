package com.example.cryptobag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

public class CoinListAdapter extends RecyclerView.Adapter<CoinListAdapter.CoinViewHolder> {

    //private final LinkedList<String> mWordList;
    private final List<Coin> mCoinList;
    private LayoutInflater mInflater;

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
        String mValue = Double.toString(mCurrent.getValue());
        holder.value.setText("$"+mValue);
        String mPercentage = Double.toString(mCurrent.getChange1h());
        holder.percentage.setText(mPercentage+ " %");
    }

    @Override
    public int getItemCount() {
        return mCoinList.size();
    }


    class CoinViewHolder extends RecyclerView.ViewHolder {
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
        }
    }
}
