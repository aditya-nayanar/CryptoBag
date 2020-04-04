package com.example.cryptobag;

import com.example.cryptobag.Entities.CoinLoreResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {
    @GET("api/tickers")
    Call<CoinLoreResponse> getCoinList();
}
