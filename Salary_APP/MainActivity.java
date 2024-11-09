package com.example.app1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button calc;
    EditText et1,et2,et3;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.status);
        et2 = (EditText) findViewById(R.id.editTextText2);
        et3 = (EditText) findViewById(R.id.editTextText3);
        tv = (TextView) findViewById(R.id.result);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status = et1.getText().toString().toLowerCase();
                int exper = Integer.valueOf(et2.getText().toString());
                int age = Integer.valueOf(et3.getText().toString());
                int Salary = 0;
                if(exper<3){
                    Salary = 1500+(exper*50)+(age*150);
                }
                else if(exper>=3 && exper <6){
                    Salary = 1800+(exper*50)+(age*150);
                }
                else if(exper>=6){
                    Salary = 1800+(exper*150)+(age*150);
                }
                if (status == "married"){
                    Salary = Salary +  1000;
                }
                else{
                    Salary += 0;
                }
                tv.setText("Status is "+status+"\n"+"Number of experience are "+exper+"\n"+
                        "Age is "+age + "\n" + "Salary will be "+Salary

                );

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;

        });

    }


}
