package com.example.cryptographyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encoder extends AppCompatActivity {
     EditText etenc;
     TextView enctv;
     ClipboardManager cpb;

//    creating instance and inheritance of a class are different
//            creating instance means creating object of the class and by using that object access properties and methods of that class.
//    but by using inheritance you can create another class from that (base) class which contains properties of base class as well as new properties of that class.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);

        etenc = findViewById(R.id.etenc);
                enctv=findViewById(R.id.enctv);
                cpb=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);

    }
    public void enc(View view){

        String temp = etenc.getText().toString();
        String rv = encode.enc(temp);
        enctv.setText(rv);
    }
   public void cp2(View view){

        String data =enctv.getText().toString().trim();
        if(!data.isEmpty()){
            ClipData temp = ClipData.newPlainText("text",data);
            cpb.setPrimaryClip(temp);
            Toast.makeText(this,"Copied",Toast.LENGTH_LONG).show();


        }
   }
}

//correct

//    When ever orientation(i.e. from horizontal to vertical or vertical to horizontal)
//    of activity gets changed or when an Activity gets forcefully terminated by any Operating System then savedInstanceState
//        i.e. object of Bundle Class will save the state of an Activity.