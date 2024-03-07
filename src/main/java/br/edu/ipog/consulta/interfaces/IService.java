package br.edu.ipog.consulta.interfaces;

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




}
