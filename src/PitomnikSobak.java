public class PitomnikSobak {
    private Dog[] dogs;
    private int counter;

    public PitomnikSobak(int size) {
        dogs = new Dog[size];
        counter = 0;
    }

    public void addDog(Dog dog) {
        if (counter < dogs.length) {
            dogs[counter] = dog;
            counter++;
        }
    }

    public static void main(String[] args) {
        PitomnikSobak priut = new PitomnikSobak(5);

        Dog dog1 = new Dog(" песик1 ",5);
        Dog dog2 = new Dog(" песик2 ",12);
        Dog dog3 = new Dog(" песик3 ",2);

        priut.addDog(dog1);
        priut.addDog(dog2);
        priut.addDog(dog3);

        System.out.println(dog1);
        System.out.println("Человеческий возраст ~=" + dog1.getHumanAge());


        System.out.println(dog2);
        System.out.println("Человеческий возраст ~=" + dog2.getHumanAge());

        System.out.println(dog3);
        System.out.println("Человеческий возраст ~=" + dog3.getHumanAge());

    }
}


