package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();
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
        String beerType = String.valueOf(color.getSelectedItem());
        //Recupera la lista de cervezas posibles desde la clase
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        //Mostrar el item seleccionado
        brands.setText(brandsFormatted);

    }
}