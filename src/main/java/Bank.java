import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Daniel_D'AGE on 11.07.2018.
 */

@Entity
@Table(name = "banks_table")
public class Bank {

    @Id
    @Column(name="id")
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy = "increment")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
