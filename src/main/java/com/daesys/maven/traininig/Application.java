package com.daesys.maven.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public int countWord(String words){
    
        int nbWords = 0;
        String[] wordSeparated = StringUtils.split(words,' ');
        nbWords = (wordSeparated == null) ? 0 : wordSeparated.length;
        return nbWords;
   
    }
    
    
    public void greet(){
    
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        
        for (String greeting : greetings) {
            System.out.println("Greetings " + greeting);
        }
    
    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int count =  app.countWord("I have four words");
        System.out.println("Count: " + count);
    }
}
