package com.example.the_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView Screen;
private Button AC, Plus, Minus, Multiply, Divide, Equals, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
private String input, Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=findViewById(R.id.screen);
        AC=findViewById(R.id.AC);
        Plus=findViewById(R.id.plus);
        Minus=findViewById(R.id.minus);
        Multiply=findViewById(R.id.multiply);
        Divide=findViewById(R.id.divide);
        One=findViewById(R.id.one);
        Two=findViewById(R.id.two);
        Three=findViewById(R.id.three);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        Seven=findViewById(R.id.seven);
        Eight=findViewById(R.id.eight);
        Nine=findViewById(R.id.nine);
        Zero=findViewById(R.id.zero);
        Equals=findViewById(R.id.equals);
    }
    public void ButtonClick(View view){
        Button button=(Button) view;
        String data=button.getText().toString();
        switch (data){
            case "AC":
                input="";
                break;
            case "*":
                input+="*";
                break;
            case "/":
                input+="/";
                break;
            case "+":
                input+="+";
                break;
            case "-":
                input+="-";
                break;
            case "=":
                Solve();
                Answer=input;
                break;
            default:
                if(input==null) {
                    input = "";
                }
                if(data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/")) {
                    Solve();
                }
                input+=data;
                }
                Screen.setText(input);
        }
    private void Solve(){

    }
}
