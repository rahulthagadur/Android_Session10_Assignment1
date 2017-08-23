package com.example.thagadur.fragmentexample2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

/**
 * Created by Thagadur on 8/22/2017.
 */

public class FragmentOne extends Fragment {
    EditText editText;
    Button button;
    OnNameSetListner onNameSetListner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.fragment_one_layout,container,false);
        editText=(EditText)view.findViewById(R.id.name);
        button=(Button)view.findViewById(R.id.submit_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                onNameSetListner.setName(name);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onNameSetListner=(OnNameSetListner)activity;
        }catch (Exception e){

        }

    }

    public interface OnNameSetListner{
        public void setName(String name);

    }
}
