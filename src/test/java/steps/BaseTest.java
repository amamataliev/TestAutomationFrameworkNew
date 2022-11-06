package steps;

import com.digital_nomads.dataProvider.MockDataGenerator;
import com.digital_nomads.helperMethods.Helper;
import com.digital_nomads.pages.AddNewUserPage;
import com.digital_nomads.pages.AdminHomePage;
import com.digital_nomads.pages.IMovingPage1;
import com.digital_nomads.pages.LoginPage;


public abstract class BaseTest {
   protected LoginPage loginPage = new LoginPage();
    protected Helper helper = new Helper();
    protected AdminHomePage adminHomePage = new AdminHomePage();
    protected AddNewUserPage addNewUserPage = new AddNewUserPage();

    protected MockDataGenerator mockDataGenerator = new MockDataGenerator();

    protected IMovingPage1 iMovingPage1 = new IMovingPage1();

}
