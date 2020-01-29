package com.arioninfotech.multiplicationtableexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumber;
    TextView lblResult;
    Button btnShow;

    int number=0,answer=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber=findViewById(R.id.txtNumber);
        lblResult=findViewById(R.id.lblResult);
        btnShow=findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtNumber.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please enter a number",Toast.LENGTH_LONG).show();

                }else{

                    StringBuffer buffer = new StringBuffer();

                    number=Integer.parseInt(txtNumber.getText().toString().trim());

                    // build the logic for table
                    for (int i = 1; i <= 10; i++) {
                        answer = (i * number);
                        buffer.append(number + " X " + i
                                + " = " + answer + "\n\n");
                    }

                    // set the buffer textview
                    lblResult.setText(buffer);
                }





            }
        });

    }
}
