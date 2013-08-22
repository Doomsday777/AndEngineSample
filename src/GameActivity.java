import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

public class GameActivity extends BaseGameActivity {

	@Override
	public EngineOptions onCreateEngineOptions() {
		return null;
	}

	@Override
	public void onCreateResources( OnCreateResourcesCallback pOnCreateResourcesCallback ) throws Exception {
		pOnCreateResourcesCallback.onCreateResourcesFinished();
	}

	@Override
	public void onCreateScene( OnCreateSceneCallback pOnCreateSceneCallback ) throws Exception {
		Scene oScene = new Scene(); 
		pOnCreateSceneCallback.onCreateSceneFinished( oScene );
	}

	@Override
	public void onPopulateScene( Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback ) throws Exception {
		pOnPopulateSceneCallback.onPopulateSceneFinished();
	}
	
}
