#include <iostream>
#include <stdio.h>
#include <windows.h>

using namespace std;

int main()
{
	const int x = 26;
	char* p = new char[x];
	int i, num = 'a';

	//cout.setf(ios_base::fixed, ios_base::floatfield);(��ֹ����С������ֵ)
	//int k = sizeof x /sizeof(int);(�ñ������Լ�����Ԫ�ظ���)
	//cout<<endl<<static_cast<bool>(x);(ǿ������ת��)
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