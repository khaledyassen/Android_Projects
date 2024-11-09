package com.example.calcualtorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        res = (TextView) findViewById(R.id.res);
//        Number Zero
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"0");
            }
        });
//        Number One
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"1");
            }
        });
//        Number Two
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"2");
            }
        });
//        Number Three
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"3");
            }
        });
//        Number Four
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"4");
            }
        });
//        Number Five
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"5");
            }
        });
//        Number Six
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"6");
            }
        });
//        Number Seven
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"7");
            }
        });
//        Number Eight
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"8");
            }
        });
//        Number Nine
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"9");
            }
        });
//         Subtract Operator
        findViewById(R.id.btnsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+" - ");
            }
        });
//        Sum Operator
        findViewById(R.id.btnsum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+" + ");
            }
        });
//        Multiplaction Operator
        findViewById(R.id.btnmul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+" * ");
            }
        });
//        Devision operator
        findViewById(R.id.btndev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+" / ");
            }
        });
//        Mod Operator
        findViewById(R.id.btnmod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+" % ");
            }
        });
        //        Delete Operator
        findViewById(R.id.btndel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
            }
        });
//        Result equal
        findViewById(R.id.btnres).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = res.getText().toString();
                String [] nums = s.split(" ");
                int r = Integer.parseInt(nums[0]);
                int j = 0;
                for(int i=1;i<nums.length;i+=2){
                    if (nums[i].equals("+")){
                        r+=Integer.parseInt(nums[j+=2]);
                    }
                    else if (nums[i].equals("-")){
                        r-=Integer.parseInt(nums[j+=2]);
                    }
                    else if (nums[i].equals("*")){
                        r*=Integer.parseInt(nums[j+=2]);
                    }
                    else if (nums[i].equals("/")){
                        r/=Integer.parseInt(nums[j+=2]);
                    }
                    else if (nums[i].equals("%")){
                        r%=Integer.parseInt(nums[j+=2]);
                    }
                    res.setText(" "+r);

                }


            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}