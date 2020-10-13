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
    private TextView datos;
    private TextView resu;
    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char Action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUi();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "8");
            }
        });
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.setText(datos.getText().toString() + "9");
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            calcular();
            Action = ADDITION;
            resu.setText(String.valueOf(val1)+'+');
            datos.setText(null);
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                Action = SUBSTRACTION;
                resu.setText(String.valueOf(val1)+'-');
                datos.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                Action = MULTIPLICATION;
                resu.setText(String.valueOf(val1)+'*');
                datos.setText(null);
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                Action = DIVISION;
                resu.setText(String.valueOf(val1)+'/');
                datos.setText(null);
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                Action = EQUAL;
                resu.setText(resu.getText().toString()+ String.valueOf(val2)+ '=' +String.valueOf(val1));
                datos.setText(null);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resu.setText(null);
                datos.setText(null);
            }
        });
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
        datos = (TextView)findViewById(R.id.lbl2);
        resu = (TextView)findViewById(R.id.lbl1);

    }
    private void calcular(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(datos.getText().toString());
            switch(Action){
                case ADDITION:
                    val1 = val1+val2;
                    break;
                case SUBSTRACTION:
                    val1 = val1-val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1*val2;
                    break;
                case DIVISION:
                    val1 = val1/val2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(datos.getText().toString());
        }
    }
}