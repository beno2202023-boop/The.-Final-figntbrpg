package com.mygame;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {
    private EntityManager entityManager;
    private CollisionSystem collisionSystem;
    private GameplayUI gameplayUI;

    @Override
    public void show() {
        // Initialize your player, enemy managers, and maps
        entityManager = new EntityManager();
        collisionSystem = new CollisionSystem();
        gameplayUI = new GameplayUI();
        
        // Spawn the player character
        entityManager.spawnPlayer(100, 150);
    }

    @Override
    public void render(float delta) {
        // 1. Clear the screen
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // 2. Update System (Process Input, Physics, and AI)
        entityManager.update(delta);
        collisionSystem.checkCollisions(entityManager.getEntities());

        // 3. Render System (Draw everything to screen)
        entityManager.draw();
        gameplayUI.draw();
    }

    @Override
    public void resize(int width, int height) {
        // Handle viewport adjustments
    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        entityManager.dispose();
        gameplayUI.dispose();
    }
}
