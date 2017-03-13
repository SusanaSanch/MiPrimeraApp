package femxa.cam.edu.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ActividadPrincipal extends AppCompatActivity {

    private String leDoyLaVuelta(String texto)
    {
        String texto_al_reves = "";

            for(int i = texto.length()-1; i>=0; i--)
            {
                texto_al_reves = texto_al_reves + texto.charAt(i);
            }

        Log.d("MENSAJEALREVES", texto_al_reves);

        return texto_al_reves;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        Log.d("MIMENSAJE", "ID BOTON = " +R.id.button);
        View v = findViewById(R.id.button);

        Button boton = (Button)v;

        getLayoutInflater();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (R.id.button == v.getId())
                {
                    Log.d("MIMENSAJE", "Ha tocado el botón, TIENE RAZÓN");
                }
                else
                {
                    Log.d("MIMENSAJE", "MIENTE");
                }

                // TODO: 06/03/2017 coger el contenido del edit text
                EditText editText = (EditText) findViewById(R.id.mieditortexto);
                String texto  = editText.getText().toString();
                Log.d("MIMENSAJE", "nombre intro " + texto);

                // TODO: 06/03/2017  darle la vuelta
                String texto_al_reves = leDoyLaVuelta (texto);
                Log.d("MIMENSAJE", "Nombre al revés " + texto_al_reves);

                // TODO: 06/03/2017 ponerlo en el text view
                TextView textView = (TextView) findViewById(R.id.micajatexto);
                textView.setText(texto_al_reves);
                Log.d("MIMENSAJE", "Se ha mostrado el nombre al revés");

            }
        });

    }
}
