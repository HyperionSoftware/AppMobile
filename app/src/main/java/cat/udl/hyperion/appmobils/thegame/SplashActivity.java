package cat.udl.hyperion.appmobils.thegame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import udl.cat.hyperion.appmobils.thegame.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setting splash screen for api >= 31
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            SplashScreen s = SplashScreen.installSplashScreen(this);
            s.setKeepOnScreenCondition(() -> true);
        }else{
            setContentView(R.layout.splash_screen);
        }

        // do heavy load things here
        // example case wait for N seconds and end this activity
        new Handler().postDelayed(this::endActivity, 5000);   //5 seconds
    }

    private void endActivity(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

}