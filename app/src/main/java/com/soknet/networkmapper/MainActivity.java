package com.soknet.networkmapper;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        // test functions
        /*
        Utils.getMACAddress("wlan0");
        Utils.getMACAddress("eth0");
        Utils.getIPAddress(true); // IPv4
        Utils.getIPAddress(false); // IPv6

        // */

        CharSequence text1 = "Hello toast! tosta rica y nada más";
        CharSequence text = Utils.getIPAddress(false); // IPv6
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
        TextView texto = (TextView) findViewById(R.id.texto);


        //texto.setText(Utils.getIPAddress(true));
        ConnectivityManager redManager = ConnectivityManager(context);
        NetworkInfo red = redManager.getActiveNetworkInfo();
        texto.setText(red.getExtraInfo());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
