package br.com.industrialararaquara.listaalunos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"João", "Livia", "Roberclaúdio", "Cleidineia"};

        ListView listaAlunos = findViewById(R.id.lista_alunos);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);

        listaAlunos.setAdapter(adapter);

    }
}
