package com.example.epresent_prg6.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.epresent_prg6.model.MHariLibur;
import com.example.epresent_prg6.model.MPengguna;
import com.example.epresent_prg6.model.MShiftKerja;
import com.example.epresent_prg6.model.VAbsensi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {MHariLibur.class, MPengguna.class, MShiftKerja.class, VAbsensi.class}, version = 1)
@TypeConverters(AllTypeConverters.class)
public abstract class AllDatabase extends RoomDatabase {
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public abstract MHariLiburDao mHariLiburDao();
    public abstract MPenggunaDao mPenggunaDao();
    public abstract MShiftKerjaDao mShiftKerjaDao();
    public abstract VAbsensiDao vAbsensiDao();
}
