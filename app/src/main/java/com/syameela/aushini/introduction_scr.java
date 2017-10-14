package com.syameela.aushini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class introduction_scr extends AppCompatActivity {

    Button buka_halaman_fitur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_scr);

        buka_halaman_fitur = (Button) findViewById(R.id.btn_next_welcome);

        buka_halaman_fitur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(introduction_scr.this, welcome_scr.class);
                startActivity(intent);
            }
        });

    }
}
