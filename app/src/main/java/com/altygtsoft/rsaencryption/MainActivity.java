package com.altygtsoft.rsaencryption;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public EditText txtP;
    public EditText txtQ;
    public EditText txtMetin;
    public int p = 0;
    public int q = 0;
    public String metin = "start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionbarStyle();
        startCast();
    }

    private void actionbarStyle()
    {
        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null)
        {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(205, 200, 177)));
            actionBar.setTitle((Html.fromHtml("<font color=\"#3b414a\">" + getString(R.string.app_name) + "</font>")));

            actionBar.show();
        }
    }

    private boolean asalMi(int sayi)
    {
        boolean asal = true;

        for(int i=0; i<=sayi/2; i++)
        {
            if(sayi%i == 0)
            {
                asal = false;
                break;
            }
        }

        return asal;
    }

    private void startCast()
    {
        //2147483647 max int
        //9223372036854775807 max long

        txtP = (EditText)findViewById(R.id.txtP);
        txtQ = (EditText)findViewById(R.id.txtQ);
        txtMetin = (EditText)findViewById(R.id.txtMetin);

        try
        {
            p = Integer.parseInt(txtP.getText().toString());
            q = Integer.parseInt(txtQ.getText().toString());
            metin = txtMetin.getText().toString();
        }
        catch (Throwable e)
        {
            Log.d("THROW", "DEGERLER BOS OLABILIR !");
        }
        if(p != 0 && q != 0 && metin.equals("start"))
        {

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Alanlar Boþ Býrakýlamaz !",Toast.LENGTH_LONG).show();
        }
    }
}
