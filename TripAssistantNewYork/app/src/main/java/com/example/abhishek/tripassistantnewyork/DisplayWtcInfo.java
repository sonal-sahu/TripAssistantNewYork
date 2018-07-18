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

public class DisplayWtcInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMulti=(EditText) findViewById(R.id.editText);
        editTextMulti.setEnabled(false);
        editTextMulti.setKeyListener(null);

        TextView stayairpnbtext=(TextView)findViewById(R.id.textView6);
        stayairpnbtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staypricelinetext=(TextView)findViewById(R.id.textView7);
        staypricelinetext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staywtcthirdtext=(TextView)findViewById(R.id.textView8);
        staywtcthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcfirsttext=(TextView)findViewById(R.id.textView11);
        restwtcfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcsecondtext=(TextView)findViewById(R.id.textView13);
        restwtcsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcthirdtext=(TextView)findViewById(R.id.textView14);
        restwtcthirdtext.setMovementMethod(LinkMovementMethod.getInstance());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void shareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "World Trade Center Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
