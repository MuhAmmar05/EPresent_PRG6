package com.example.epresent_prg6.model;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalTime;

@Entity
public class MShiftKerja {
    @PrimaryKey
    @NonNull
    private String id_shift;
    private String deskripsi;
    private LocalTime jam_masuk;
    private LocalTime jam_pulang;
    private int status;

    public MShiftKerja() {
        this.id_shift = "";
        this.deskripsi = "";
        this.jam_masuk = LocalTime.now();
        this.jam_pulang = LocalTime.now();
        this.status = 0;
    }

    @NonNull
    public String getId_shift() {
        return id_shift;
    }

    public void setId_shift(@NonNull String id_shift) {
        this.id_shift = id_shift;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public LocalTime getJam_masuk() {
        return jam_masuk;
    }

    public void setJam_masuk(LocalTime jam_masuk) {
        this.jam_masuk = jam_masuk;
    }

    public LocalTime getJam_pulang() {
        return jam_pulang;
    }

    public void setJam_pulang(LocalTime jam_pulang) {
        this.jam_pulang = jam_pulang;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
