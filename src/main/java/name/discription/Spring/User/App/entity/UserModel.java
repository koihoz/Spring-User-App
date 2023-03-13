package name.discription.Spring.User.App.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // стратегия описания ID. поле будет заполняться базой данных
    private Long id;

    @Column(name="user_name")
    private String name;

    @Column(name="user_login")
    private String login;

    @Column(name="user_password")
    private String password;

    @Column(name="user_creation_date")
    @CreationTimestamp
    private LocalDateTime creationDate;

    @ManyToMany()
    @JoinTable(name = "users_to_cities", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "cities_id"))
    private Set<CityModel> cities;

}
