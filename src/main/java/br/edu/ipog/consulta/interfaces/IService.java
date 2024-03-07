package br.edu.ipog.consulta.interfaces;

import java.util.List;

/**
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">...</a>
 * T = Type (aluno,pessoa,carro, etc)
 * N = Number (integer, bigInt, BigDecimal,double)
 *  * C - create
 *  * R - readById
 *  * R - Read()
 *  * U - update
 *  * D - delete
 */
public interface IService<T,N> {

    /**
     * Cria uma entity
     * @param entity
     * @return
     */
    public T create(T entity);

    /**
     * Busca uma entity de acordo com um id especificado
     * @param id
     * @return
     */
    public T readById(N id);

    /**
     * Retorna uma lista de List<T>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">...</a>
     * @return
     */
    public List<T> read();

    /**
     *
     * @param id para identificar o registro a ser atualizado
     * @param entity valores que serão atualizado durante a operação de persitência
     * @return
     */
    public T update(N id, T entity);

    /**
     *
     * @param id - identificador do registro a ser deletado;
     */
    public T deleteById(N id);

    /**
     *
     * @param entity - entidade que será removida do sistema;
     * @return
     */
    public T delete(T entity);
}
