package com.soi.notemanagementsystem;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NoteActivity extends AppCompatActivity {

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);


        fab = (FloatingActionButton)findViewById(R.id.fab);




        fab.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                DialogAddNote();
            }


        });



    }

    private  void DialogAddNote(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_addnote);
        dialog.show();
        TextView txtPlanDate =(TextView) dialog.findViewById(R.id.txttime);
        Button btnCalender = (Button) dialog.findViewById(R.id.btncalender);
        Button btnAdd = (Button) dialog.findViewById(R.id.btnadd);
        Button btnClose = (Button) dialog.findViewById(R.id.btnclose);

        btnCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogcalender();

            }
        });

    }

    private  void Dialogcalender(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_calender);
        dialog.show();

    }

}
