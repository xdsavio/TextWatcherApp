package edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.callback;

import java.util.List;

import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.entidade.Pessoa;

public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);
}