package com.sample.mvvm_sample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CounterViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        final TextView countText = findViewById(R.id.count_text);
        final LinearLayout increaseLayout = findViewById(R.id.increase_layout);

        increaseLayout.setOnClickListener(v -> viewModel.increaseCount());

        viewModel.getCount().observe(this, count -> countText.setText(String.valueOf(count)));

    }
}