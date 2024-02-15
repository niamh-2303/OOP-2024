package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c - b;
		float r2 = e -d;

		float howFar = a-b;

		return d + (howFar / r1 )+ r2;
	}


	public void settings()
	{
		size(500, 500);

		String[] m1 =months;
		months[0] = "XXX";
		print(m1[0]);
		for(int i = 0; i < months.length; i++)
		{
			println("Month: " + months[i] + "\t");
		}
		for(String s : m1)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] < rainfall[minIndex])
			{
				minIndex = i;
			}
		}

		int maxIndex = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] > rainfall[maxIndex])
			{
				maxIndex = i;
			}
		}


		println("month with min rainfall was " + months[minIndex]);
		println("month with max rainfall was " + months[maxIndex]);

		float tot = 0;
		for(float f :rainfall)
		{
			tot += f;
		}

		float avg = tot / (float) rainfall.length;
		println("Average rainfall: " + avg + "mm");

		//a b-c d-e 
		println(map1(5, 0, 10, 0, 100));
		//50

		println(map1(25, 20, 30, 200, 300));
		//250

		println(map1(26, 25, 35, 0, 100));
		//10




	
		}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
		background(0);
		float w = width / (float)months.length;
		for(int i =0; i < months.length; i++)
		{
			float x = map1(i, 0, months.length, width);
			rect(x, height, w, -rainfall[i]);
		}
	}
}
