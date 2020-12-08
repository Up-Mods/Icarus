// From CameraOverhaul, licensed under MIT.

package com.camscorner.icarus.core.callbacks;

import com.camscorner.icarus.core.events.Event;
import com.camscorner.icarus.core.events.EventHelper;
import com.camscorner.icarus.core.util.Transform;
import net.minecraft.client.render.Camera;

public interface CameraUpdateCallback
{
	Event<CameraUpdateCallback> EVENT = EventHelper.createEvent(CameraUpdateCallback.class,
			(listeners) -> (camera, transform, deltaTime) ->
			{
				for(CameraUpdateCallback listener : listeners)
				{
					transform = listener.onCameraUpdate(camera, transform, deltaTime);
				}

				return transform;
			}
	);

	Transform onCameraUpdate(Camera camera, Transform cameraTransform, float deltaTime);
}
