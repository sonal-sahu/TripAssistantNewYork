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

public class LongBeach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_beach);
        EditText editTextMultilb=(EditText) findViewById(R.id.editTextlb);
        editTextMultilb.setEnabled(false);
        editTextMultilb.setKeyListener(null);
        //Stay
        TextView staylbfirsttext=(TextView)findViewById(R.id.textView22);
        staylbfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staylbthirdtext=(TextView)findViewById(R.id.textView24);
        staylbthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staylbsecondtext=(TextView)findViewById(R.id.textView23);
        staylbsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        //Restaurants
        TextView restlbfirsttext=(TextView)findViewById(R.id.textView26);
        restlbfirsttext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restlbthirdtext=(TextView)findViewById(R.id.textView28);
        restlbthirdtext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restlbsecondtext=(TextView)findViewById(R.id.textView27);
        restlbsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void lbshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Long Beach Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
