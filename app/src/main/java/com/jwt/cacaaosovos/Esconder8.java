package com.jwt.cacaaosovos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Esconder8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esconder8);
    }


    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(new View(this));
        System.gc();

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_esconder8);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_esconder8);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        setContentView(R.layout.activity_esconder8);
    }

    public void esconder9(View view)
    {
        Intent intent = new Intent(this,Esconder9.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }

}
