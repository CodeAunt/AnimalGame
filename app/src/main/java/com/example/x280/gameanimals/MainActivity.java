package com.example.x280.gameanimals;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        buttonView = findViewById(R.id.buttonStart);
        buttonView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            Intent intent = new Intent(MainActivity.this, GameActivity1.class);
            startActivity(intent);
        }
        });

        buttonView = findViewById(R.id.buttonExit);
        buttonView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }
}
