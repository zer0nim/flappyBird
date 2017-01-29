package fr.emarin.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.emarin.MyFlappyBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		config.width = MyFlappyBird.WIDTH;
		config.height = MyFlappyBird.HEIGHT;
		config.title = MyFlappyBird.TITLE;








		new LwjglApplication(new MyFlappyBird(), config);
	}
}
