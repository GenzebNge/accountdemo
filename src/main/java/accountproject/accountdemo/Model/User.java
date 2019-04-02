package accountproject.accountdemo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private String Id;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Account> accounts;


    public User() {
    }

    public User(String id, List<Account> accounts) {
        Id = id;
        this.accounts = accounts;
    }

    public String getUserId() {
        return Id;
    }

      public  User withUserId(String userId) {
        this.Id = userId;
       return this;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public User withUserAccount(List<Account> accounts) {
        this.accounts = accounts;
        return this;
    }
}
