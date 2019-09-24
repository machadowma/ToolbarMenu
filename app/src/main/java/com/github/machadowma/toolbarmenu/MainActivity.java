package com.github.machadowma.toolbarmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar minhaToolbar = (Toolbar) findViewById(R.id.minha_toolbar);
        setSupportActionBar(minhaToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setup:
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.star:
                Toast.makeText(this, "Estrela", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.email:
                Toast.makeText(this, "E-mail", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.lock:
                Toast.makeText(this, "Bloquear", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "Compartilhar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.power_off:
                Toast.makeText(this, "Sair", Toast.LENGTH_SHORT).show();
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }
}
