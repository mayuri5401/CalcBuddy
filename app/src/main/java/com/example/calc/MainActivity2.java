package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {
    ImageView logo,bg,name;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        logo=findViewById(R.id.logo);
        bg=findViewById(R.id.bgimg);
        name=findViewById(R.id.name);
        lottieAnimationView=findViewById(R.id.lottie);
        bg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
       logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        name.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
//        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity2.this,MainActivity.class);


                startActivity(intent);

            }
        });


    }
}