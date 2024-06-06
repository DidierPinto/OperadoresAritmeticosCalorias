package unal.todosalau.cambiapantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private Button sumButton;
    private TextView resultTextView;

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        back = findViewById(R.id.regresar);
        num1EditText = findViewById(R.id.ingresardato1);
        num2EditText = findViewById(R.id.datos2);
        sumButton = findViewById(R.id.res);
        resultTextView = findViewById(R.id.resul2);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double suma = num1 + num2;
                resultTextView.setText("El resultado es: " + suma);
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent back = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(back);
            }
        });
    }
}