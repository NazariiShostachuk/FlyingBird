package com.mackgeeker.flybird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mackgeeker.flybird.FlyingBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlyingBird.WIDTH;
		config.height = FlyingBird.HEIGHT;
		config.title = FlyingBird.TITLE;
		new LwjglApplication(new FlyingBird(), config);
	}
}
