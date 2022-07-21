package repository;

import java.util.List;

public interface Repository<I,T> {

    public List<T> buscarTodos();

    public T buscarPorId(I id);

    public void salvar(I id, T objeto);

    public void excluir(I id);
}
