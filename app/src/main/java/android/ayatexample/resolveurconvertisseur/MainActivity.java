package android.ayatexample.resolveurconvertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void intentConversion(View view){
        Intent intent = new Intent(this, conversion.class);
        startActivity(intent);
    }
    public void intentCalculateur(View view){
        Intent intent = new Intent(this, calculateur.class);
        startActivity(intent);
    }
    public void intentCalculatrice(View view){
        Intent intent = new Intent(this, calculatrice.class);
        startActivity(intent);
    }
}