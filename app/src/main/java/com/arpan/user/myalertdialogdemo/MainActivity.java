package com.arpan.user.myalertdialogdemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        public Button button;
    public AlertDialog.Builder alertDialogBulder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        alertDialogBulder = new AlertDialog.Builder(MainActivity.this);
        //for setting title
        alertDialogBulder.setTitle("ALERT TITLE");
        //SETTING MESSAGE
        alertDialogBulder.setMessage("ARE YOU WANT TO EXIT?");
        //set icon
        alertDialogBulder.setIcon(R.drawable.quest);
        alertDialogBulder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialogBulder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertDialogBulder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"YOU CLICK CANCEL",Toast.LENGTH_SHORT)
                        .show();
            }
        });
        AlertDialog alertDialog=alertDialogBulder.create();
        alertDialog.show();
    }
}
