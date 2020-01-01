package com.example.vibhor.passwordappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListener();
    }


    public void addOnClickListener(){


        submitButton= (Button) findViewById(R.id.submit_button);
        editText= (EditText) findViewById(R.id.password_text);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,editText.getText(),Toast.LENGTH_LONG).show();

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);


            }
        });

    }
}
