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

public class NiagraFalls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niagra_falls);
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMultinf=(EditText) findViewById(R.id.editTextnf);
        editTextMultinf.setEnabled(false);
        editTextMultinf.setKeyListener(null);
        //Stay
        TextView staynffirsttext=(TextView)findViewById(R.id.textView35);
        staynffirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staynfthirdtext=(TextView)findViewById(R.id.textView37);
        staynfthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staynfsecondtext=(TextView)findViewById(R.id.textView36);
        staynfsecondtext.setMovementMethod(LinkMovementMethod.getInstance());
        //Restaurants
        TextView restnffirsttext=(TextView)findViewById(R.id.textView39);
        restnffirsttext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restnfthirdtext=(TextView)findViewById(R.id.textView41);
        restnfthirdtext.setMovementMethod(LinkMovementMethod.getInstance());
        TextView restnfsecondtext=(TextView)findViewById(R.id.textView40);
        restnfsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

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
    public void nfshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Niagra Falls Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
