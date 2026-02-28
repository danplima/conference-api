package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_conference")
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conference")
    private long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "address", length = 255, nullable = false)
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
