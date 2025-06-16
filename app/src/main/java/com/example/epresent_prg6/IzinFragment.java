package com.example.epresent_prg6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class IzinFragment extends Fragment {
    private AutoCompleteTextView dropdownJenisIzin;
    private ArrayAdapter<String> adapterJenisIzin;

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
        return view;
    }
}
