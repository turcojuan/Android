package com.example.alumno.myappturco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv =(TextView)findViewById(R.id.tvSaludo);
        tv.setText("Otra cosa ");
    }
}
