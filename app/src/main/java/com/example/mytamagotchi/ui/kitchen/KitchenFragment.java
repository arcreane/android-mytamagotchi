package com.example.mytamagotchi.ui.kitchen;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mytamagotchi.MainActivity;
import com.example.mytamagotchi.R;
import com.example.mytamagotchi.Tamagochi;
import com.example.mytamagotchi.databinding.FragmentKitchenBinding;

public class KitchenFragment extends Fragment {

    private KitchenViewModel kitchenViewModel;
    private FragmentKitchenBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kitchenViewModel = new ViewModelProvider(this).get(KitchenViewModel.class);
        kitchenViewModel.setTamagochi(((MainActivity)getActivity()).getMyTamagochi());

        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ImageButton myButton = root.findViewById(R.id.button_send);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Button", "clicked kitchen button");
                Tamagochi tamagochi = ((MainActivity) getActivity()).getMyTamagochi();
                if (tamagochi.hunger > 95){
                    tamagochi.hunger = 100;
                }
                else {
                    tamagochi.hunger = tamagochi.hunger + 5;
                }
                if (tamagochi.thirst > 95){
                    tamagochi.thirst = 100;
                }
                else{
                    tamagochi.thirst = tamagochi.thirst + 5;
                }


            }
        });

        kitchenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

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