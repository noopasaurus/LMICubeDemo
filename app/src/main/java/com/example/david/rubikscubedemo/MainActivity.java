package com.example.david.rubikscubedemo;

//import android.net.http.RequestQueue;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RubiksCube cube;
    TextView tempTextView;

    View square1;
    View square2;
    View square3;
    View square4;
    View square5;
    View square6;
    View square7;
    View square8;
    View square9;

    Drawable b;
    Drawable g;
    Drawable r;
    Drawable o;
    Drawable w;
    Drawable y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INIT SQUARES////////////////////////////////
        square1 = (View)findViewById(R.id.square);
        square2 = (View)findViewById(R.id.square2);
        square3 = (View)findViewById(R.id.square3);
        square4 = (View)findViewById(R.id.square4);
        square5 = (View)findViewById(R.id.square5);
        square6 = (View)findViewById(R.id.square6);
        square7 = (View)findViewById(R.id.square7);
        square8 = (View)findViewById(R.id.square8);
        square9 = (View)findViewById(R.id.square9);


        //INIT COLORS////////////////////////////////////////
        b = getResources().getDrawable(R.drawable.b);
        g = getResources().getDrawable(R.drawable.g);
        r = getResources().getDrawable(R.drawable.r);
        o = getResources().getDrawable(R.drawable.o);
        w = getResources().getDrawable(R.drawable.w);
        y = getResources().getDrawable(R.drawable.y);


        //INITIALIZE BUTTONS///////////////////////////////////////////////////////////////////////
        Button one = (Button) findViewById(R.id.button);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(this); // calling onClick() method
        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(this); // calling onClick() method
        Button eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(this);
        Button ten = (Button) findViewById(R.id.button10);
        ten.setOnClickListener(this); // calling onClick() method
        Button eleven = (Button) findViewById(R.id.button11);
        eleven.setOnClickListener(this);
        Button twelve = (Button) findViewById(R.id.button12);
        twelve.setOnClickListener(this);

        //tempTextView = (TextView) findViewById(R.id.textView);
    // hopin this works

        cube = new RubiksCube();
        updateDisplay();
        //tempTextView.setText(cube.getCube());

    }

    public void updateDisplay(){
        square1.setBackground(pickColor(cube.getCube(1,1)));
        square2.setBackground(pickColor(cube.getCube(1,2)));
        square3.setBackground(pickColor(cube.getCube(1,3)));
        square4.setBackground(pickColor(cube.getCube(1,4)));
        square5.setBackground(pickColor(cube.getCube(1,5)));
        square6.setBackground(pickColor(cube.getCube(1,6)));
        square7.setBackground(pickColor(cube.getCube(1,7)));
        square8.setBackground(pickColor(cube.getCube(1,8)));
        square9.setBackground(pickColor(cube.getCube(1,9)));
    }

    public Drawable pickColor(int i){
        Drawable temp = w;
        switch(i){
            case 1:
                temp = w;
                break;
            case 2:
                temp = g;
                break;
            case 3:
                temp = b;
                break;
            case 4:
                temp = y;
                break;
            case 5:
                temp = r;
                break;
            case 6:
                temp = o;
                break;

        }

        return temp;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.button:
                cube.Turn(1);
                break;
            case R.id.button2:
                cube.Turn(2);
                //tempTextView.setText(cube.Turn(2));
                break;
            case R.id.button3:
                cube.Turn(3);
                //tempTextView.setText(cube.Turn(3));
                break;
            case R.id.button4:
                cube.Turn(4);
                //tempTextView.setText(cube.Turn(4));
                break;
            case R.id.button5:
                cube.Turn(5);
                //tempTextView.setText(cube.Turn(5));
                break;
            case R.id.button6:
                cube.Turn(6);
                //tempTextView.setText(cube.Turn(6));
                break;
            case R.id.button7:
                cube.Turn(7);
                //tempTextView.setText(cube.Turn(7));
                break;
            case R.id.button8:
                cube.Turn(8);
                //tempTextView.setText(cube.Turn(8));
                break;
            case R.id.button9:
                cube.Turn(9);
                //tempTextView.setText(cube.Turn(9));
                break;
            case R.id.button10:
                cube.Turn(10);
                //tempTextView.setText(cube.Turn(10));
                break;
            case R.id.button11:
                cube.Turn(11);
                //tempTextView.setText(cube.Turn(11));
                break;
            case R.id.button12:
                cube.Turn(12);
                //tempTextView.setText(cube.Turn(12));
                break;
        }
        updateDisplay();

    }
}
