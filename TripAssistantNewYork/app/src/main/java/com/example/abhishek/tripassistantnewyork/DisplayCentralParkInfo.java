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

public class DisplayCentralParkInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_central_park_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMulticp=(EditText) findViewById(R.id.editTextcp);
        editTextMulticp.setEnabled(false);
        editTextMulticp.setKeyListener(null);

        TextView cpstaytext1=(TextView)findViewById(R.id.textViewcpsr1);
        cpstaytext1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cpstaytext2=(TextView)findViewById(R.id.textViewcpsr2);
        cpstaytext2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cpstaytext3=(TextView)findViewById(R.id.textViewcpsr3);
        cpstaytext3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cprestfirsttext=(TextView)findViewById(R.id.textViewcpres1);
        cprestfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cprestsecondtext=(TextView)findViewById(R.id.textViewcpres2);
        cprestsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cprestthirdtext=(TextView)findViewById(R.id.textViewcpres3);
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
    public void cpshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Cental Park Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
