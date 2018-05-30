package com.tech.gigabyte.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creating Alert Dialog
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Confirm Delete.....");

                //Alert Dialog Message
                alertDialog.setMessage("Are you sure you want  delete this? ");

                //Alert Dialog Icon
                alertDialog.setIcon(R.drawable.delete);

                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(MainActivity.this, "You clicked positive button", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked negative button", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });


    }
}