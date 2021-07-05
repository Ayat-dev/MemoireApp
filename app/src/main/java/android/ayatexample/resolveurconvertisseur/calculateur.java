package android.ayatexample.resolveurconvertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class calculateur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculateur);
    }
    public void intentDegre2(View view){
        Intent intent = new Intent(this, equation2.class);
        startActivity(intent);
    }

    public void intentSys3(View view){
        Intent intent = new Intent(this, Sys3.class);
        startActivity(intent);
    }
}