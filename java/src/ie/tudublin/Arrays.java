package ie.tudublin;

import processing.core.PApplet;



public class Arrays extends PApplet
{
<<<<<<< HEAD
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
=======
	String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public float map1(float a, float b, float c, float d, float e)
	{
<<<<<<< HEAD
		float r1 = c - b;
		float r2 = e -d;

		float howFar = a-b;

		return d + (howFar / r1 )+ r2;
	}

=======
		float r1 = c -b;
		float r2 = e - d;

		float howFar = a - b;
		return d + (howFar / r1) * r2;
	}

	void randomize()
	{
		for (int i = 0; i < rainfall.length; i++) {
			rainfall[i] = random(500);
		}
	}
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816

	public void settings()
	{
		size(500, 500);

<<<<<<< HEAD
		String[] m1 =months;
		months[0] = "XXX";
		print(m1[0]);
		for(int i = 0; i < months.length; i++)
		{
			println("Month: " + months[i] + "\t");
		}
		for(String s : m1)
		{
=======
		String[] m1 = months;
		months[0] = "XXX";
		print(m1[0]);
		for(int i = 0; i < months.length; i ++)
		{
			println("Month: " + months[i] + "\t" + rainfall[i]);
		}
		for (String s : m1) {
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816
			println(s);
		}

		int minIndex = 0;
<<<<<<< HEAD
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] < rainfall[minIndex])
=======
		for(int i= 0 ; i < rainfall.length ; i ++)
		{
			if (rainfall[i] < rainfall[minIndex])
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816
			{
				minIndex = i;
			}
		}
<<<<<<< HEAD

		int maxIndex = 0;
		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] > rainfall[maxIndex])
=======
		
		int maxIndex = 0;
		for(int i= 0 ; i < rainfall.length ; i ++)
		{
			if (rainfall[i] > rainfall[maxIndex])
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816
			{
				maxIndex = i;
			}
		}

<<<<<<< HEAD

		println("month with min rainfall was " + months[minIndex]);
		println("month with max rainfall was " + months[maxIndex]);

		float tot = 0;
		for(float f :rainfall)
=======
		println("The month with the minimum rainfall was " + months[minIndex] + " with " + rainfall[minIndex] + "rain");
		println("The month with the max rainfall was " + months[maxIndex] + " with " + rainfall[maxIndex] + "rain");
		
		
		float tot = 0;
		for(float f:rainfall)
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816
		{
			tot += f;
		}

		float avg = tot / (float) rainfall.length;
<<<<<<< HEAD
		println("Average rainfall: " + avg + "mm");

		//a b-c d-e 
		println(map1(5, 0, 10, 0, 100));
		//50

		println(map1(25, 20, 30, 200, 300));
		//250

		println(map1(26, 25, 35, 0, 100));
		//10




	
		}
=======

		// a b-c d-e;
		println(map1(5, 0, 10, 0, 100));
		// 50

		println(map1(25, 20, 30, 200, 300));
		// 250

		println(map1(26, 25, 35, 0, 100));
		// 10 


	}
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816

	public void setup() {
		colorMode(HSB);
		background(0);
		randomize();
		
		
	}

	
	public void draw()
	{	
<<<<<<< HEAD
		background(0);
		float w = width / (float)months.length;
		for(int i =0; i < months.length; i++)
		{
			float x = map1(i, 0, months.length, width);
=======

		background(0);
		float w = width / (float)months.length;
		for(int i = 0 ; i < months.length ;  i ++)
		{
			float x = map1(i, 0, months.length, 0, width);
>>>>>>> 2af1570ee2c65d4f62c233661c3acf77a8b4a816
			rect(x, height, w, -rainfall[i]);
		}
	}
}
