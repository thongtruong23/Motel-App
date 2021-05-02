package com.example.motelroom.ui.phongtro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.motelroom.R;

public class PhongTroFragment extends Fragment {

    private PhongTroViewModel phongTroViewMode;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        phongTroViewMode =
                new ViewModelProvider(this).get(PhongTroViewModel.class);
        View root = inflater.inflate(R.layout.fragment_phongtro, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        phongTroViewMode.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}