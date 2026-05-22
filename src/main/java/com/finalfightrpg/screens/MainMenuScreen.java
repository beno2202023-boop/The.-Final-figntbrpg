package com.finalfightrpg.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.Input;
import com.finalfightrpg.TheRPGGame;

/**
 * Main menu screen placeholder
 */
public class MainMenuScreen implements Screen {
    private final TheRPGGame game;
    private BitmapFont font;

    public MainMenuScreen(TheRPGGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        font = new BitmapFont();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
        font.draw(game.batch, "The Final Fight RPG", 100, 700);
        font.draw(game.batch, "Press any key to continue...", 100, 650);
        game.batch.end();

        if (Gdx.input.justTouched() || Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
            // TODO: Load game screen
        }
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {
        font.dispose();
    }
}