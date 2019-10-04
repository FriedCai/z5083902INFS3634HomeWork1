package com.example.homework1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn12 = findViewById(R.id.format12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView sydTime = findViewById(R.id.sydneyTime);
                sydTime.setText(getLocalTimeString("GMT+10"));

                TextView timeTokyo = findViewById(R.id.tokyoTime);
                timeTokyo.setText(getLocalTimeString("GMT+9"));

                TextView timeCanton = findViewById(R.id.cantonTime);
                timeCanton.setText(getLocalTimeString("GMT+8"));

                TextView timeBarca = findViewById(R.id.barcaTime);
                timeBarca.setText(getLocalTimeString("GMT+2"));

                TextView timeLa = findViewById(R.id.laTime);
                timeLa.setText(getLocalTimeString("GMT-7"));
            }
        });

        Button btn24 = findViewById(R.id.format24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView sydTime = findViewById(R.id.sydneyTime);
                sydTime.setText(getLocalTimeString2("GMT+10"));

                TextView timeTokyo = findViewById(R.id.tokyoTime);
                timeTokyo.setText(getLocalTimeString2("GMT+9"));

                TextView timeCanton = findViewById(R.id.cantonTime);
                timeCanton.setText(getLocalTimeString2("GMT+8"));

                TextView timeBarca = findViewById(R.id.barcaTime);
                timeBarca.setText(getLocalTimeString2("GMT+2"));

                TextView timeLa = findViewById(R.id.laTime);
                timeLa.setText(getLocalTimeString2("GMT-7"));
            }
        });

    }

    public static String getLocalTimeString2(String local){
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(local));
        cal.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        String time = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE);
        return time;
    }
    public static String getLocalTimeString(String local){
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(local));
        cal.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        String time = cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE);
        return time;
    }
}
