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

public class RockefellerCenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rockefeller_center);

        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMultiroc=(EditText) findViewById(R.id.editTextroc);
        editTextMultiroc.setEnabled(false);
        editTextMultiroc.setKeyListener(null);
        //Stay
        TextView stayrocfirsttext=(TextView)findViewById(R.id.textView74);
        stayrocfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView stayrocthirdtext=(TextView)findViewById(R.id.textView76);
        stayrocthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView stayrocsecondtext=(TextView)findViewById(R.id.textView75);
        stayrocsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        //Restaurants
        TextView restrocfirsttext=(TextView)findViewById(R.id.textView78);
        restrocfirsttext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restrocthirdtext=(TextView)findViewById(R.id.textView80);
        restrocthirdtext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restrocsecondtext=(TextView)findViewById(R.id.textView79);
        restrocsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
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
    public void rfshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Rockfellar Center Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
