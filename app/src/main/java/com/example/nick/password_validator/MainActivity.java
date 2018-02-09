package com.example.nick.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validatePassword(View v){
        String password = ((EditText)findViewById(R.id.editText)).getText().toString();
        Validator val = new Validator();
        int result = val.validate(password);
        String quality = "Not strong";
        if(result == Validator.NUM_TESTS){
            quality = "Strongest";
        }else if(result >= Validator.NUM_TESTS/2){
            quality = "Somewhat strong";
        }

        ((TextView)findViewById(R.id.textView)).setText(quality);
    }
}
