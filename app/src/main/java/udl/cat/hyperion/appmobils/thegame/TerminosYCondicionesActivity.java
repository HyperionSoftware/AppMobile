package udl.cat.hyperion.appmobils.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class TerminosYCondicionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos_ycondiciones);
    }
    public void onBotonAceptarClick(View view) {
        // Aquí puedes guardar el estado de aceptación de los términos y condiciones en SharedPreferences o en la base de datos de tu aplicación.
        // También puedes iniciar la actividad principal de tu aplicación.
    }

}