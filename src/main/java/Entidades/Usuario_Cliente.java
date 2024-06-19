package Entidades;
import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Usuario_Cliente")
public class Usuario_Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth0Id")
    private String auth0Id;
    @Column(name = "username")
    private String username;

    public Usuario_Cliente() {
    }

    public Usuario_Cliente(String auth0Id, String username) {
        this.auth0Id = auth0Id;
        this.username = username;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
