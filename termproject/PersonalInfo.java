// not modified by ARKO. see the comment on line 26

package termproject;

/**
 * Created by HP on 11/30/2015.
 */
public class PersonalInfo {
    private String name;
    private String mobile;
    private String address;
    private String email;
    private String gender;
    private String age;



    public PersonalInfo(String text, String text1, String text2, String text3, String text4) {
        this.name = text;
        this.mobile = text1;
        this.address = text2;
        this.email = text3;
        this.age = text4;
    }

    PersonalInfo p;   // ARKO: I have confusion whether this will work properly
    public String getName(){
        return name;
    }

    public String getMobile(){
        return mobile;
    }

    public String getAddress(){
        return address;
    }

    public String getGender(){
        return gender;
    }

    public String getEmail(){
        return email;
    }

    public String getAge(){
        return age;
    }

    public PersonalInfo getInstance(){
        return p;
    }

}
