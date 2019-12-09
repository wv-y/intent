package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.but1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String data1 = "1传到2";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("extra12",data1);
                startActivityForResult(intent,1);
            }
        });

        Button button2 = (Button) findViewById(R.id.but2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data2 = "1传到3";
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("extra13",data2);
                startActivityForResult(intent,2);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        String returndata="";
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    returndata = data.getStringExtra("extra21");
                } break;
            case 2:
                if (resultCode==RESULT_OK){
                    returndata = data.getStringExtra("extra31");
                }
                break;
                default:
                    returndata="欢迎";
        }
        Toast.makeText(MainActivity.this, returndata, Toast.LENGTH_LONG).show();
    }
}
