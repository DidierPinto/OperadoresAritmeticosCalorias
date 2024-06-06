package unal.todosalau.cambiapantallas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    private EditText pesoEditText, tiempoEditText, metEditText;
    private TextView caloriesBurnedTextView;
    private Button calculateButton;
    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        pesoEditText = findViewById(R.id.texto1);
        tiempoEditText = findViewById(R.id.texto2);
        metEditText = findViewById(R.id.texto3);
        caloriesBurnedTextView = findViewById(R.id.textView10);
        calculateButton = findViewById(R.id.button12);
        back = findViewById(R.id.button13);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCaloriesBurned();
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent back = new Intent(MainActivity7.this, MainActivity2.class);
                startActivity(back);
            }
        });
    }


    private void calculateCaloriesBurned() {
        double peso = 0;
        double tiempo = 0;
        double met = 0;

        try {
            peso = Double.parseDouble(pesoEditText.getText().toString());
            tiempo = Double.parseDouble(tiempoEditText.getText().toString());
            met = Double.parseDouble(metEditText.getText().toString());
        } catch (NumberFormatException e) {
            caloriesBurnedTextView.setText("Ingrese los datos indicados");
            return;
        }

        double caloriasQuemadas = (peso * tiempo * met) / 60;
        caloriesBurnedTextView.setText(String.format("Calorías quemadas: %.2f", caloriasQuemadas));



    }


}
