package edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.R;
import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.entidade.Pessoa;

public class PerfilActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        final Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                BuscarNome();
            }
        });

        Intent intent = getIntent();
        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");

        TextView txtInscription = (TextView) findViewById(R.id.inscription);
        TextView txtFullName = (TextView) findViewById(R.id.fullName);
        TextView txtId = (TextView) findViewById(R.id.id);
        TextView txtEmail = (TextView) findViewById(R.id.email);
        TextView txtIsDelivered = (TextView) findViewById(R.id.isDelivered);

        txtInscription.setText(pessoa.getDescricao());
        txtFullName.setText(pessoa.getNome());
        txtId.setText("Identificador numérico: " + pessoa.getId());
        txtEmail.setText(pessoa.getEmail());
        if (pessoa.isEntregue()) {
            txtIsDelivered.setText("Situação da entrega: Foi Realizada!");
        } else
            txtIsDelivered.setText("Situação da entrega: Não foi Realizada!");

    }
    public void BuscarNome(){
        startActivity(new Intent(this, BuscarNomeActivity.class));
    }
}
