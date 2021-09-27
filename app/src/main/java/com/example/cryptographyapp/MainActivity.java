package com.example.cryptographyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button enc, dec, abt;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//        This is a Java method called setContentView. It sets the XML file you want as your main layout when the app starts.
//                In between round brackets, you need the name and location of your layout file. The letter R in the round brackets is short for res
        setContentView(R.layout.activity_main);

//        Window flag: hide all screen decorations (such as the status bar) while this window is displayed.
//                This allows the window to use the entire display space for itself -- the status bar will be hidden when an app window with this flag set is on the top layer.
//                A fullscreen window will ignore a value of SOFT_INPUT_ADJUST_RESIZE for the window's softInputMode field; the window will stay fullscreen and will not resize.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        enc= findViewById(R.id.encd);
        dec= findViewById(R.id.decd);
        enc.setOnClickListener(new View.OnClickListener()
                        {
                           @Override
                           public void onClick(View view) {
                               Intent temp = new Intent(MainActivity.this,Encoder.class);
                         startActivity(temp);
                           }
                       });
dec.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view){
        Intent temp = new Intent(MainActivity.this,Decoder.class);
        startActivity(temp);
    }
              });

vf=findViewById(R.id.vf);
//image come and go
int images[]={R.drawable.bellaso_cipher,R.drawable.caesar_cipher_encryption,R.drawable.dorabella_cipher};

for(int i=0;i<images.length;i++){
    flipper(images[i]);
        }
    }
    public void flipper (int images){
        ImageView test=new ImageView(this);
        test.setBackgroundResource(images);
//        vf.addView(test);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}

//correct