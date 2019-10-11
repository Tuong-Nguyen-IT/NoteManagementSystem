package com.soi.notemanagementsystem;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PriorityActivity extends AppCompatActivity {
    public FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority);
        final category[] abc = new category[3];
        category abcd = new category("Name: High", "Create Date: 2019-09-05 14:15:15");
        category abcde = new category("Name: Medium", "Create Date: 2019-09-05 14:15:21");
        category abcdef = new category("Name: Slow", "Create Date: 2019-09-05 14:15:25");
        abc[0] = abcd;
        abc[1] = abcde;
        abc[2] = abcdef;
        ListView lv = (ListView) findViewById(R.id.lvprio);
        ArrayAdapter<category> adapter = new ArrayAdapter<category>
                (this, android.R.layout.simple_list_item_1, abc);
        lv.setAdapter(adapter);
        fab = (FloatingActionButton) findViewById(R.id.fab_prio);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(PriorityActivity.this);
                dialog.setContentView(R.layout.dialog_priority);
                dialog.show();
            }
        });
    }
}