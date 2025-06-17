package com.example.epresent_prg6.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class VAbsensi {
    @PrimaryKey
    @NonNull
    private int id_absensi;
    private Date tanggal;
    private LocalTime jam_masuk;
    private LocalTime jam_keluar;
    private String shift_kerja;
    private String status_kehadiran;
    private String bukti_kehadiran;
    private String jenis_izin;
    private String keterangan;
    private String bukti_izin;

    public VAbsensi(){
        this.id_absensi = 0;
        this.tanggal = new Date();
        this.jam_masuk = LocalTime.now();
        this.jam_keluar = LocalTime.now();
    }

    public int getId_absensi() {
        return id_absensi;
    }

    public void setId_absensi(int id_absensi) {
        this.id_absensi = id_absensi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public LocalTime getJam_masuk() {
        return jam_masuk;
    }

    public void setJam_masuk(LocalTime jam_masuk) {
        this.jam_masuk = jam_masuk;
    }

    public LocalTime getJam_keluar() {
        return jam_keluar;
    }

    public void setJam_keluar(LocalTime jam_keluar) {
        this.jam_keluar = jam_keluar;
    }

    public String getShift_kerja() {
        return shift_kerja;
    }

    public void setShift_kerja(String shift_kerja) {
        this.shift_kerja = shift_kerja;
    }

    public String getStatus_kehadiran() {
        return status_kehadiran;
    }

    public void setStatus_kehadiran(String status_kehadiran) {
        this.status_kehadiran = status_kehadiran;
    }

    public String getBukti_kehadiran() {
        return bukti_kehadiran;
    }

    public void setBukti_kehadiran(String bukti_kehadiran) {
        this.bukti_kehadiran = bukti_kehadiran;
    }

    public String getJenis_izin() {
        return jenis_izin;
    }

    public void setJenis_izin(String jenis_izin) {
        this.jenis_izin = jenis_izin;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getBukti_izin() {
        return bukti_izin;
    }

    public void setBukti_izin(String bukti_izin) {
        this.bukti_izin = bukti_izin;
    }
}
