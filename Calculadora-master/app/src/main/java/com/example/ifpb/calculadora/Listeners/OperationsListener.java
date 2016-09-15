package com.example.ifpb.calculadora.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.ifpb.calculadora.MainActivity;

/**
 * Created by IFPB on 14/09/2016.
 */
public class OperationsListener implements View.OnClickListener {

    MainActivity mainActivity;

    public OperationsListener(MainActivity mainActivity) {

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View view) {

        Button b = (Button) view;

        if (mainActivity.operation.equals("")){
            mainActivity.screen += b.getText();
            mainActivity.operation = (String) b.getText();
            mainActivity.updateScreen();
        }
        else {
            mainActivity.screen = String.valueOf(mainActivity.resultCalc()) + b.getText();
            mainActivity.operation = (String) b.getText();
            mainActivity.updateScreen();
        }

    }
}


