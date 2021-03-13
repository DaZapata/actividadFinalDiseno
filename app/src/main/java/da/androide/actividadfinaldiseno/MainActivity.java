package da.androide.actividadfinaldiseno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton1 = (Button) findViewById(R.id.button);
        //boton1.setOnClickListener(this);

       // ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);
       // boton1.setOnClickListener(this);

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(getApplicationContext(), PesasActivity2.class);
                startActivity(intencion);
            }
        }));




        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton2);
        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(getApplicationContext(), EstaticasActivity2.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton3);
        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(getApplicationContext(), PiernasActivity2.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton4);
        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(getApplicationContext(), DorsalActivity2.class);
                startActivity(intencion);
            }
        }));


        /*
        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "pesas", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), PesasActivity2.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton);
        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "estaticas", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), PesasActivity2.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton);
        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "piernas", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), PesasActivity2.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton);
        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "camisas", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), PesasActivity2.class);
                startActivity(intencion);
            }
        }));
         */

    }

    @Override
    public void onClick(View v) {
        Intent intencion = new Intent(this, PesasActivity2.class);
        startActivity(intencion);
    }



}