package com.example.thagadur.fragmentexample2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnNameSetListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {
        System.out.println("hello");
        FragmentTwo f2=(FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        f2.updateInfo(name);
    }
}
