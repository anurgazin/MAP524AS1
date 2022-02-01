package com.example.map524as1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText display;
    Calculator calc = new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setting variable for value field
        display = findViewById(R.id.valueField);
        // turning off standard keyboard
        display.setShowSoftInputOnFocus(false);
    }
    void show(String value){
        String old = display.getText().toString();
        display.setText(String.format("%s%s", old, value));
    }
    public void button1(View view){
        show("1");
        calc.push("1");
    }
    public void button2(View view){
        show("2");
        calc.push("2");
    }
    public void button3(View view){
        show("3");
        calc.push("3");
    }
    public void button4(View view){
        show("4");
        calc.push("4");
    }
    public void button5(View view){
        show("5");
        calc.push("5");
    }
    public void button6(View view){
        show("6");
        calc.push("6");
    }
    public void button7(View view){
        show("7");
        calc.push("7");
    }
    public void button8(View view){
        show("8");
        calc.push("8");
    }
    public void button9(View view){
        show("9");
        calc.push("9");
    }
    public void button0(View view){
        show("0");
        calc.push("0");
    }
    public void buttonP(View view){
        show("+");
        calc.push("+");
    }
    public void buttonM(View view){
        show("-");
        calc.push("-");
    }
    public void buttonC(View view){
        display.setText("");
    }
    public void buttonE(View view){
        try {
            int result = calc.calculate();
            String equal = "=" + result;
            show(equal);
        }catch (Exception e){
            show("= Invalid Input");
        }
    }
    public void buttonMul(View view){
        show("*");
        calc.push("*");
    }
    public void buttonDiv(View view){
        show("/");
        calc.push("/");
    }
    public void buttonPercent(View view){
        show("%");
        calc.push("%");
    }
    public void buttonPow(View view){
        show("pow");
        calc.push("pow");
    }
    public void buttonMin(View view){
        show("min");
        calc.push("min");
    }
    public void buttonMax(View view){
        show("max");
        calc.push("max");
    }
}