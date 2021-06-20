package android.ayatexample.resolveurconvertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
    }
    public void intentLongueur(View view){
        Intent intent = new Intent(this, LongueurActivity.class);
        startActivity(intent);
    }
}