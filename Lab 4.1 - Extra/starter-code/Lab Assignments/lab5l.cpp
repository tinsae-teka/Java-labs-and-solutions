// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Flip-flop Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isFlipFlop function
int isFlipFlop(int a[ ], int len)
// End of function declaration

int main()
{

	cout << "Output of isFlipFlop function:" <<endl;
	cout << "{0, 3, 4, -7} : " << 1 == isFlipFlop({0, 3, 4, -7}, 4) ? "Yes": "No"<<endl;
	cout << "{1, 2, 3, 4} : " << 1 == isFlipFlop({1, 2, 3, 4} , 4) ? "Yes": "No" <<endl;
	cout << "{2, 2, 3, 4} : " << 1 == isFlipFlop({2, 2, 3, 4},  4)  ? "Yes": "No" <<endl;
	cout << "{1, 2, 3, 3, 4} : " << 1 == isFlipFlop({1, 2, 3, 3, 4}, 5)  ? "Yes": "No" <<endl;
	cout << "{2} : " << 1 == isFlipFlop({2}, 1)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isFlipFlop function
int isFlipFlop(int a[ ], int len)
{
	int returnValue;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 