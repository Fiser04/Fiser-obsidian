package com.mycompany;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        String inputSoubor = "input.txt";
        String outputSoubor = "output.txt";
        String obsahSouboru = "";
        try (
            BufferedReader br = new BufferedReader(new FileReader(inputSoubor))
        ) {
            String line = "";
            while ((line = br.readLine()) != null) {
                obsahSouboru = line + "\n" + obsahSouboru;
            }
        } catch (FileNotFoundException fl) {
            System.out.println("file not found");
        } catch (IOException io) {
            System.out.println("io");
        } catch (Exception e) {
            System.out.println("neco jinyho");
        }
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputSoubor))
        ) {
            bw.write(obsahSouboru);
        } catch (FileNotFoundException fl) {
            System.out.println("file not found");
        } catch (IOException io) {
            System.out.println("io");
        } catch (Exception e) {
            System.out.println("neco jinyho");
        }
    }
}
