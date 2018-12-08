package com.google.firstappom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Task3 extends AppCompatActivity {


    private ImageView imageView;
    private TextView userName;
    private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        imageView = findViewById(R.id.imageView);
        userName = findViewById(R.id.userName);
        nextButton = findViewById(R.id.nextButton);

        imageView.setImageResource(R.drawable.ic_launcher_foreground);
        userName.setText("Hello User");
        nextButton.setText("submit");
    }
}
