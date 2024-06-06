package unal.todosalau.cambiapantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button multi = findViewById(R.id.button2);
        Button suma = findViewById(R.id.button3);
        Button rest = findViewById(R.id.button4);
        Button div = findViewById(R.id.button5);
        //Button por = findViewById(R.id.button6);
        Button cal = findViewById(R.id.button6);
        Button back = findViewById(R.id.button);

        multi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(next);
            }
        });

        suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(next);
            }
        });

        rest.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(next);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(next);
            }
        });

        //por.setOnClickListener(new View.OnClickListener(){
            //public void onClick(View v){
                //Intent next = new Intent(MainActivity2.this, MainActivity8.class);
                //startActivity(next);
            //}
        //});

        cal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity(next);
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(next);
            }
        });

    }
}