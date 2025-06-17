package com.example.epresent_prg6.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.epresent_prg6.model.MHariLibur;
import com.example.epresent_prg6.model.VAbsensi;

import java.util.List;

@Dao
public interface VAbsensiDao {
    @Query("SELECT * FROM vabsensi")
    public LiveData<List<VAbsensi>> getPresents();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(VAbsensi vAbsensi);

    @Query("DELETE FROM vabsensi")
    void deleteAll();
}
