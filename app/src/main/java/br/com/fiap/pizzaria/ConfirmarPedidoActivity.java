package br.com.fiap.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.fiap.pizzaria.model.Pedido;

public class ConfirmarPedidoActivity extends AppCompatActivity {

    Pedido pedido = new Pedido();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_pedido);

        Intent i = getIntent();

        pedido = i.getParcelableExtra("PEDIDO");

        ((TextView)findViewById(R.id.tvTexto)).setText(pedido.getTamanho());

    }
}
