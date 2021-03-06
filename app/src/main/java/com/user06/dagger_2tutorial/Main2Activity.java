package com.user06.dagger_2tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    /**
     * Dagger2 example of
     * field/object injection
     */
    @Inject
    public HelloService helloService;

    @Inject
    public RestService restService;


    /**
     * Dagger2 example of
     * method Injection
     * @param helloService
     */
    @Inject
    public void setHelloService(HelloService helloService){
        this.helloService = helloService;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerApplication.getComponent().inject(this);
        TextView textview = findViewById(R.id.textView);
        String name = helloService.greet(getIntent().getStringExtra("name"));

        Toast.makeText(getApplicationContext(), name+"::"+ restService.getSomething(), Toast.LENGTH_LONG).show();

    }

}
