package com.example.epresent_prg6;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

public class LoginFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login_fragment, container, false);
        String berhasil = "SafeArgs berhasil!";
        Button mTestButton = v.findViewById(R.id.login_button);
        mTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                LoginFragmentDirections.ActionLoginFragmentToHomeFragment action =
//                        LoginFragmentDirections.actionLoginFragmentToHomeFragment(parameter object);
                NavDirections action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(berhasil);

                NavController navController = NavHostFragment.findNavController(LoginFragment.this);
                navController.navigate(action);
            }
        });


        return v;
    }
}
