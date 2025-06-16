package com.example.epresent_prg6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class IzinFragment extends Fragment {
    private AutoCompleteTextView dropdownJenisIzin;
    private ArrayAdapter<String> adapterJenisIzin;
    private MaterialDatePicker<Pair<Long, Long>> datePicker;
    private TextInputEditText mInputTgl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_izin, container, false);
        dropdownJenisIzin = view.findViewById(R.id.dropdown_jenis_izin); // inisialisasi dropdown jenis izin
        adapterJenisIzin = new ArrayAdapter<>( // isi array untuk dropdown
                requireContext(),
                android.R.layout.simple_dropdown_item_1line,
                getResources().getStringArray(R.array.jenisIzin)
                );
        dropdownJenisIzin.setAdapter(adapterJenisIzin);

        mInputTgl = view.findViewById(R.id.inputTglIzin); // inisialisasi input tanggal izin
//        inisialisasi date picker
        MaterialDatePicker.Builder<Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker()
                .setTitleText("Pilih tanggal izin")
                .setSelection(new Pair<>(
                        MaterialDatePicker.todayInUtcMilliseconds(),
                        MaterialDatePicker.todayInUtcMilliseconds()
                ));
        datePicker = builder.build();

//        handle date selection
        datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Pair<Long, Long>>() {
            @Override
            public void onPositiveButtonClick(Pair<Long, Long> selection) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
                String startDate = sdf.format(selection.first);
                String endDate = sdf.format(selection.second);
                mInputTgl.setText(startDate + " - " + endDate);
            }
        });
        mInputTgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker.show(getParentFragmentManager(), "DATE_RANGE_PICKER");
            }
        });
        return view;
    }
}
