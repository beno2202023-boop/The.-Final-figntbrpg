package com.finalfightrpg;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

/**
 * Entry point for The Final Fight RPG
 */
public class Main {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("The Final Fight RPG");
        config.setWindowedMode(1280, 720);
        config.setForegroundFPS(60);
        
        new Lwjgl3Application(new TheRPGGame(), config);
    }
}