package accountproject.accountdemo.RepositoryTest;

import accountproject.accountdemo.Model.Account;
import accountproject.accountdemo.Model.AccountType;
import accountproject.accountdemo.Model.User;
import accountproject.accountdemo.Repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void creatAccoutTest(){
//        Account newAccout = new Account(new Account().createAccount(),
//                AccountType.Checking,  300);
//        accountRepository.save(newAccout);
//

    }
}
