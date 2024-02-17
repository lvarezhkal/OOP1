public class Main {
    public static void main(String[] args) {

        Slytherin malfoy = new Slytherin("Draco", "Malfoy", 15, 12, 12,11, 12, 1, 99);
        Slytherin montague = new Slytherin("Graham", "Montague", 5, 10, 8, 22, 45, 45, 45);
        Slytherin goyle = new Slytherin("Gregory", "Goyle", 32, 1, 5, 7, 48, 55, 35);

        Ravenclaw chang = new Ravenclaw("Zhou", "Chang", 12, 22, 32, 9, 95, 65);
        Ravenclaw patil = new Ravenclaw("Padma", "Patil", 5, 8, 3, 3, 23, 79);
        Ravenclaw belby= new Ravenclaw("Marcus", "Belby", 23, 25, 11, 21, 1, 51);

        Hufflepuff smith = new Hufflepuff("Zachariah", "Smith", 11, 12, 5, 56, 65);
        Hufflepuff diggory = new Hufflepuff("Cedric", "Diggory", 15, 15, 15, 25, 23);
        Hufflepuff finchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 8, 15,  8, 55, 35);

        Gryffindor potter = new Gryffindor("Harri", "Potter", 16, 16, 16, 65, 56);
        Gryffindor granger = new Gryffindor("Hermione", "Granger", 11, 12,7, 25, 89);
        Gryffindor weasley = new Gryffindor("Ron", "Weasley", 12, 1, 5, 22, 33);

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.malfoy(malfoy);
        hogwarts.montague(montague);
        hogwarts.goyle(goyle);
        hogwarts.chang(chang);
        hogwarts.patil(patil);
        hogwarts.belby(belby);
        hogwarts.smith(smith);
        hogwarts.diggory(diggory);
        hogwarts.finchFletchley(finchFletchley);
        hogwarts.potter(potter);
        hogwarts.granger(granger);
        hogwarts.weasley(weasley);
        hogwarts.studentСomparisonGrifindor(granger, potter);
        hogwarts.studentСomparisonHufflepuff(diggory, finchFletchley);
        hogwarts.studentСomparisonRavenclaw(patil, belby);
        hogwarts.studentСomparisonSlytherin(goyle, malfoy);
        hogwarts.studentСomparison(chang, weasley);
    }
}