package com.example.jungletimers;

import java.util.Timer;
import java.util.TimerTask;

import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity
{
//JungleTimer jtimer = new JungleTimer();
	TextView GR, GB, LR, LB, DR, BA;
	ImageButton GRback, GBback, LRback, LBback, DRback, BAback; //Backgrounds
	int normalColor = Color.WHITE; //Normal background color to reset to
	Timer[] timer = new Timer[6];
	boolean reset[] = {true, true, true, true, true, true};
	boolean running[] = {false, false, false, false, false, false};
	private int[] TimeLeft = new int[6];
	
	Uri notification;
	Ringtone ringtone;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GR = (TextView) findViewById(R.id.textView1);
		LR = (TextView) findViewById(R.id.textView2);
		GB = (TextView) findViewById(R.id.textView3);
		LB = (TextView) findViewById(R.id.textView4);
		DR = (TextView) findViewById(R.id.textView5);
		BA = (TextView) findViewById(R.id.textView6);
		
		GRback = (ImageButton) findViewById(R.id.imageButton1);
		LRback = (ImageButton) findViewById(R.id.imageButton2);
		GBback = (ImageButton) findViewById(R.id.ImageButton3);
		LBback = (ImageButton) findViewById(R.id.ImageButton4);
		DRback = (ImageButton) findViewById(R.id.ImageButton5);
		BAback = (ImageButton) findViewById(R.id.ImageButton6);
		
		notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		ringtone = RingtoneManager.getRingtone(getApplicationContext(), notification);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	
	//
	//All the timer methods
	//
	private void TimerMethod0(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[0] <= 0){
					GR.setText("Alive");
					running[0] = false;
					timer[0].cancel();
					timer[0].purge();
					GRback.setBackgroundColor(normalColor);
				}else if(TimeLeft[0]>0){
					if(TimeLeft[0]==30000){
						ringtone.play();
						GRback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[0]==10000){
						GRback.setBackgroundColor(Color.RED);
					}
					GR.setText("" + TimeLeft[0]/60000 + ":" + String.format("%02d", (TimeLeft[0]/1000)%60));
					TimeLeft[0]-= 1000;
				}
				
			}
		});
	}
	private void TimerMethod1(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[1] <= 0){
					LR.setText("Alive");
					running[1] = false;
					timer[1].cancel();
					timer[1].purge();
					LRback.setBackgroundColor(normalColor);
				}
				else if(TimeLeft[1]>0){
					if(TimeLeft[1]==30000){
						ringtone.play();
						LRback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[1]==10000){
						LRback.setBackgroundColor(Color.RED);
					}
					LR.setText("" + TimeLeft[1]/60000 + ":" + String.format("%02d", (TimeLeft[1]/1000)%60));
					TimeLeft[1]-= 1000;
				}
				
			}
		});
	}
	private void TimerMethod2(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[2] <= 0){
					GB.setText("Alive");
					running[2] = false;
					timer[2].cancel();
					timer[2].purge();
					GBback.setBackgroundColor(normalColor);
				}
				else if(TimeLeft[2]>0){
					if(TimeLeft[2]==30000){
						ringtone.play();
						GBback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[2]==10000){
						GBback.setBackgroundColor(Color.RED);
					}
					GB.setText("" + TimeLeft[2]/60000 + ":" + String.format("%02d", (TimeLeft[2]/1000)%60));
					TimeLeft[2]-= 1000;
				}
				
			}
		});
	}
	private void TimerMethod3(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[3] <= 0){
					LB.setText("Alive");
					running[3] = false;
					timer[3].cancel();
					timer[3].purge();
					LBback.setBackgroundColor(normalColor);
				}
				else if(TimeLeft[3]>0){
					if(TimeLeft[3]==30000){
						ringtone.play();
						LBback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[3]==10000){
						LBback.setBackgroundColor(Color.RED);
					}
					LB.setText("" + TimeLeft[3]/60000 + ":" + String.format("%02d", (TimeLeft[3]/1000)%60));
					TimeLeft[3]-= 1000;
				}
				
			}
		});
	}
	private void TimerMethod4(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[4] <= 0){
					DR.setText("Alive");
					running[4] = false;
					timer[4].cancel();
					timer[4].purge();
					DRback.setBackgroundColor(normalColor);
				}
				else if(TimeLeft[4]>0){
					if(TimeLeft[4]==30000){
						ringtone.play();
						DRback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[4]==10000){
						DRback.setBackgroundColor(Color.RED);
					}
					DR.setText("" + TimeLeft[4]/60000 + ":" + String.format("%02d", (TimeLeft[4]/1000)%60));
					TimeLeft[4]-= 1000;
				}
				
			}
		});
	}
	private void TimerMethod5(){
		runOnUiThread(new Runnable(){
			public void run(){
				if(TimeLeft[5] <= 0){
					BA.setText("Alive");
					running[5] = false;
					timer[5].cancel();
					timer[5].purge();
					BAback.setBackgroundColor(normalColor);
				}
				else if(TimeLeft[5]>0){
					if(TimeLeft[5]==60000){
						BAback.setBackgroundColor(Color.LTGRAY);
					}else if(TimeLeft[5]==30000){
						ringtone.play();
						BAback.setBackgroundColor(Color.YELLOW);
					} else if(TimeLeft[5]==10000){
						BAback.setBackgroundColor(Color.RED);
					}
					BA.setText("" + TimeLeft[5]/60000 + ":" + String.format("%02d", (TimeLeft[5]/1000)%60));
					TimeLeft[5]-= 1000;
				}
				
			}
		});
	}
	
	//
	//Called when each of these buttons is clicked
	//
	public void RedGolem(View view){
		TimeLeft[0] = 300000;
		if(!running[0]){
			running[0] = true;
			timer[0] = new Timer();
			timer[0].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod0();
				}
			},0 ,1000);
		} else {
			timer[0].cancel();
			timer[0].purge();
			GRback.setBackgroundColor(normalColor);
			GR.setText("Canceled");
			running[0] = false;
		}		
	}

	public void RedLizard(View view){
		TimeLeft[1] = 300000;
		if(!running[1]){
			running[1] = true;
			timer[1] = new Timer();
			timer[1].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod1();
				}
			},0 ,1000);
		} else {
			timer[1].cancel();
			timer[1].purge();
			LRback.setBackgroundColor(normalColor);
			LR.setText("Canceled");
			running[1] = false;
		}
	}
	
	public void BlueGolem(View view){
		TimeLeft[2] = 300000;
		if(!running[2]){
			running[2] = true;
			timer[2] = new Timer();
			timer[2].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod2();
				}
			},0 ,1000);
		} else {
			timer[2].cancel();
			timer[2].purge();
			GBback.setBackgroundColor(normalColor);
			GB.setText("Canceled");
			running[2] = false;
		}		
	}
	public void BlueLizard(View view){
		TimeLeft[3] = 300000;
		if(!running[3]){
			running[3] = true;
			timer[3] = new Timer();
			timer[3].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod3();
				}
			},0 ,1000);
		} else {
			timer[3].cancel();
			timer[3].purge();
			LBback.setBackgroundColor(normalColor);
			LB.setText("Canceled");
			running[3] = false;
		}
		
	}
	public void Dragon(View view){
		TimeLeft[4] = 360000;
		if(!running[4]){
			running[4] = true;
			timer[4] = new Timer();
			timer[4].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod4();
				}
			},0 ,1000);
		} else {
			timer[4].cancel();
			timer[4].purge();
			DRback.setBackgroundColor(normalColor);
			DR.setText("Canceled");
			running[4] = false;
		}
		
	}
	public void Baron(View view){
		TimeLeft[5] = 420000;
		if(!running[5]){
			running[5] = true;
			timer[5] = new Timer();
			timer[5].schedule(new TimerTask() {
				@Override
				public void run(){
					TimerMethod5();
				}
			},0 ,1000);
		} else {
			timer[5].cancel();
			timer[5].purge();
			BAback.setBackgroundColor(normalColor);
			BA.setText("Canceled");
			running[5] = false;
		}		
	}
}
