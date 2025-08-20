import java.util.Scanner;

public class Clinic{
public static void main (String [] args){

    Scanner sc = new Scanner(System.in);
    PetRecord petFile = new PetRecord();
    Pet pet;
    int choice = 0;

    while (choice != 3) {
    System.out.print("[1] Dog\n[2] Cat\n[3] Exit\nEnter the name of the file: ");
    choice = sc.nextInt();

        switch (choice) {
            case 1:
                pet = new Dog();
                petFile.setPetName("Bantay");
                petFile.setPetID("DO1");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepherd");
                System.out.println("\nPet Breed is " + ((Dog) pet).getBreed());
                System.out.println("Pet id is " + petFile.getPetID());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play() + "\n");
                break;
            case 2:
                pet = new Cat();
                petFile.setPetName("Muning");
                petFile.setPetID("CO1");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                System.out.println("\nNumber of Lives are " + ((Cat) pet).getNoOfLives());
                System.out.println("Pet id is " + petFile.getPetID());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play() + "\n");
                break;
            case 3:
                System.out.println("\nExiting...\nProgramer: Abad, Bai Sakina\n3BSCS-1");
                break;
            default:
                System.out.println("\nPlease enter a valid option!\n");
        };
    };
    };
};
