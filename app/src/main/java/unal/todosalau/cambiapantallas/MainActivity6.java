package unal.todosalau.cambiapantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    private EditText num1EditText;
    private EditText num2EditText;
    private Button divButton;
    private TextView resultTextView;

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        back = findViewById(R.id.button11);
        num1EditText = findViewById(R.id.editTextText3);
        num2EditText = findViewById(R.id.editTextText4);
        divButton = findViewById(R.id.button10);
        resultTextView = findViewById(R.id.textView8);

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double res = num1 / num2;
                resultTextView.setText("El resultado es: " + res);

            }

        });



        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent back = new Intent(MainActivity6.this, MainActivity2.class);
                startActivity(back);
            }
        });
    }
}