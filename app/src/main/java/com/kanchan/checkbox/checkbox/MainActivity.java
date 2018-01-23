package com.kanchan.checkbox.checkbox;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CheckBox mMomCheck;
    private CheckBox mDadCheck;
    private CheckBox mGrandmaCheck;
    private Button mClickButton;
    private TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMomCheck = (CheckBox) findViewById(R.id.checkBox1ID);
        mDadCheck = (CheckBox) findViewById(R.id.checkBox2ID);
        mGrandmaCheck = (CheckBox) findViewById(R.id.checkBox3ID);

        mClickButton = (Button) findViewById(R.id.buttonID);

        mtext = (TextView)  findViewById(R.id.textViewID);

        mClickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder mstringBuilder = new StringBuilder();
                mstringBuilder.append("You like Mom :" + mMomCheck.isChecked() );
                mstringBuilder.append("\n"+ " You like Dad :" + mDadCheck.isChecked() );
                mstringBuilder.append("\n"+" You like Grandma :" + mGrandmaCheck.isChecked());
                mtext.setTextColor(Color.BLUE);
                mtext.setText(mstringBuilder);
            }
        });
    }
}
