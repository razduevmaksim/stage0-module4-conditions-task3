package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 'A' && character <= 'z') {
            char lowCharacter = Character.toLowerCase(character);

            if (lowCharacter == 'a' || lowCharacter == 'e' || lowCharacter == 'u' || lowCharacter == 'o' || lowCharacter == 'i')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
    }
}
