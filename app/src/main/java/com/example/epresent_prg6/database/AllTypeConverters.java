package com.example.epresent_prg6.database;

import androidx.room.TypeConverter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public class AllTypeConverters {
    @TypeConverter
    public Long fromDate(Date date) {
        if (date == null) {
            return null;
        } else {
            return date.getTime();
        }
    }

    @TypeConverter
    public Date toDate(Long millisSinceEpoch) {
        if (millisSinceEpoch == null) {
            return new Date();
        } else {
            return new Date(millisSinceEpoch);
        }
    }

    @TypeConverter
    public UUID toUUID(String uuid) {
        if (uuid == null) {
            return UUID.randomUUID();
        } else {
            return UUID.fromString(uuid);
        }
    }

    @TypeConverter
    public String fromUUID(UUID uuid) {
        if (uuid == null) return null;
        else return uuid.toString();
    }

    @TypeConverter
    public static String fromLocalTime(LocalTime time) {
        return time != null ? time.format(DateTimeFormatter.ISO_LOCAL_TIME) : null;
    }

    @TypeConverter
    public static LocalTime toLocalTime(String timeString) {
        return timeString != null ? LocalTime.parse(timeString, DateTimeFormatter.ISO_LOCAL_TIME) : null;
    }

}
