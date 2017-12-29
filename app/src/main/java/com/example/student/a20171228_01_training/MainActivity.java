package com.example.student.a20171228_01_training;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        TextView tv=findViewById(R.id.textView);
        tv.setText("你成功了");
    }
    public void click2(View v)
    {
        EditText et=findViewById(R.id.editText2);
        Intent it=new Intent(this,Main2Activity.class);
        it.putExtra("DATA",et.getText().toString());
        startActivity(it);
    }
    public void click3(View v)
    {
        Intent it=new Intent(this,Main3Activity.class);
        startActivity(it);
    }
}
