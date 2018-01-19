package fauzi.hilmy.quizoddeven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNomor;
    Button btnCheck;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomor = (EditText)findViewById(R.id.editText);
        btnCheck = (Button)findViewById(R.id.button);
        lblHasil = (TextView)findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = etNomor.getText().toString();
                int nAngka = Integer.parseInt(angka);

                if (nAngka % 2 == 1) {
                    lblHasil.setText(nAngka + " Adalah bil Ganjil");
                }else if(nAngka % 2 == 0) {
                    lblHasil.setText(nAngka + " Adalah bil Genap");
                }
            }
        });
    }
}
