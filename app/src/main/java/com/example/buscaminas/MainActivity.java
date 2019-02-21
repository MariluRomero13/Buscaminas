package com.example.buscaminas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnreiniciar;
    TextView tvrol;
    int numero = 0, contador = 0;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2  = findViewById(R.id.btn2);
        btn3  = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnreiniciar = findViewById(R.id.btnreinicar);
        tvrol = findViewById(R.id.rol);


        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnreinicar:
                            reiniciar();
                        break;

                    case R.id.btn1:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn1,tvrol);
                            deshabilitar();

                        }
                        else
                        {
                            setpropiedades(btn1);
                            contador++;
                        }
                        break;

                    case R.id.btn2:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn2,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn2);
                            contador++;
                        }
                        break;

                    case R.id.btn3:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn3,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn3);
                            contador++;
                        }
                        break;

                    case R.id.btn4:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn4,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn4);
                            contador++;
                        }
                        break;

                    case R.id.btn5:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn5,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn5);
                            contador++;
                        }
                        break;

                    case R.id.btn6:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn6,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn6);
                            contador++;
                        }
                        break;

                    case R.id.btn7:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn7,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn7);
                            contador++;
                        }
                        break;

                    case R.id.btn8:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn8,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn8);
                            contador++;
                        }
                        break;

                    case R.id.btn9:
                        numero = r.nextInt(10);
                        if (numero == 1)
                        {
                            bomba(btn9,tvrol);
                            deshabilitar();
                        }
                        else
                        {
                            setpropiedades(btn9);
                            contador++;
                        }
                        break;

                }
                if (contador == 9)
                {
                    tvrol.setText("GANASTE :D");
                }
            }
        };

        btnreiniciar.setOnClickListener(click);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
        btn7.setOnClickListener(click);
        btn8.setOnClickListener(click);
        btn9.setOnClickListener(click);
    }

    public void setpropiedades(Button btn)
    {
        btn.setBackgroundColor(Color.RED);
        btn.setEnabled(false);
    }

    public void bomba(Button btn, TextView tv)
    {
        btn.setBackgroundColor(Color.GREEN);
        btn.setEnabled(false);
        tv.setText("PERDISTE D:");
    }

    public void reiniciar()
    {
        btn1.setBackgroundColor(Color.LTGRAY);
        btn1.setEnabled(true);
        btn2.setBackgroundColor(Color.LTGRAY);
        btn2.setEnabled(true);
        btn3.setBackgroundColor(Color.LTGRAY);
        btn3.setEnabled(true);
        btn4.setBackgroundColor(Color.LTGRAY);
        btn4.setEnabled(true);
        btn5.setBackgroundColor(Color.LTGRAY);
        btn5.setEnabled(true);
        btn6.setBackgroundColor(Color.LTGRAY);
        btn6.setEnabled(true);
        btn7.setBackgroundColor(Color.LTGRAY);
        btn7.setEnabled(true);
        btn8.setBackgroundColor(Color.LTGRAY);
        btn8.setEnabled(true);
        btn9.setBackgroundColor(Color.LTGRAY);
        btn9.setEnabled(true);
        tvrol.setText("");
        contador = 0;
    }

    public void deshabilitar()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
}
