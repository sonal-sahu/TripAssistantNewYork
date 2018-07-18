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

public class StatueOfLiberty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statue_of_liberty);

        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMultisol=(EditText) findViewById(R.id.editTextsol);
        editTextMultisol.setEnabled(false);
        editTextMultisol.setKeyListener(null);
        //Stay
        TextView staysolfirsttext=(TextView)findViewById(R.id.textView48);
        staysolfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staysolthirdtext=(TextView)findViewById(R.id.textView50);
        staysolthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staysolsecondtext=(TextView)findViewById(R.id.textView49);
        staysolsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        //Restaurants
        TextView restsolfirsttext=(TextView)findViewById(R.id.textView52);
        restsolfirsttext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restsolthirdtext=(TextView)findViewById(R.id.textView54);
        restsolthirdtext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restsolsecondtext=(TextView)findViewById(R.id.textView53);
        restsolsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
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
    public void solshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Statue of Liberty Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
