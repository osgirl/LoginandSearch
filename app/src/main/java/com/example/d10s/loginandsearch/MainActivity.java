package com.example.d10s.loginandsearch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{
    String url = "http://www.netflix.com/Login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView statuscode = (TextView) findViewById(R.id.textView);
        TextView statusmsg = (TextView) findViewById(R.id.textView2);
        Toast.makeText(this, "Textview correcto", Toast.LENGTH_SHORT).show();

        UserRegistrationTest hola = new UserRegistrationTest();
        try {
            hola.assertUserAccountCanRegistered();
            if(!hola.jo.isEmpty())
                Toast.makeText(this, hola.jo, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //statuscode.append(driver.getTitle());
        statuscode.setText("Esto ya");
        //statusmsg.append(driver.getPageSource());
        statusmsg.setText("no crasheo!!!");
        }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
