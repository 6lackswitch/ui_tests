import org.testng.Assert;
import org.testng.annotations.Test;
import org.ui.elements.ResultForm;
import org.ui.pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest{
    @Test
    public void registrationFormTest() {
        new PracticeFormPage()
                .setFirstName("name")
                .setLastName("last")
                .setUserEmail("example@example.com")
                .setGender("Male")
                .setUserNumber("3454354353")
                .setDateOfBirth("14 March 2011")
                .setSubject("English")
                .setHobbie("Music")
                .uploadPicture(this.getClass().getResource("/cat.jpg").getPath())
                .setCurrentAddress("Siberia, Forest, Anywhere")
                .setState("Haryana")
                .setCity("Panipat")
                .submit();

        ResultForm resultForm = new ResultForm();

        Assert.assertEquals(resultForm.getTitle(), "Thanks for submitting the form");

        Assert.assertEquals(resultForm.getFullName(), "name last");
        Assert.assertEquals(resultForm.getEmail(), "example@example.com");
        Assert.assertEquals(resultForm.getGender(), "Male");
        Assert.assertEquals(resultForm.getNumber(), "3454354353");
        Assert.assertEquals(resultForm.getBirthday(), "14 March,2011");
        Assert.assertEquals(resultForm.getSubjects(), "English");
        Assert.assertEquals(resultForm.getHobbies(), "Music");
        Assert.assertEquals(resultForm.getPicture(), "cat.jpg");
        Assert.assertEquals(resultForm.getAddress(), "Siberia, Forest, Anywhere");
        Assert.assertEquals(resultForm.getStateAndCity(), "Haryana Panipat");
    }
}
