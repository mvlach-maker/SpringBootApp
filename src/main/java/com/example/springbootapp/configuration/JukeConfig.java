package com.example.springbootapp.configuration;

import com.example.springbootapp.entities.Jukebox;
import com.example.springbootapp.repos.JukeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.net.URL;
import java.util.List;

@Configuration
public class JukeConfig {

    @Bean
    CommandLineRunner commandLineRunner(JukeRepository jukeRepository) throws IOException {

        copyUrlToFiles();

        return args -> {
            Jukebox fusion = new Jukebox
                    ("123","fusion");
            Jukebox angelina = new Jukebox("456", "angelina");
            jukeRepository.saveAll(List.of(fusion, angelina));
        };
    }

    static void copyUrlToFiles() throws IOException {
        // Copy text from URL to json file for Jukeboxes
        URL jukesURL;
        jukesURL = new URL("http://my-json-server.typicode.com/touchtunes/tech-assignment/jukes");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        jukesURL.openStream()));

        File jukeboxList = new File("/Users/marina/eclipse-workspace/SpringBootApp/src/main/resources/json/jukeboxes.json");

        if (jukeboxList.createNewFile()) {
            System.out.println("File created: " + jukeboxList.getName());
        } else {
            System.out.println("File already exists.");
        }

        String inputLine;
        FileWriter myWriter = new FileWriter(jukeboxList);

        while ((inputLine = in.readLine()) != null)
            try {
                myWriter.write(inputLine + "\n");

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        in.close();
        myWriter.close();

        // Copy text from URL to json file for Settings
        URL settingsURL;
        settingsURL = new URL("http://my-json-server.typicode.com/touchtunes/tech-assignment/settings");
        BufferedReader input = new BufferedReader(
                new InputStreamReader(
                        settingsURL.openStream()));

        File settingsList = new File("/Users/marina/eclipse-workspace/SpringBootApp/src/main/resources/json/settings.json");

        if (settingsList.createNewFile()) {
            System.out.println("File created: " + settingsList.getName());
        } else {
            System.out.println("File already exists.");
        }

        String inputString;
        FileWriter myFileWriter = new FileWriter(settingsList);

        while ((inputString = input.readLine()) != null)
            try {
                myFileWriter.write(inputString + "\n");

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        input.close();
        myFileWriter.close();
    }
}
