package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ResultTextView;
    private EditText number_field_1, number_field_2;
    private Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ResultTextView = findViewById(R.id.ResultTextView);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num_1 = Float.parseFloat(number_field_1.getText().toString());
                float num_2 = Float.parseFloat(number_field_1.getText().toString());
                float res = num_1 + num_2;
                ResultTextView.setText(String.valueOf(res));
            }
        });
    }
}