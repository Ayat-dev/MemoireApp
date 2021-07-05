package android.ayatexample.resolveurconvertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.title1:
                startActivity(new Intent(this,conversion.class));
                break;
            case R.id.title2:
                startActivity(new Intent(this,calculateur.class));
                break;
            case R.id.title3:
                startActivity(new Intent(this,calculatrice.class));
                break;
        }
        return super.onOptionsItemSelected(item);
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