package com.sar.user.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final com.sar.user.livedata.View viewModel= new ViewModelProvider(this).get(com.sar.user.livedata.View.class);
        setContentView(R.layout.activity_main);
        com.sar.user.livedata.View view;
        Button button=findViewById(R.id.button);
        final TextView textView=findViewById(R.id.text);
        viewModel.getNum().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(String.valueOf(integer));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.addNumber();
            }
        });
    }
}
