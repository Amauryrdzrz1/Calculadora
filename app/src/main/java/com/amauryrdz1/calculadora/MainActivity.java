package com.amauryrdz1.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void miclick(View v){
        switch (v.getId()){
            case R.id.btn1:
                TextView tt= (TextView) findViewById(R.id.lbl1);
                tt.setText("1");
                break;
            case R.id.btn2:
                Toast.makeText(this, "holaaa", Toast.LENGTH_LONG).show();
                break;
            case R.id.lbl1:
                TextView lbl = (TextView) view;
                Toast.makeText(this, "holaaa", Toast.LENGTH_LONG).show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}