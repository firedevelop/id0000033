package com.firedevelop.id0000033;
// simple button2
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.production.id0000033.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void help(View vista){
        Intent intent=new Intent(this,help.class);
        startActivity(intent);
    }
}
