package com.example.epresent_prg6.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.time.LocalTime;

@Entity(foreignKeys = @ForeignKey(entity = MShiftKerja.class,
        parentColumns = "id_shift",
        childColumns = "id_shift",
        onDelete = ForeignKey.CASCADE, // Atau aksi lain seperti SET_NULL, RESTRICT
        onUpdate = ForeignKey.CASCADE), // Atau aksi lain
        indices = {@Index(value = {"id_shift"})}) // Membuat index pada foreign key untuk performa
public class MPengguna {
    @PrimaryKey
    @NonNull
    private String id_pengguna;
    private String username;
    private String password;
    private String nama_lengkap;
    private String alamat_bekerja;
    private String foto_pengguna;
    private String id_shift;
    private int status;

    public MPengguna() {
        this.id_pengguna = "";
        this.username = "";
        this.password = "";
        this.nama_lengkap = "";
        this.alamat_bekerja = "";
    }

    @NonNull
    public String getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(@NonNull String id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getAlamat_bekerja() {
        return alamat_bekerja;
    }

    public void setAlamat_bekerja(String alamat_bekerja) {
        this.alamat_bekerja = alamat_bekerja;
    }

    public String getFoto_pengguna() {
        return foto_pengguna;
    }

    public void setFoto_pengguna(String foto_pengguna) {
        this.foto_pengguna = foto_pengguna;
    }

    public String getId_shift() {
        return id_shift;
    }

    public void setId_shift(String id_shift) {
        this.id_shift = id_shift;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
