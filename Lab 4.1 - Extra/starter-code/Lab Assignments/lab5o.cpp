// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Cumulative Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isCumulative function
int isCumulative(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isCumulative function:" <<endl;
	cout << "{1} : " << 1 == isCumulative({1}, 1) ? "Yes": "No"<<endl;
	cout << "{0,0,0,0,0,0} : " << 1 == isCumulative({0,0,0,0,0,0}, 6) ? "Yes": "No" <<endl;
	cout << "{1, 1, 1, 1, 1, 1} : " << 1 == isCumulative({1, 1, 1, 1, 1, 1}, 6)  ? "Yes": "No" <<endl;
	cout << "{3, 3, 6, 12, 24} : " << 1 == isCumulative({3, 3, 6, 12, 24}, 5)  ? "Yes": "No" <<endl;
	cout << "{-3, -3, -6, -12, -24} : " << 1 == isCumulative({-3, -3, -6, -12, -24}, 5)  ? "Yes": "No" <<endl;
	cout << "{-3, -3, 6, 12, 24} : " << 1 == isCumulative({-3, -3, 6, 12, 24}, 5)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isCumulative function
int isCumulative(int a[ ], int len)
{
	int returnValue = 1;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 