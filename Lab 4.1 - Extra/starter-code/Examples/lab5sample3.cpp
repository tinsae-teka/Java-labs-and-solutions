#include <iostream>

using namespace std;

const NO_OF_ROWS = 3;
const NO_OF_COLS = 4;

//declares a new data type which is a 2 dimensional array of floats
typedef float ProfitType[NO_OF_ROWS][NO_OF_COLS];

int main()
{
	ProfitType profit; // defines profit as a 2 dimensional array
	for (int row_pos = 0; row_pos < NO_OF_ROWS; row_pos++)
	{
		for (int col_pos = 0; col_pos < NO_OF_COLS; col_pos++)
		{
			cout << "Please input a profit" << endl;
			cin >> profit[row_pos][col_pos];
		}
	}
	
	return 0;
}