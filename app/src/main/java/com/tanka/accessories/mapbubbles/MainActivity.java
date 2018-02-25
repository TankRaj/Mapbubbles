package com.tanka.accessories.mapbubbles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSwitch = findViewById(R.id.switchMap);


        tvSwitch.setOnClickListener(v -> {
            Intent intent = new Intent(this,MapsActivity.class);
            startActivity(intent);
        });
    }
}
