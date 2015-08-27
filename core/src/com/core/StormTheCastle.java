package com.core;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Storm The Castle main game file. <br>
 * 
 * Guidelines for contributing on this project: <br>
 * 	- Format everything as neatly as possible! <br>
 * 	- In every new file add author and since annotations. <br>
 * 	- Keep date format as YYYY-MM-DD <br>
 * 	- Be as specific as you can when writing a commit message. <br>
 * 	- Also document everything that you can! This will make development so much smoother! <br>
 * 	- Use Git Hub for stuff like bug reports and similar issues. <br>
 * 
 * @author Pontus Wirsching
 * @since 2015-08-26
 *
 */
public class StormTheCastle implements ApplicationListener {

	@Override
	public void create() {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}
	
	
	
}
