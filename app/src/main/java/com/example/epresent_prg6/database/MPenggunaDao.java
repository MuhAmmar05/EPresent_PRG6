package com.example.epresent_prg6.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.epresent_prg6.model.MHariLibur;
import com.example.epresent_prg6.model.MPengguna;
import com.example.epresent_prg6.model.VAbsensi;

import java.util.List;

@Dao
public interface MPenggunaDao {
    @Query("SELECT * FROM mpengguna")
    public LiveData<List<MPengguna>> getUsers();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MPengguna mPengguna);

    @Query("DELETE FROM mpengguna")
    void deleteAll();
}
