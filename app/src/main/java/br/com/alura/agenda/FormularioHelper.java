package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.model.Aluno;

/**
 * Created by daniel on 10/01/17.
 */

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {
        this.campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        this.campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        this.campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        this.campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        this.campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(this.campoNome.getText().toString());
        aluno.setEndereco(this.campoEndereco.getText().toString());
        aluno.setTelefone(this.campoTelefone.getText().toString());
        aluno.setSite(this.campoSite.getText().toString());
        aluno.setNota(Double.valueOf(this.campoNota.getProgress()));
        return aluno;
    }
}
