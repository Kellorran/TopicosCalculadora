package com.example.ifpb.calculadora.Listeners;

import android.view.View;

import com.example.ifpb.calculadora.MainActivity;

/**
 * Created by IFPB on 14/09/2016.
 */
public class ClearListener implements View.OnClickListener {

    MainActivity mainActivity;

    public ClearListener(MainActivity mainActivity) {

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View view) {
        mainActivity.screen = "";
        mainActivity.operation = "";
        mainActivity.updateScreen();
    }
}
