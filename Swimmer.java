package sample;

public class Swimmer{
    private String name;
    private String sex;
    private int age;
    private float time;
    private String ageGroup = "Child";

//    Teen: 13-17, Young Adult: 18-19, Adult: 20-55

    public Swimmer(String name, String sex, int age, float time){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.time = time;

        if(this.age >= 13 && this.age <= 17){
            this.ageGroup = "Teen";
        }
        if(this.age >= 18 && this.age <= 19){
            this.ageGroup = "Young Adult";
        }
        if(this.age >= 20 && this.age <= 55){
            this.ageGroup = "Adult";
        }
    }

    public String printFormattedSwimmer(){
        return "Name: " + this.name + "\nSex: " + this.sex + "\nAge: " + this.age + "\nTime: " + this.time + "\nAge Group: " + this.ageGroup;
    }

    @Override
    public String toString() {
        return "{Name: " + this.name + " Sex: " + this.sex + " Age: " + this.age + " Time: " + this.time + " Age Group: " + this.ageGroup + "}";
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public float getTime(){
        return this.time;
    }

    public int getAge(){
        return this.age;
    }

    public String getAgeGroup(){
        return this.ageGroup;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAgeGroup(int age) {
        if(age >= 13 && age <= 17){
            this.ageGroup = "Teen";
        }
        if(age >= 18 && age <= 19){
            this.ageGroup = "Young Adult";
        }
        if(age >= 20 && age <= 55){
            this.ageGroup = "Adult";
        }
    }
}
