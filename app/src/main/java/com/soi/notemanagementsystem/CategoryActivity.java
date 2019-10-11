package com.soi.notemanagementsystem;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CategoryActivity extends AppCompatActivity {
    public FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        final category[] abc = new category[3];
        category abcd = new category("Name: Working", "Create Date: 2019-09-05 14:15:01");
        category abcde = new category("Name: Relax", "Create Date: 2019-09-05 14:15:06");
        category abcdef = new category("Name: Study", "Create Date: 2019-09-05 14:55:23");
        abc[0] = abcd;
        abc[1] = abcde;
        abc[2] = abcdef;
        ListView lv = (ListView) findViewById(R.id.lvcate);
        ArrayAdapter<category> adapter = new ArrayAdapter<category>
                (this, android.R.layout.simple_list_item_1, abc);
        lv.setAdapter(adapter);
        fab = (FloatingActionButton) findViewById(R.id.fab_cate);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(CategoryActivity.this);
                dialog.setContentView(R.layout.dialog_category);
                dialog.show();
            }
        });
    }
}
