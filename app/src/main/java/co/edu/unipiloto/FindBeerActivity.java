package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view){
        //Referencia al TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Referencia al spinner
        Spinner color= (Spinner) findViewById(R.id.color);
        //Obtener item seleccionado en el Spinner
        String beerType = String.valueOf(color.getSelectedItemId());
        //Mostrar el item seleccionado
        brands.setText(beerType);

    }
}