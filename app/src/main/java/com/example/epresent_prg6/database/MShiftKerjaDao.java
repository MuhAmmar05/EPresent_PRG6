package com.example.epresent_prg6.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.epresent_prg6.model.MHariLibur;
import com.example.epresent_prg6.model.MShiftKerja;
import com.example.epresent_prg6.model.VAbsensi;

import java.util.List;

@Dao
public interface MShiftKerjaDao {
    @Query("SELECT * FROM mshiftkerja")
    public LiveData<List<MShiftKerja>> getSifts();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MShiftKerja mShiftKerja);

    @Query("DELETE FROM mshiftkerja")
    void deleteAll();
}
