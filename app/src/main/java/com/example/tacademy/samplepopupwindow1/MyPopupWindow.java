package com.example.tacademy.samplepopupwindow1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

/**
 * Created by Tacademy on 2016-01-28.
 */
public class MyPopupWindow extends PopupWindow {

    public MyPopupWindow(Context context) {
        super(context);

        setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        View view = LayoutInflater.from(context).inflate(R.layout.popup_my,null);
        Button btn = (Button)view.findViewById(R.id.btn_b1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        btn = (Button)view.findViewById(R.id.btn_b2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        btn = (Button)view.findViewById(R.id.btn_b3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        setContentView(view);

    }

}
