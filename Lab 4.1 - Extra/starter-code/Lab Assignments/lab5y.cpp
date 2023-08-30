// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Sum of Negative Values

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of negSum function
int negSum(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of negSum function:" <<endl;
	cout << "When the input is {1, 2, -1, 5} = " << negSum({1, 2, -1, 5}, 4) << endl;
	cout << "When the input is {1, -2, 4, -1} = " << negSum({1, -2, 4, -1}, 4) << endl;
	cout << "When the input is {5, -3, 4, -1, 1, 2} = " << negSum({5, 3, 4, -1, 1, 2}, 6) << endl;
	cout << "When the input is {-5, -2, -3, -1} = " << negSum({-5, -2, -3, -1}, 4) << endl;
	cout << "When the input is {3, 2, 3, 1} = " << negSum({3, 2, 3, 1}, 4) << endl;
	cout << "When the input is {193,-193} = " << negSum({193,-193}, 2) << endl;
	cout << "When the input is {-1} = " << negSum({-1}, 1) << endl;
	cout << "When the input is {3} = " << negSum({3}, 1) << endl;
	cout << "When the input is {0} = " << negSum({0}, 1) << endl;
	
	return 0;
}

// Definition negSum function
int negSum(int a[], int len)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 