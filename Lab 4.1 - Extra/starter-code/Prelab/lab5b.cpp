// This is a a template program for you to test the pre-lab exercises in lab 5
#include<iostream>
#define SIZE 100
using namespace std;

int main()
{
	int a[SIZE];
	/// Write code to initialize an integer array, a, of 1000 elements 
	/// to {1, 2, 3, 4, 5, …, 1000} and to {1000, 999, 998, …. 1} 
	
	
	/// End of the code you write to initialize the array
	
	
	cout << "a[] = { ";
	for (int i = 0; i < SIZE; i++)
	{
		cout << a[i] << ", ";
		if( i % 10 == 0)
		{
			cout << endl<<"        ";
		}
	}
	cout << "} " << endl;
	return 0;
}