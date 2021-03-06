package com.example.activitylifycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onCreate method");

    }

    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this, "onStart finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onStart method");
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onResume method");
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onPause method");
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStop method");
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onDestroy method");
    }
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart finished", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity", "onRestart method");
    }




}