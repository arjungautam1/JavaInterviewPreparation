package verisk_interview_prepation;

import javax.swing.*;

//Program to count the number of vowels and consonants in String
public class VowelsConsonant {
    public static void main(String[] args) {
        int vowels=0,consonant=0;

        String text="arjun";
        for(int i=0;i<text.length();i++){
            char character=text.charAt(i);
            if(character=='a'|| character=='e' || character=='i' || character=='o' ||
            character=='u'
            )
                vowels=vowels+1;
            else 
                consonant=consonant+1;
        }
        System.out.println("Total Vowels ="+vowels);
        System.out.println("Total Consonants="+ consonant);
    }

}
