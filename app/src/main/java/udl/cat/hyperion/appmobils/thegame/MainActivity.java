package udl.cat.hyperion.appmobils.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_TERMINOS_Y_CONDICIONES = 1;

    private Button aboutPageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos_ycondiciones);
        setContentView(R.layout.activity_main);

        aboutPageButton = (Button) findViewById(R.id.button);
        aboutPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAboutPage();
            }
        });
    }

    public void openActivityAboutPage(){
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
}