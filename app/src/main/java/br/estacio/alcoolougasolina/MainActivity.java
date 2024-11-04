package br.estacio.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtAlcool;
    private EditText txtGasolina;
    private Button btnVerificar;
    private TextView txtvMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recuperar e vincular os objetos da tela com os atributos da classe
        txtAlcool = (EditText) findViewById(R.id.txtAlcool);
        txtGasolina = (EditText) findViewById(R.id.txtGasolina);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        txtvMensagem = (TextView) findViewById(R.id.txtvMensagem);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // Pegando o valor digitados dos campos de alcool e gasolina e convertendo para
                // variáveis do tipo double para que possamos fazer cálculos necessários.
                double valorAlcool = Double.parseDouble(txtAlcool.getText().toString());
                double valorGasol = Double.parseDouble(txtGasolina.getText().toString());

                //Cálculo alcool e gasolina
                // resultado = alcool/gasolina -> resultado <= 0.7 (melhor abastecer com alcool, senão gasolina

                double resultado  = valorAlcool / valorGasol;
                if ( resultado <= 0.7)
                {
                    // Adicionar uma resposta para o texview que vai aparecer na tela do usuário
                    txtvMensagem.setText("È melhor abastecer com Alcool");
                }
                else
                {
                    txtvMensagem.setText("È melhor abastecer com Gasolina");
                }

            }
        });



    }
}
