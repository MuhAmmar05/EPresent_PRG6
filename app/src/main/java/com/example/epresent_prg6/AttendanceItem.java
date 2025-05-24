package com.example.epresent_prg6;

public class AttendanceItem {
    private String date;
    private String time;
    private String status;

    public AttendanceItem(String date, String time, String status) {
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getStatus() { return status; }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
