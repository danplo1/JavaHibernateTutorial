import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Daniel_D'AGE on 11.07.2018.
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");


        Client client = new Client();
        client.setId(1);
        client.setName("Tomasz");

        Bank bank = new Bank();
        bank.setName("Bankster");


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}
