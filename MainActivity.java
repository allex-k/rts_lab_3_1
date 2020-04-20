package com.example.userr.android_app_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button factorizeButton;
    private EditText text_n;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_n = findViewById(R.id.text_n);
        factorizeButton = findViewById(R.id.factorizeButton);
        textViewResult = findViewById(R.id.textViewResult);

        factorizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long n;
                ArrayList<Long> arr = new ArrayList<>();
                n=Long.parseLong(text_n.getText().toString());
                textViewResult.setText("обчислення...");
                Factorization.fermat_s_factorization(n,arr);
                textViewResult.setText(arr.toString());
            }
        });

    }
}
