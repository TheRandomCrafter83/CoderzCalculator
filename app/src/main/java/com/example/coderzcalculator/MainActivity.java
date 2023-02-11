package com.example.coderzcalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.coderzcalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.entryText.observe(this, entryText -> {
            if(entryText.contains(".")) {
                binding.txtEntry.setText(entryText);
            } else {
                String s = entryText + ".";
                binding.txtEntry.setText(s);
            }
        });

        binding.btn0.setOnClickListener(view -> viewModel.addCharacter(0));

        binding.btn1.setOnClickListener(view -> viewModel.addCharacter(1));

        binding.btn2.setOnClickListener(view -> viewModel.addCharacter(2));

        binding.btn3.setOnClickListener(view -> viewModel.addCharacter(3));

        binding.btn4.setOnClickListener(view -> viewModel.addCharacter(4));

        binding.btn5.setOnClickListener(view -> viewModel.addCharacter(5));

        binding.btn6.setOnClickListener(view -> viewModel.addCharacter(6));

        binding.btn7.setOnClickListener(view -> viewModel.addCharacter(7));

        binding.btn8.setOnClickListener(view -> viewModel.addCharacter(8));

        binding.btn9.setOnClickListener(view -> viewModel.addCharacter(9));

        binding.btnDecimal.setOnClickListener(view -> viewModel.addDecimal());

        binding.btnClear.setOnClickListener(view -> viewModel.clearEntry());

        binding.btnBackspace.setOnClickListener(view -> viewModel.deleteLastCharacter());

    }
}