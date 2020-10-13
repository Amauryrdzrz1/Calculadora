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

    private Button cero;
    private Button uno;
    private Button dos;
    private Button tres;
    private Button cuatro;
    private Button cinco;
    private Button seis;
    private Button siete;
    private Button ocho;
    private Button nuevo;
    private Button suma;
    private Button resta;
    private Button divi;
    private Button multi;
    private Button equ;
    private Button del;
    private Button pc;
    private Button deci;
    private Button mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    private void setupUi(){
        uno = (Button)findViewById(R.id.btn1);
        dos = (Button)findViewById(R.id.btn2);
        tres = (Button)findViewById(R.id.btn3);
        cuatro = (Button)findViewById(R.id.btn4);
        cinco = (Button)findViewById(R.id.btn5);
        seis = (Button)findViewById(R.id.btn6);
        siete = (Button)findViewById(R.id.btn7);
        ocho = (Button)findViewById(R.id.btn8);
        nuevo = (Button)findViewById(R.id.btn9);
        cero = (Button)findViewById(R.id.btn0);
        suma = (Button)findViewById(R.id.mas);
        resta = (Button)findViewById(R.id.menos);
        divi = (Button)findViewById(R.id.div);
        pc = (Button)findViewById(R.id.percent);
        deci = (Button)findViewById(R.id.dec);
        del = (Button)findViewById(R.id.borrar);
        equ = (Button)findViewById(R.id.igual);
        multi = (Button)findViewById(R.id.por);
        mm = (Button)findViewById(R.id.masmen);
    }
}