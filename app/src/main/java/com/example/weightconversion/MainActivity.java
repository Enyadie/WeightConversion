package com.example.weightconversion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.Edittext);
        button = findViewById(R.id.button1);
        textView = findViewById(R.id.TextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                try {
                    if (!input.isEmpty()) {
                        double kilos = Double.parseDouble(input);
                        double pounds = conversion(kilos);
                        textView.setText(String.valueOf(pounds));
                    }
                } catch (NumberFormatException e) {
                    // Handle the exception (e.g., show an error message)
                    textView.setText("Invalid input. Please enter a valid number.");
                }
            }
        });
    }

    public double conversion(double kilos) {
        return kilos * 2.20462;
    }
}
