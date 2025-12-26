public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaris";

    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    public void makeNoise() {
            if (weightInPounds >  20){
                System.out.println("222222arooool");
            } else if (weightInPounds < 10){
                System.out.println("bark");
            } else{
                System.out.println("yapyap");
            }
    }

    public static Dog maxDog(Dog a,Dog b){
        if(a.weightInPounds >= b.weightInPounds){
            return a;
        } else {
            return b;
        }
    }

    public Dog maxDog(Dog a){
        if(this.weightInPounds > a.weightInPounds){
            return this;
        } else {
            return a;
        }
    }
}


