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

public class TimesSquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times_square);

        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMultits=(EditText) findViewById(R.id.editTextts);
        editTextMultits.setEnabled(false);
        editTextMultits.setKeyListener(null);
        //Stay
        TextView staytsfirsttext=(TextView)findViewById(R.id.textView61);
        staytsfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staytsthirdtext=(TextView)findViewById(R.id.textView63);
        staytsthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staytssecondtext=(TextView)findViewById(R.id.textView62);
        staytssecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        //Restaurants
        TextView resttsfirsttext=(TextView)findViewById(R.id.textView65);
        resttsfirsttext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView resttsthirdtext=(TextView)findViewById(R.id.textView67);
        resttsthirdtext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView resttssecondtext=(TextView)findViewById(R.id.textView66);
        resttssecondtext.setMovementMethod(LinkMovementMethod.getInstance());
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
    public void tsshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Times Sqaure Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
