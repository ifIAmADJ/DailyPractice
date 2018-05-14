#include <iostream>
#include <stdio.h>
#include <windows.h>

using namespace std;

int main()
{
	const int x = 26;
	char* p = new char[x];
	int i, num = 'a';

	//cout.setf(ios_base::fixed, ios_base::floatfield);(防止消除小数后数值)
	//int k = sizeof x /sizeof(int);(让编译器自己计算元素个数)
	//cout<<endl<<static_cast<bool>(x);(强制类型转换)
	for (i = 0; i <= 25; i++)
	{
		p[i] = num;
		num++;
		cout << p[i];
		Sleep(45);
	}
	cin.get();
	delete[]p;
	//int *p = (int *)malloc(sizeof(int)*x);
	return 0;
}