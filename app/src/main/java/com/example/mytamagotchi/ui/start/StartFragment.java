package com.example.mytamagotchi.ui.start;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mytamagotchi.R;
import com.example.mytamagotchi.databinding.StartFragmentBinding;
import com.example.mytamagotchi.ui.bathroom.BathroomFragment;
import com.example.mytamagotchi.ui.bathroom.BathroomViewModel;

public class StartFragment extends Fragment {

    private StartViewModel mViewModel;
    private StartFragmentBinding binding;

    public static StartFragment newInstance() {
        return new StartFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = StartFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        // Buttons to choose starter Tamagochi
        Button myButton = root.findViewById(R.id.button_tamagochi_1);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Button", "clicked tamagochi_2 button");
            }
        });

        Button myButton1 = root.findViewById(R.id.button_tamagochi_2);
        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Button", "clicked tamagochi_2 button");
            }
        });

        Button myButton2 = root.findViewById(R.id.button_tamagochi_3);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Button", "clicked tamagochi_3 button");
            }
        });

        return inflater.inflate(R.layout.start_fragment, container, false);

    }
/*    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }*/

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(StartViewModel.class);
        // TODO: Use the ViewModel
    }

}