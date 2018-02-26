package com.user06.dagger_2tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HelloService helloService;

    @Inject
    MainService mainService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerApplication.getComponent().inject(this);
        Button clickEvent = findViewById(R.id.button);
        clickEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String text = helloService.greet("User1");
                mainService.doSomething();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("name", "anjan");
                startActivity(intent);*/

            }
        });
    }

}
