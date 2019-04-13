package com.example.num_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_number;
    private TextView output;
    private Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number = findViewById(R.id.etnumber);
        output = findViewById(R.id.result);
        btn_convert = findViewById(R.id.btn_convert);

        btn_convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int number =Integer.parseInt(et_number.getText().toString());
                Converter c=new Converter();
                String word=c.conversion(number);
                output.setText(word);
            }
        });
    }
}