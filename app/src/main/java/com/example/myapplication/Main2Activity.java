package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent1 = getIntent();
        String data = intent1.getStringExtra("extra12");
        Toast.makeText(Main2Activity.this, data,
                Toast.LENGTH_LONG).show();

        Button button = (Button) findViewById(R.id.but3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("extra21","2传到1");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
