package com.soi.notemanagementsystem;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import com.soi.notemanagementsystem.R;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class pieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_piechart);
        runPieChart();
    }

    private void runPieChart() {
        float Processing = 60;
        float Pending = 20;
        float Done = 20;
        List<SliceValue> listDl = new ArrayList<>();
        listDl.add(new SliceValue(Processing, Color.GRAY).setLabel("Processing: "+Processing+"%"));
        listDl.add(new SliceValue(Pending,Color.RED).setLabel("Pending: "+Pending+"%"));
        listDl.add(new SliceValue(Done,Color.BLUE).setLabel("Done: "+Done+"%"));

        PieChartData dBd = new PieChartData(listDl);
        dBd.setHasLabels(true);

        PieChartView wBd = findViewById(R.id.chart);
        wBd.setPieChartData(dBd);
    }
}
