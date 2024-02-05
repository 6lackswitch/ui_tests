import org.testng.Assert;
import org.testng.annotations.Test;
import org.ui.elements.ResultForm;
import org.ui.models.Student;
import org.ui.pages.PracticeFormPage;

public class PracticeFormTest extends BaseTest{
    @Test
    public void registrationFormTest() {
        Student student = new Student();
        student.setFirstName("name");
        student.setLastName("last");
        student.setEmail("example@example.com");
        student.setGender("Male");
        student.setMobile("3454354353");
        student.setBirthday("14 March 2011");
        student.setSubjects("English");
        student.setHobbies("Music");
        student.setPicturePath(this.getClass().getResource("/cat.jpg").getPath());
        student.setAddress("Siberia, Forest, Anywhere");
        student.setState("Haryana");
        student.setCity("Panipat");

        new PracticeFormPage()
                .setFirstName(student.getFirstName())
                .setLastName(student.getLastName())
                .setUserEmail(student.getEmail())
                .setGender(student.getGender())
                .setUserNumber(student.getMobile())
                .setDateOfBirth(student.getBirthday())
                .setSubject(student.getSubjects())
                .setHobbie(student.getHobbies())
                .uploadPicture(student.getPicturePath())
                .setCurrentAddress(student.getAddress())
                .setState(student.getState())
                .setCity(student.getCity())
                .submit();

        ResultForm resultForm = new ResultForm();

        Assert.assertEquals(resultForm.getTitle(), "Thanks for submitting the form");

        Assert.assertEquals(resultForm.getFullName(), student.getFullName());
        Assert.assertEquals(resultForm.getEmail(), student.getEmail());
        Assert.assertEquals(resultForm.getGender(), student.getGender());
        Assert.assertEquals(resultForm.getNumber(), student.getMobile());
        Assert.assertEquals(resultForm.getBirthday(), student.getBirthday());
        Assert.assertEquals(resultForm.getSubjects(), student.getSubjects());
        Assert.assertEquals(resultForm.getHobbies(), student.getHobbies());
        Assert.assertEquals(resultForm.getPicture(), student.getPictureName());
        Assert.assertEquals(resultForm.getAddress(), student.getAddress());
        Assert.assertEquals(resultForm.getStateAndCity(), student.getStateAndCity());
    }
}
