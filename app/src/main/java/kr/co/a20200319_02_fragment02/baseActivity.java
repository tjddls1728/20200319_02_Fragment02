package kr.co.a20200319_02_fragment02;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class baseActivity extends AppCompatActivity {
    public Context mcontext = this;

   public abstract void setupEvents();
    public abstract void setupValues();




}
