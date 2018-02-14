package profilemanager;
import java.util.Date;
public class Human {
    char gender;
    String firstName, lastName;
    Human partner;
    int identificationNumber;
    int yearBirth;
    int monthBirth;
    int dayBirth;
    public Human(String firstName,String lastName,char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender=gender;
    }
    public void speak(String words){
        System.out.println(words);
    }
    public void addPartner(Human humanCouple){
        this.partner = humanCouple;
        humanCouple.partner = this;
    }
    public Human getPartner(){
        return this.partner;
    }
    public void setId(int id){
        identificationNumber = id;
    }
    public int getId(){
        return identificationNumber;
    }
    public void setBirthDate(int yearBirth,int monthBirth, int dayBirth){
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.dayBirth = dayBirth;
    }
    // calculate your age
    public int getAge() {
        Date today = new Date();
        // if i only print today.getYear() it will print 118
        int currentYear = today.getYear() + 1900;// 2018
        int age = currentYear - yearBirth; // 2018 - 1993

        // 0 is january, so add 1
        int currentMonth = today.getMonth() + 1; //2
        if (currentMonth < monthBirth){
            age--;
        }
        else if(currentMonth==monthBirth){
            //day of the month
            int currentDay = today.getDate();
            if (dayBirth >currentDay){age--;}
        }
        return age;
    }
}
