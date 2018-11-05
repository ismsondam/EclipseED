package org.institutoserpis.ed;

public class Vector {
	public static void main(String[] args)
	{
		int[] v = new int[] { 16, 12, 15, 14, 17 };
		
		sort(v);
		
		for (int i = 0; i < v.length; ++i)
			System.out.println(v[i]);
	}
	
	// Encuentra la posición del valor x
	public static int indexOf(int[] v, int x)
	{
		for (int i = 0; i < v.length; ++i)
			if (x == v[i])
				return i;
		
		return -1;
	}
	
	// Encuentra el número más pequeño
	public static int min(int[] v)
	{
		int min = v[0];
		for (int i = 1; i < v.length; ++i)
			if (v[i] < min)
				min = v[i];
		
		return min;
	}
	
	// Encuentra la posición del número más pequeño
	public static int indexOfMin(int[] v)
	{
		int minNum = v[0];
		int indexMin = 0;
		
		for (int i = 1; i < v.length; ++i)
		{
			if (v[i] < minNum)
			{
				minNum = v[0];
				indexMin = i;
			}
		}
		
		return indexMin;
	}
	
	public static void sort(int[] v)
	{
		int n = v.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (v[i] > v[k]) {
                	int temp;
                    temp = v[i];
                    v[i] = v[k];
                    v[k] = temp;
                }
            }
        }
	}
}
