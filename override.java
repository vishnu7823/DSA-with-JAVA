public class override {
    public void makesound(){
        System.out.println("Animals are making sound ");
    }
    
    class Dog extends override {
        @Override
        public void makesound(){
            System.out.println("dogs are barking ");

        }

        public static void main(String[] args){
            Dog d = new Dog();
            System.out.println(d.makesound());
        }

    }

}
