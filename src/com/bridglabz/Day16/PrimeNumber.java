package com.bridglabz.Day16;

public class PrimeNumber {
	public void findPrime(int n)
	{
		System.out.println("Prime numbers from 0 to "+ n +" are ");
		int s = 2;
		while(s <= n)
		{
			boolean prime = true;
			for(int i=2;i<=s/2;i++)
			{
				if(s%i == 0) {
					prime = false;
					break;
				}
			}
			
			if(prime)
			{
				Anagram an = new Anagram();
				an.isAnagram(, null);
			}
			s++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber pm = new PrimeNumber();
		pm.findPrime(1000);
	}

}

