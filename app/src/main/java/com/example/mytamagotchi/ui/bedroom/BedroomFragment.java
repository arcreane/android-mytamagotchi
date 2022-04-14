package com.example.mytamagotchi.ui.bedroom;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mytamagotchi.MainActivity;
import com.example.mytamagotchi.R;
import com.example.mytamagotchi.Tamagochi;
import com.example.mytamagotchi.databinding.FragmentBedroomBinding;

public class BedroomFragment extends Fragment {

    private BedroomViewModel bedroomViewModel;
    private FragmentBedroomBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bedroomViewModel = new ViewModelProvider(this).get(BedroomViewModel.class);
        bedroomViewModel.setTamagochi(((MainActivity)getActivity()).getMyTamagochi());

        binding = FragmentBedroomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button myButton = root.findViewById(R.id.button_send);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Button", "clicked bedroom button");
            }
        });

        final TextView textView = binding.textBedroom;
        bedroomViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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