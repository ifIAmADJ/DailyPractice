// TextProgram2.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
void printn(int n);
using namespace std;
int main()
{
	
	int num;
	cout << "Enter the num ,you will get twice of it" << endl << endl << endl;
	cin >> num;
	num +=num;
	printn(num);
    return 0;
}

void printn(int n)
{
	cout  << "so,you got twice of " << n << " now" << endl << endl << endl;
}