package com.example.bauprepgradecalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText wt1;
    EditText wt2;
    EditText wt3;
    EditText wt4;
    EditText wt5;
    EditText wt6;
    EditText wt7;
    EditText mid1;
    EditText mid2;
    EditText spk1;
    EditText spk2;
    EditText spk3;
    EditText ctask1;
    EditText ctask2;
    EditText wrt1;
    EditText wrt2;
    EditText wrt3;
    EditText wow;
    EditText eom;
    EditText watrslt;
    EditText spkrslt;
    EditText wrtrslt;
    EditText taskrslt;
    EditText wowrslt;
    EditText eomrslt;
    EditText midrslt;
    Button btn;
    TextView txt;
    double watsayi;
    Double dsonuc;
    double midsayi;
    double spksayi;
    double tasksayi;
    Double wowsayi;
    Double eomsayi;
    double wrtsayi;
    Double toplam;
    Double fdsonuc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        watrslt=(EditText) findViewById(R.id.ledtwatrslt);
        spkrslt=(EditText) findViewById(R.id.ledtspkrslt);
        wrtrslt=(EditText) findViewById(R.id.ledtwritingrslt);
        taskrslt=(EditText) findViewById(R.id.ledttaskrslt);
        wowrslt=(EditText) findViewById(R.id.ledtwowrslt);
        eomrslt=(EditText) findViewById(R.id.ledteomrslt);
        midrslt=(EditText) findViewById(R.id.ledtmidrslt);
        wrt1=(EditText) findViewById(R.id.ledtwriting1);
        wrt2=(EditText) findViewById(R.id.ledtwriting2);
        wrt3=(EditText) findViewById(R.id.ledtwriting3);
        wow=(EditText) findViewById(R.id.ledtwow);
        eom=(EditText) findViewById(R.id.ledteom);
        wt1=(EditText) findViewById(R.id.ledtwat1);
        wt2=(EditText) findViewById(R.id.ledtwat2);
        wt3=(EditText) findViewById(R.id.ledtwat3);
        wt4=(EditText) findViewById(R.id.ledtwat4);
        wt5=(EditText) findViewById(R.id.ledtwat5);
        wt6=(EditText) findViewById(R.id.ledtwat6);
        wt7=(EditText) findViewById(R.id.ledtwat7);
        mid1=(EditText) findViewById(R.id.ledtmid1);
        mid2=(EditText) findViewById(R.id.ledtmid2);
        spk1=(EditText) findViewById(R.id.ledtspk1);
        spk2=(EditText) findViewById(R.id.ledtspk2);
        spk3=(EditText) findViewById(R.id.ledtspk3);
        ctask1=(EditText) findViewById(R.id.ledttask1);
        ctask2=(EditText) findViewById(R.id.ledttask2);
        btn=(Button) findViewById(R.id.lcalc);
        txt=(TextView) findViewById(R.id.lresult);
        midrslt.setVisibility(View.INVISIBLE);
        eomrslt.setVisibility(View.INVISIBLE);
        wowrslt.setVisibility(View.INVISIBLE);
        taskrslt.setVisibility(View.INVISIBLE);
        wrtrslt.setVisibility(View.INVISIBLE);
        spkrslt.setVisibility(View.INVISIBLE);
        watrslt.setVisibility(View.INVISIBLE);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(wt1.getText().toString());
                if (wt1.length()<1) {
                    txt.setText("please enter grades!");
                }
                else{
                    midrslt.setVisibility(View.VISIBLE);
                    eomrslt.setVisibility(View.VISIBLE);
                    wowrslt.setVisibility(View.VISIBLE);
                    taskrslt.setVisibility(View.VISIBLE);
                    wrtrslt.setVisibility(View.VISIBLE);
                    spkrslt.setVisibility(View.VISIBLE);
                    watrslt.setVisibility(View.VISIBLE);
                    watsayi = Double.valueOf(wt1.getText().toString());
                    watsayi =watsayi+Double.valueOf(wt2.getText().toString()) +
                            Double.valueOf(wt3.getText().toString()) +
                            Double.valueOf(wt4.getText().toString()) +
                            Double.valueOf(wt5.getText().toString()) +
                            Double.valueOf(wt6.getText().toString()) +
                            Double.valueOf(wt7.getText().toString());
                    fdsonuc= Double.valueOf((((watsayi / 7) * 15) / 100));
                    watrslt.setText(fdsonuc.toString());
                    midsayi =Double.valueOf(mid1.getText().toString()) +
                            Double.valueOf(mid2.getText().toString());
                    fdsonuc=Double.valueOf(((midsayi / 2) * 20) / 100);
                    midrslt.setText(fdsonuc.toString());
                    spksayi = Double.valueOf(spk1.getText().toString()) +
                            Double.valueOf(spk2.getText().toString()) +
                            Double.valueOf(spk3.getText().toString());
                    fdsonuc=Double.valueOf(((spksayi/3)*10)/100);
                    spkrslt.setText(fdsonuc.toString());
                    tasksayi = Double.valueOf(ctask1.getText().toString()) +
                            Double.valueOf(ctask2.getText().toString());
                    fdsonuc=Double.valueOf(((tasksayi/2)*5)/100);
                    taskrslt.setText(fdsonuc.toString());
                    wrtsayi = Double.valueOf(wrt1.getText().toString()) +
                            Double.valueOf(wrt2.getText().toString()) +
                            Double.valueOf(wrt3.getText().toString());
                    fdsonuc=Double.valueOf(((wrtsayi/3)*10)/100);
                    wrtrslt.setText(fdsonuc.toString());
                    wowsayi = Double.valueOf(wow.getText().toString());
                    fdsonuc=Double.valueOf((wowsayi*5)/100);
                    wowrslt.setText(fdsonuc.toString());
                    eomsayi = Double.valueOf(eom.getText().toString());
                    fdsonuc=Double.valueOf((eomsayi*35)/100);
                    eomrslt.setText(fdsonuc.toString());
                    toplam = Double.valueOf(midrslt.getText().toString()) +
                            Double.valueOf(watrslt.getText().toString())+
                            Double.valueOf(taskrslt.getText().toString()) +
                            Double.valueOf( wrtrslt.getText().toString()) +
                            Double.valueOf(wowrslt.getText().toString()) +
                            Double.valueOf(spkrslt.getText().toString()) +
                            Double.valueOf(eomrslt.getText().toString());
                    dsonuc = (double) toplam;
                   // DecimalFormat df = new DecimalFormat("#0.##");
                    txt.setText(dsonuc.toString());
                    txt.setTextSize(20);
                }}
        });
    }
}
