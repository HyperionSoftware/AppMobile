package udl.cat.hyperion.appmobils.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutPageButton;
    private Button termsAndConditionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutPageButton = (Button) findViewById(R.id.button);
        aboutPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAboutPage();
            }
        });

        termsAndConditionsButton = (Button) findViewById(R.id.button2);
        termsAndConditionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitytermsAndConditionsPage();
            }
        });

    }

    public void openActivityAboutPage(){
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }
    public void openActivitytermsAndConditionsPage(){
        Intent intent = new Intent(this, TermsAndConditions.class);
        startActivity(intent);
    }
}