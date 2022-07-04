package com.example.project23;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastHelper {
    Context context;
    public ToastHelper(Context _context){
        context = _context;
    }
    public void Show(String str){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.toast, null);
        Toast toast = new Toast(context);
        TextView tv = (TextView)layout.findViewById(R.id.tv1);
        tv.setText(str);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
