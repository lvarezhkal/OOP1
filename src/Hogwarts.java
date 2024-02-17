public class Hogwarts {
    public void malfoy(Slytherin malfoy) {
        System.out.println(malfoy);
    }

    public void montague(Slytherin montague) {
        System.out.println(montague);
    }

    public void goyle(Slytherin goyle) {
        System.out.println(goyle);
    }

    public void chang(Ravenclaw chang) {
        System.out.println(chang);
    }

    public void patil(Ravenclaw patil) {
        System.out.println(patil);
    }

    public void belby(Ravenclaw belby) {
        System.out.println(belby);
    }

    public void smith(Hufflepuff smith) {
        System.out.println(smith);
    }

    public void diggory(Hufflepuff diggory) {
        System.out.println(diggory);
    }

    public void finchFletchley(Hufflepuff finchFletchley) {
        System.out.println(finchFletchley);
    }

    public void potter(Gryffindor potter) {
        System.out.println(potter);
    }

    public void granger(Gryffindor granger) {
        System.out.println(granger);
    }

    public void weasley(Gryffindor weasley) {
        System.out.println(weasley);
    }

    public void studentСomparisonGrifindor (Gryffindor first, Gryffindor second) {
        int firstSum = first.getHonor() + first.getCourage() + first.getNobility();
        int secondSum = second.getHonor() + second.getCourage() + second.getNobility();
        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше в Грифиндоре, чем " + second.getName());
        }else if (firstSum < secondSum){
            System.out.println(second.getName() + " лучше в Грифиндоре, чем " + first.getName());
        }else{
            System.out.println(first.getName() + " и " + second.getName() + " равны");
        }
    }
    public void studentСomparisonHufflepuff (Hufflepuff first, Hufflepuff second) {
        int firstSum = first.getHonesty() + first.getLoyalty() + first.getHardWork();
        int secondSum = second.getHonesty() + second.getLoyalty() + second.getHardWork();
        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше в Пуффиндоре, чем " + second.getName());
        }else if (firstSum < secondSum){
            System.out.println(second.getName() + " лучше в Пуффиндоре, чем " + first.getName());
        }else{
            System.out.println(first.getName() + " и " + second.getName() + " равны");
        }
    }
    public void studentСomparisonRavenclaw (Ravenclaw first, Ravenclaw second) {
        int firstSum = first.getCreative() + first.getWitty() + first.getWise() + first.getSmart();
        int secondSum = second.getCreative() + second.getWitty() + second.getWise() + second.getSmart();
        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше в Когтевране, чем " + second.getName());
        }else if (firstSum < secondSum){
            System.out.println(second.getName() + " лучше в Когтевране, чем " + first.getName());
        }else{
            System.out.println(first.getName() + " и " + second.getName() + " равны");
        }
    }
    public void studentСomparisonSlytherin (Slytherin first, Slytherin second) {
        int firstSum = first.getAmbition() + first.getThirstForPower() + first.getResourcefulness() + first.getCunning() + first.getDetermination();
        int secondSum = second.getAmbition() + second.getThirstForPower() + second.getResourcefulness() + second.getCunning() + second.getDetermination();
        if (firstSum > secondSum){
            System.out.println(first.getName() + " лучше в Слизерине, чем " + second.getName());
        }else if (firstSum < secondSum){
            System.out.println(second.getName() + " лучше в Слизерине, чем " + first.getName());
        }else{
            System.out.println(first.getName() + " и " + second.getName() + " равны");
        }
    }


    public void studentСomparison(HogwartsStudents first, HogwartsStudents second) {
        if (first.getPowerOfMagic() > second.getPowerOfMagic()) {
            System.out.println("Cтудент " + first.getName() + " сильнее чем " + second.getName());
        } else if (first.getPowerOfMagic() < second.getPowerOfMagic()) {
            System.out.println("Cтудент " + second.getName() + " сильнее чем " + first.getName());
        } else {
            System.out.println("Cтудент " + first.getName() + " и " + second.getName() + " равны по силе");
        }
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println("Cтудент " + first.getName() + " трангрессирует дальше чем " + second.getName());
        } else if (first.getTransgressionDistance() < second.getTransgressionDistance()) {
            System.out.println("Cтудент " + second.getName() + " трангрессирует дальше чем " + first.getName());
        } else {
            System.out.println("Cтудент " + first.getName() + " и " + second.getName() + " трангрессируют одинаково");
        }
    }
}


