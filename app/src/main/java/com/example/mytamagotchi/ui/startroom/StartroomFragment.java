package com.example.mytamagotchi.ui.startroom;

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

import com.example.mytamagotchi.databinding.FragmentStartroomBinding;

public class StartroomFragment extends Fragment {

    private StartroomViewModel startroomViewModel;
    private FragmentStartroomBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        startroomViewModel =
                new ViewModelProvider(this).get(StartroomViewModel.class);

        binding = FragmentStartroomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textStartroom;
        startroomViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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