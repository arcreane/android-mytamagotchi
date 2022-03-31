package com.example.mytamagotchi.ui.bathroom;

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

import com.example.mytamagotchi.R;
import com.example.mytamagotchi.databinding.FragmentBathroomBinding;

public class BathroomFragment extends Fragment {

    private BathroomViewModel bathroomViewModel;
    private FragmentBathroomBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bathroomViewModel = new ViewModelProvider(this).get(BathroomViewModel.class);

        binding = FragmentBathroomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBathroom;
        bathroomViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}