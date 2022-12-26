package com.example.firstprojecthit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    char operator;
    int num1,num2;
    double res=0.0d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         result=findViewById(R.id.textViewResult);

    }

    public void buttonFunctionNumbers(View view) {
        if(view instanceof Button){
            Button b=(Button) view;
            String str=b.getText().toString();
            result.append(str);
        }

    }

    public void buttonFunctionEquals(View view) {
        if(view instanceof Button){
            num2=Integer.parseInt(result.getText().toString());
            switch (operator){
                case '+':
                    res=num1+num2;
                    break;
                case '-':
                    res=num1-num2;
                    break;
                case '*':
                    res=num1*num2;
                    break;
                case '/':
                    if(num2!=0)
                    res=(double) num1/num2;
                   else{
                       result.setText("Math Error!!");
                       return;
                    }
                   break;
            }
            result.setText(String.valueOf(res));
        }


    }

    public void buttonFunctionOperator(View view) {
        if(view instanceof Button) {
            Button b = (Button) view;
            operator =b.getText().toString().charAt(0);
            num1=Integer.parseInt(result.getText().toString());
            result.setText("");
        }
    }

    public void buttonFunctionToClear(View view) {
        result.setText("");
    }
}