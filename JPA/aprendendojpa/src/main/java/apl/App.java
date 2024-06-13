package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DOMINIO.pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        pessoa n1 = new pessoa("pedrita2", null);
        pessoa n2 = new pessoa("pedrita32", null);
        pessoa n4 = new pessoa("pedrita32", null);

        //criando a conexão com banco 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        //extremamente parecido com as funções assincronas do javascript faz transição ele mesmo cria as tabelas e persiste elas no banco de dados
        em.getTransaction().begin();
            em.persist(n1);
            em.persist(n2);
            em.persist(n4);
        em.getTransaction().commit();

        //fazendo pesquisas no banco de dados 
        pessoa p = em.find(pessoa.class, 1);
        System.err.println(p);
        /* 
         * operações que n são simples consultas devem estar entre transações mesma coisa que no javascript
         * em.getTransaction().begin()
         * em.geTransaction().commit()
        */
        System.err.println("pronto");
        em.close();
        emf.close();
    }
}
