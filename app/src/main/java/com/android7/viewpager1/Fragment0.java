package com.android7.viewpager1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment0 extends Fragment {
    public interface OnFragment0Listener{
        void onButton0Clicked();
        void wyswietlTekst(String tekst);
    }

    private OnFragment0Listener mListener;

    public Fragment0(){
    }

    public void setListener(OnFragment0Listener listener){
        mListener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout,container,false);

        Button button0 = v.findViewById(R.id.button0);
        Button button1 = v.findViewById(R.id.button1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onButton0Clicked();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.wyswietlTekst("Button 1 clicked...");
            }
        });

        return v;
    }
}
