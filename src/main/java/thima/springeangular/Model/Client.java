package thima.springeangular.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientID;
    private String clientName;
    private Short clientAge;
    private String clientCity;

    public Client() {
    }

    public Client(Long clientID, String clientName, Short clientAge, String clientCity) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.clientCity = clientCity;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Short getClientAge() {
        return clientAge;
    }

    public void setClientAge(Short clientAge) {
        this.clientAge = clientAge;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }
}
