package com.example.administrator.el_done1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeekReportItemActivity extends AppCompatActivity {

//    private TextView week_report_day_num_text;
    private TextView week_report_focus_success_times;
    private TextView week_report_focus_success_total_time;
    private TextView week_report_focus_success_time_average;
    private Button week_report_day_back;


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
        setContentView(R.layout.week_report_item_activity);

        //存入ActivityManager
        ActivityManager.addActivity(this);



        //隐藏应用默认标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null){
            actionBar.hide();
        }


        //        week_report_day_num_text = (TextView) findViewById(R.id.week_report_day_num_text);
        week_report_day_back = (Button)findViewById(R.id.week_report_day_back);
        week_report_focus_success_times =(TextView)findViewById(R.id.week_report_focus_success_times);
        week_report_focus_success_total_time = (TextView)findViewById(R.id.week_report_focus_success_total_time);
        week_report_focus_success_time_average = (TextView)findViewById(R.id.week_report_focus_success_time_average);
        week_report_day_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityManager.removeActivity(WeekReportItemActivity.this);
            }
        });
    }
}
