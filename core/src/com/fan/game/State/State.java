package com.fan.game.State;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {

    protected OrthographicCamera cam;

protected GameStateManager gam;
    protected Vector3 mouse;




    protected  State(GameStateManager gam){

        this.gam = gam;
cam = new OrthographicCamera();

mouse = new Vector3();


    }


    protected abstract void handleInput();


    protected  abstract void update(float dt);

    public abstract void render(SpriteBatch sb);
    public abstract void dispose();


}
