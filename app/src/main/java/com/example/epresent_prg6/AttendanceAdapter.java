package com.example.epresent_prg6;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder> {

    private List<AttendanceItem> attendanceList;
    private Context context;

    public AttendanceAdapter(Context context, List<AttendanceItem> attendanceList) {
        this.context = context;
        this.attendanceList = attendanceList;
    }

    @NonNull
    @Override
    public AttendanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.attendance_item, parent, false);
        return new AttendanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttendanceViewHolder holder, int position) {
        AttendanceItem attendance = attendanceList.get(position);
        holder.tvStatus.setText(attendance.getStatus());
        holder.tvDate.setText(attendance.getDate());
        holder.tvTime.setText(attendance.getTime());

        if (attendance.getStatus().equalsIgnoreCase("Masuk")) {
            holder.ivStatusIcon.setImageResource(R.drawable.riwayat_ic_clock_green);
            holder.tvStatus.setTextColor(ContextCompat.getColor(context, R.color.custom_green));
        } else if (attendance.getStatus().equalsIgnoreCase("Terlambat")) {
            holder.ivStatusIcon.setImageResource(R.drawable.riwayat_ic_clock_orange);
            holder.tvStatus.setTextColor(ContextCompat.getColor(context, R.color.custom_orange));
        } else if (attendance.getStatus().equalsIgnoreCase("Tidak Hadir")) {
            holder.ivStatusIcon.setImageResource(R.drawable.riwayat_ic_clock_red);
            holder.tvStatus.setTextColor(ContextCompat.getColor(context, R.color.custom_red));
        }
    }

    @Override
    public int getItemCount() {
        return attendanceList.size();
    }

    public static class AttendanceViewHolder extends RecyclerView.ViewHolder {
        ImageView ivStatusIcon;
        TextView tvStatus, tvDate, tvTime;

        public AttendanceViewHolder(@NonNull View itemView) {
            super(itemView);
            ivStatusIcon = itemView.findViewById(R.id.iv_status_icon);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvTime = itemView.findViewById(R.id.tv_time);
        }
    }
}
