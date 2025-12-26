public class DogLauncher {
    public static void main(String[] args){
       Dog[] dogs = new Dog[2];
       dogs[0] = new Dog(8);
       dogs[1] = new Dog(20);
       dogs[0].makeNoise();

       Dog maya = new Dog(12);
       Dog hugeGreg = new Dog(1500);
       Dog largerDog =Dog.maxDog(maya,hugeGreg);
       Dog largerDog2 = maya.maxDog(hugeGreg);

       largerDog.makeNoise();


    }
}

