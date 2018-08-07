package com.user06.dagger_2tutorial.coffeehelper_dagger2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.user06.dagger_2tutorial.R;

public class DIActivity extends AppCompatActivity implements CoffeeCallback{

    Button dependencyInjectionButton;
    TextView showText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dependencyInjectionButton = findViewById(R.id.button2);
        showText = findViewById(R.id.textView2);
        showText.setText("Coffee:: \n");
        dependencyInjectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResturantAMethodInjection resturantAConstructorInjection = new ResturantAMethodInjection();
                resturantAConstructorInjection.brewCoffee(DIActivity.this);
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void coffeeStatus(String status) {
        showText.append(status +" ");
    }
}
