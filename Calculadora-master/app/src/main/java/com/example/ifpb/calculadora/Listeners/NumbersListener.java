package com.example.ifpb.calculadora.Listeners;

import android.view.View;
import android.widget.Button;

import com.example.ifpb.calculadora.MainActivity;

/**
 * Created by IFPB on 14/09/2016.
 */
public class NumbersListener implements View.OnClickListener{

    MainActivity mainActivity;

    public NumbersListener(MainActivity mainActivity) {

        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        mainActivity.screen += b.getText();

    }


}
