package com.example.mytamagotchi.ui.kitchen;

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

import com.example.mytamagotchi.databinding.FragmentKitchenBinding;

public class KitchenFragment extends Fragment {

    private KitchenViewModel kitchenViewModel;
    private FragmentKitchenBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kitchenViewModel = new ViewModelProvider(this).get(KitchenViewModel.class);

        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKitchen;
        kitchenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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