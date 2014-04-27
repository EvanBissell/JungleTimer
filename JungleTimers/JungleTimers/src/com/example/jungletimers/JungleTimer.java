/*package com.example.jungletimers;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.widget.Button;

public class JungleTimer extends Activity
{
	private static final int GolemRed = 0;
	private static final int GolemBlue = 1;
	private static final int LizardRed = 2;
	private static final int LizardBlue = 3;
	private static final int Dragon = 4;
	private static final int Baron = 5;

	
	private static final String[] AliveString = {"Red Golem", "Blue Golem", "Red Lizard", "Blue Lizard", "Dragon", "Baron"};
	
	
	private static final int[] RespawnTime = { 5*60, 5*60, 5*60, 5*60, 6 * 60, 7 * 60 };
	protected String[] DisplayString = new String[6];
	
	private int[] TimeLeft = new int[6];
	
	
	private TimerTask tick;
	
	private Timer timer = new Timer();
	
	public JungleTimer()
	{		
		tick = new TimerTask()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < 6; i++)
				{
					if (TimeLeft[i] > 0)
					{						
						DisplayString[i] = (AliveString[i] + " \n" + TimeLeft[i] / 60 + ":" + TimeLeft[i] % 60);
						//
						TimeLeft[i]--;
						
						for (int j = 0; j < 6; j++)
						{
							if((TimeLeft[j] == 14) || (TimeLeft[j] == 59))
							{
								//
								
					
										
							}
						}
					}
					else
					{
						DisplayString[i] = AliveString[i];
						//
					}
				}
			}
		};
	}	
		//Third argumment is repeat rate in ms - i.e. 1s

	
			public void GolemRed()
			{
				timer.scheduleAtFixedRate(tick, 0, 1000);
				TimeLeft[GolemRed] = RespawnTime[GolemRed];
				DisplayString[GolemRed] = (TimeLeft[GolemRed] / 60 + ":" + TimeLeft[GolemRed] % 60);
			
				
				
			}
		
			public void GolemBlue()
			{
				
				TimeLeft[GolemBlue] = RespawnTime[GolemBlue];
				DisplayString[GolemBlue] = (TimeLeft[GolemBlue] / 60 + ":" + TimeLeft[GolemBlue] % 60);
				
			}
		
			public String LizardRed()
			{
				TimeLeft[LizardRed] = RespawnTime[LizardRed];
				DisplayString[LizardRed] = (TimeLeft[LizardRed] / 60 + ":" + TimeLeft[LizardRed] % 60);
				return DisplayString[LizardRed];
			}
		
		
			public String LizardBlue()
			{
				TimeLeft[LizardBlue] = RespawnTime[LizardBlue];
				DisplayString[LizardBlue] = String.format(TimeLeft[LizardBlue] / 60 + ":" + TimeLeft[LizardBlue] % 60);
				return DisplayString[LizardBlue];
			}

		
			public String Dragon()
			{
				TimeLeft[Dragon] = RespawnTime[Dragon];
				DisplayString[Dragon] = (TimeLeft[Dragon] / 60 + ":" + TimeLeft[Dragon] % 60);
				return DisplayString[Dragon];
			}
		
			public String Baron()
			{
				TimeLeft[Baron] = RespawnTime[Baron];
				DisplayString[Baron] = (TimeLeft[Baron] / 60 + ":" + TimeLeft[Baron] % 60);
				return DisplayString[Baron];
			}
			public static void main(String[] args){}
	

}
*/