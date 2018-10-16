package com.tom.bmi;

import android.util.Log;
import android.view.View;

public class MyListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        Log.d("MyListener", "onClick: ");
    }
}
