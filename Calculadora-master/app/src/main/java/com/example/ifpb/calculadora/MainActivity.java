package com.example.ifpb.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import com.example.ifpb.calculadora.Listeners.ClearListener;
import com.example.ifpb.calculadora.Listeners.EqualsListener;
import com.example.ifpb.calculadora.Listeners.NumbersListener;
import com.example.ifpb.calculadora.Listeners.OperationsListener;

import java.util.regex.Pattern;


public class MainActivity extends Activity {

    public TextView calcScreen;
    public String screen = "";
    public String operation = "";
    public Double numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcScreen = (TextView) findViewById(R.id.calcScreen);

        Button bt0 = (Button) findViewById(R.id.bt0);
        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        Button bt3 = (Button) findViewById(R.id.bt3);
        Button bt4 = (Button) findViewById(R.id.bt4);
        Button bt5 = (Button) findViewById(R.id.bt5);
        Button bt6 = (Button) findViewById(R.id.bt6);
        Button bt7 = (Button) findViewById(R.id.bt7);
        Button bt8 = (Button) findViewById(R.id.bt8);
        Button bt9 = (Button) findViewById(R.id.bt9);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button mult = (Button) findViewById(R.id.mult);
        Button div = (Button) findViewById(R.id.div);

        Button equals = (Button) findViewById(R.id.equals);

        Button clearScreen = (Button) findViewById(R.id.clearScreen);

        bt0.setOnClickListener(new NumbersListener(this));
        bt1.setOnClickListener(new NumbersListener(this));
        bt2.setOnClickListener(new NumbersListener(this));
        bt3.setOnClickListener(new NumbersListener(this));
        bt4.setOnClickListener(new NumbersListener(this));
        bt5.setOnClickListener(new NumbersListener(this));
        bt6.setOnClickListener(new NumbersListener(this));
        bt7.setOnClickListener(new NumbersListener(this));
        bt8.setOnClickListener(new NumbersListener(this));
        bt9.setOnClickListener(new NumbersListener(this));

        plus.setOnClickListener(new OperationsListener(this));
        minus.setOnClickListener(new OperationsListener(this));
        mult.setOnClickListener(new OperationsListener(this));
        div.setOnClickListener(new OperationsListener(this));

        equals.setOnClickListener(new EqualsListener(this));

        clearScreen.setOnClickListener(new ClearListener(this));

    }

    public void updateScreen(){
        calcScreen.setText(screen);
    }

    public double resultCalc(){

        String[] number = screen.split(Pattern.quote(operation));

        if (number.length == 1){
            return Double.parseDouble(number[0]);
        }
        else{
            switch (operation){
                case "+":
                    return (Double.parseDouble(number[0]) + Double.parseDouble(number[1]));
                case "-":
                    return (Double.parseDouble(number[0]) - Double.parseDouble(number[1]));
                case "x":
                    return (Double.parseDouble(number[0]) * Double.parseDouble(number[1]));
                case "/":
                    return (Double.parseDouble(number[0]) / Double.parseDouble(number[1]));
                default:
                    return 0;
            }
        }
    }
}