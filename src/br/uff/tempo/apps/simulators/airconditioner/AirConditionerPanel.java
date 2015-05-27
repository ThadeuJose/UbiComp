package br.uff.tempo.apps.simulators.airconditioner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;
import br.uff.tempo.R;
import br.uff.tempo.apps.simulators.AbstractPanel;
import br.uff.tempo.middleware.management.interfaces.IResourceAgent;
import br.uff.tempo.middleware.resources.interfaces.IAirConditioner;

public class AirConditionerPanel extends AbstractPanel {
	
	private final String TAG = "Panel-AirConditionerView";

	private boolean ligado = false;

	
	private IAirConditioner agent;
	private Bitmap mBitmap;

	private int pointX;
	private int pointY;

	public AirConditionerPanel(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialization() {
		mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.airconditioner);

		// This will calculate the bitmap (x,y) coordinate, when its center is
		// on screen center
		pointX = getScreenCenterX() - mBitmap.getWidth() / 2;
		pointY = getScreenCenterY() - mBitmap.getHeight() / 2;		
	}

	@Override
	public void setAgent(IResourceAgent agent) {
		this.agent = (IAirConditioner) agent;
		
	}

	@Override
	public IResourceAgent getAgent() {
		return this.agent;
	}

	@Override
	public void touch(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			//TODO verifcar semântica do código
			// get the touch coordinates
			int x = (int) event.getX(); 
			int y = (int) event.getY();

			ligado = !ligado;

			Log.d(TAG, "X = " + x + " and Y = " + y);

			String msg;

			if (ligado) {
				msg = "The airconditioner is on";
				agent.liga();
			} else {
				msg = "The airconditioner is off";
				agent.desliga();
			}

			Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
			invalidate();
		}

		
	}

	@Override
	public void drawCanvas(Canvas canvas) {
		// draw the background color
		canvas.drawColor(Color.BLACK);
		// draw the bed bitmap
		canvas.drawBitmap(mBitmap, pointX, pointY, null);
		
	}

	@Override
	public void onUpdate(String method, Object value) {
		// TODO Auto-generated method stub
		
	}

}
