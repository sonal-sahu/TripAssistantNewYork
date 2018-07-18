package com.example.abhishek.tripassistantnewyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayBroadwayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_broadway_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText editTextMultibw=(EditText) findViewById(R.id.editTextbw);
        editTextMultibw.setEnabled(false);
        editTextMultibw.setKeyListener(null);

        TextView bwstaytext1=(TextView)findViewById(R.id.textViewbwsr1);
        bwstaytext1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bwstaytext2=(TextView)findViewById(R.id.textViewbwsr2);
        bwstaytext2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bwstaytext3=(TextView)findViewById(R.id.textViewbwsr3);
        bwstaytext3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bwrestfirsttext=(TextView)findViewById(R.id.textViewbwres1);
        bwrestfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bwrestsecondtext=(TextView)findViewById(R.id.textViewbwres2);
        bwrestsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cprestthirdtext=(TextView)findViewById(R.id.textViewbwres3);
        cprestthirdtext.setMovementMethod(LinkMovementMethod.getInstance());




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void bwshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Broadway Theatre Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
