package lqm.am;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numeroObtenido;
    Button btnLanzar;
    ImageView imgDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroObtenido = findViewById(R.id.txtNumObtenido);
        btnLanzar = findViewById(R.id.btnLanzar);
        imgDado = findViewById(R.id.imgDado);


        btnLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int aleatorio = numObtenido();

                //  numeroObtenido.setText(aleatorio);
                System.out.println(aleatorio);
            }
        });

        imgDado.setOnClickListener(this);
        numeroObtenido.setOnClickListener(this);
        btnLanzar.setOnClickListener(this);

    }

    public int numObtenido() {

        Random random = new Random();
        // numero entre 1 al 6
        int val = random.nextInt(7 - 1) + 1;
        return val;
    }

    @Override
    public void onClick(View view) {

        switch (numObtenido()) {

            case 1:

                imgDado.setImageResource(R.drawable.dice_1);
                numeroObtenido.setText("1");
                break;

            case 2:
                imgDado.setImageResource(R.drawable.dice_2);
                numeroObtenido.setText("2");
                break;

            case 3:

                imgDado.setImageResource(R.drawable.dice_3);
                numeroObtenido.setText("3");
                break;

            case 4:

                imgDado.setImageResource(R.drawable.dice_4);
                numeroObtenido.setText("4");
                break;

            case 5:

                imgDado.setImageResource(R.drawable.dice_5);
                numeroObtenido.setText("5");
                break;

            case 6:
                imgDado.setImageResource(R.drawable.dice_6);
                numeroObtenido.setText("6");
                break;

            default:
                System.out.println("Eso es incorrecto!");
        }

    }
}