public class encapsulation{

    private String name;
    private int age;

    public encapsulation(String name,int age){
        this.name = name;
        this.age = age;
    }

    //creating getter and setter methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public static void main(String[] args){
        encapsulation e = new encapsulation("vishnu", 21);
        System.out.println(e.getName());
    }
}