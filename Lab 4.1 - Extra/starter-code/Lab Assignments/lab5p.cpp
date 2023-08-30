// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Value of the Polynomial

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of eval function
double eval(double x, int a[], int len) 
// End of function declaration

int main()
{

	cout << "Output of eval function:" <<endl;
	cout << "x = 1.0, a = {0, 1, 2, 3, 4} : eval = " << eval(1.0, {0, 1, 2, 3, 4}, 5) << endl;
	cout << "x = 2.0, a = {3, 2, 1} : eval = " << eval(2.0, {3, 2, 1}, 3) << endl;
	cout << "x = 3.0, a = {3, -2, -1} : eval = " << eval(3.0, {3, -2, -1}, 3) << endl;
	cout << "x = -3.0, a = {3, 2, 1} : eval = " << eval(-3.0, {3, 2, 1}, 3) << endl;
	cout << "x = 2.0, a = {3, 2} : eval = " << eval(2.0, {3, 2}, 2) << endl;
	cout << "x = 2.0, a = {4, 0, 9} : eval = " << eval(2.0, {4, 0, 9}, 3) << endl;
	cout << "x = 2.0, a = {10} : eval = " << eval(2.0, {10}, 1) << endl;
	cout << "x = 10.0, a = {0, 1} : eval = " << eval(10.0, {0, 1}, 2) << endl;
	
	return 0;
}

// Definition eval function
double eval(double x, int a[], int len) 
{
	double returnValue;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 