package com.example.administrator.el_done1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WeekReportActivity extends AppCompatActivity {

    private ImageButton mon;
    private ImageButton tue;
    private ImageButton wed;
    private ImageButton thu;
    private ImageButton fri;
    private ImageButton sat;
    private ImageButton sun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //根据主题设置字体
        switch (Theme.getTHEME()){
            case "SIMPLE":
                setTheme(R.style.SIMPLE_THEME);
                break;
            case "OTAKU":
                setTheme(R.style.OTAKU_THEME);
                break;
            case "PET":
                setTheme(R.style.PET_THEME);
                break;
        }

        //设立layout
        setContentView(R.layout.week_report_activity);

        //存入ActivityManager
        ActivityManager.addActivity(this);



        //隐藏应用默认标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null){
            actionBar.hide();
        }


        Button week_report_back_button = (Button)findViewById(R.id.week_report_back);
        week_report_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityManager.removeActivity(WeekReportActivity.this);
            }
        });


        mon = (ImageButton)findViewById(R.id.week_report_monday);
        tue = (ImageButton)findViewById(R.id.week_report_tuesday);
        wed = (ImageButton)findViewById(R.id.week_report_wednesday);
        thu = (ImageButton)findViewById(R.id.week_report_thursday);
        fri = (ImageButton)findViewById(R.id.week_report_friday);
        sat = (ImageButton)findViewById(R.id.week_report_saturday);
        sun = (ImageButton)findViewById(R.id.week_report_sunday);

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeekReportActivity.this,WeekReportItemActivity.class);
                startActivity(intent);
            }
        });

    }

    //重写活动销毁方式，用ActivityManager来销毁
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }
}
