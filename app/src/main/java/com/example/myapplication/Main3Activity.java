package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent1 = getIntent();
        String data = intent1.getStringExtra("extra13");
        Toast.makeText(Main3Activity.this, data,
                Toast.LENGTH_LONG).show();

        Button button = (Button) findViewById(R.id.but4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("extra31","3传到1");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
