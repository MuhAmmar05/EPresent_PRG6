package com.example.epresent_prg6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AttendanceListFragment extends Fragment {

    private RecyclerView recyclerView;
    private AttendanceAdapter adapter;
    private List<AttendanceItem> attendanceList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.attendance_list_fragment, container, false);
        recyclerView = view.findViewById(R.id.recycler_view_attendance);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Sample data
        attendanceList = new ArrayList<>();
        attendanceList.add(new AttendanceItem("2024-01-14", "08:00", "Masuk")); // Correct order
        attendanceList.add(new AttendanceItem("2024-01-15", "09:30", "Terlambat"));
        attendanceList.add(new AttendanceItem("2024-01-16", "-", "Tidak Hadir"));
        attendanceList.add(new AttendanceItem("2024-01-14", "08:00", "Masuk")); // Correct order
        attendanceList.add(new AttendanceItem("2024-01-15", "09:30", "Terlambat"));
        attendanceList.add(new AttendanceItem("2024-01-16", "-", "Tidak Hadir"));
        attendanceList.add(new AttendanceItem("2024-01-14", "08:00", "Masuk")); // Correct order
        attendanceList.add(new AttendanceItem("2024-01-15", "09:30", "Terlambat"));
        attendanceList.add(new AttendanceItem("2024-01-16", "-", "Tidak Hadir"));
        attendanceList.add(new AttendanceItem("2024-01-14", "08:00", "Masuk")); // Correct order
        attendanceList.add(new AttendanceItem("2024-01-15", "09:30", "Terlambat"));
        attendanceList.add(new AttendanceItem("2024-01-16", "-", "Tidak Hadir"));

        adapter = new AttendanceAdapter(getContext(), attendanceList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
