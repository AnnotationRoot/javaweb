import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hello world on 2018/10/21.
 */
public class SunTest extends FatherTest {
    @Autowired
    private UserDao dao;

    @Test
    public void test() {
        List<User> users = dao.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
