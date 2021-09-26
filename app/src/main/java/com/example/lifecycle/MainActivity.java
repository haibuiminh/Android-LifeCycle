package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btnExit;
    TextView textView;
    LinearLayout myScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        btnExit = findViewById(R.id.btnExit);
        editText = findViewById(R.id.txtMsg);
        textView = findViewById(R.id.txtSpy);
        myScreen = findViewById(R.id.myScreen);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chosenColor = editText.getText().toString();
                if (!chosenColor.isEmpty()) {
                    setBackgroundColor(chosenColor, myScreen);
                    textView.setText("You set background color with " + chosenColor);
                }
            }
        });
    }


    private void setBackgroundColor(String chosenColor, LinearLayout myScreen) {
        switch (chosenColor) {
            case "hai": case "Hai":
                myScreen.setBackgroundColor(0xf1612168);
                break;
            case "hoang": case "Hoang":
                myScreen.setBackgroundColor(0xf1612215);
                break;
            default: return;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}