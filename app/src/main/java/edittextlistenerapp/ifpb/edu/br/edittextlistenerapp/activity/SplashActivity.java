package edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.R;

public class SplashActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler SplashScreen = new Handler();
        SplashScreen.postDelayed(SplashActivity.this, 4000);
    }
    @Override
    public void run() {
        Intent intent = new Intent(this, BuscarNomeActivity.class);
        this.startActivity(intent);
        this.finish();
    }
}