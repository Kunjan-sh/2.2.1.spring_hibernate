package hiber.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() { }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", series=" + series + '}';
    }

    public void setUser(User user) {
        this.user = user;
    }
}
