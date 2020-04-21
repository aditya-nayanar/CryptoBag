package com.example.cryptobag;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cryptobag.Entities.Coin;

import java.util.List;

@Dao
public interface CoinDao {

    @Query("SELECT * FROM coin")
    List<Coin> getCoins();

    @Query("SELECT * FROM coin")
    Coin getCoin();

    @Insert
    void insertCoins(Coin...coins);

    @Query("DELETE FROM coin")
    void deleteCoins();
}


