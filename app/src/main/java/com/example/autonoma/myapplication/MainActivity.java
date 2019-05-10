package com.example.autonoma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numero1,numero2;
    Button btn1,btn2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText)findViewById(R.id.editText);
        numero2=(EditText)findViewById(R.id.editText2);
        txtResultado=(TextView) findViewById(R.id.textView4);
        btn1=(Button)findViewById(R.id.button);
        btn1.setOnClickListener(this);

        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1=Integer.parseInt(numero1.getText().toString());
                int valor2=Integer.parseInt(numero2.getText().toString());
                if (valor1>valor2){
                    int r=valor1-valor2;
                    txtResultado.setText("La resta es:"+r);
                }
                else{
                    int r=valor2-valor1;
                    txtResultado.setText("La resta es:"+r);
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        int valor1=Integer.parseInt(numero1.getText().toString());
        int valor2=Integer.parseInt(numero2.getText().toString());
        int r=valor1+valor2;
        txtResultado.setText("La suma es:"+r);
    }



}
