package com.example.epresent_prg6.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class MHariLibur {
    @PrimaryKey
    @NonNull
    private int id_hari_libur;
    private Date tanggal_mulai;
    private Date tanggal_selesai;
    private String deskripsi;
    private String tipe_libur;
    private int status;

    public MHariLibur() {
        this.id_hari_libur = 0;
        this.tanggal_mulai = new Date();
        this.tanggal_selesai = new Date();
        this.deskripsi = "";
        this.tipe_libur = "";
    }

    public int getId_hari_libur() {
        return id_hari_libur;
    }

    public void setId_hari_libur(int id_hari_libur) {
        this.id_hari_libur = id_hari_libur;
    }

    public Date getTanggal_mulai() {
        return tanggal_mulai;
    }

    public void setTanggal_mulai(Date tanggal_mulai) {
        this.tanggal_mulai = tanggal_mulai;
    }

    public Date getTanggal_selesai() {
        return tanggal_selesai;
    }

    public void setTanggal_selesai(Date tanggal_selesai) {
        this.tanggal_selesai = tanggal_selesai;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTipe_libur() {
        return tipe_libur;
    }

    public void setTipe_libur(String tipe_libur) {
        this.tipe_libur = tipe_libur;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
