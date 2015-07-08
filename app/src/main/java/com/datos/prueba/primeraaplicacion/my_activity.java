package com.datos.prueba.primeraaplicacion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class my_activity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "company.Kcumendigital.primeraaplicacion.Mensaje";
    private EditText et_mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSetings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openSearch(){}
    public void openSetings(){}

// funcionalidad del boton
    public void enviar_mensaje(View v) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);// creacion del intent encargado de lanzar el nuevo activity
        EditText editText = (EditText) findViewById(R.id.et_mensaje);
        String mensaje = editText.getText().toString(); //Se captura los datos del edittext
        intent.putExtra(EXTRA_MESSAGE, mensaje);
        startActivity(intent); //Inicializa la actividad con el intent creado
    }
}
