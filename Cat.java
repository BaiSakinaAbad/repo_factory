public class Cat implements Pet {
   private int noOfLives;

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    public int getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
}
