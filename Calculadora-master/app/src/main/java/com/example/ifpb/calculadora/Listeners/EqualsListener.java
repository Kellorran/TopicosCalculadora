package com.example.ifpb.calculadora.Listeners;

import android.view.View;

import com.example.ifpb.calculadora.MainActivity;

/**
 * Created by IFPB on 14/09/2016.
 */
public class EqualsListener implements View.OnClickListener {

    MainActivity mainActivity;

    public EqualsListener(MainActivity mainActivity) {

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View view) {
        mainActivity.calcScreen.setText(String.valueOf(mainActivity.resultCalc()));
    }
}