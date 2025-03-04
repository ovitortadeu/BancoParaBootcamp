package model.repository;

import model.IConta;

public interface IBanco {
    void adicionarConta(IConta conta);
    IConta buscarConta(int numero);
}