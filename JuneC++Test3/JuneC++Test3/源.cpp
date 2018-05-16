#include <iostream>
#include <windows.h>
#include <conio.h>

using namespace std;

int main()
{
	int ch;
	int count = 0;
	while ((ch=cin.get())!=EOF)
	{
		cout.put(char(ch));
		++count;
	}
	cout <<endl<<count<<"characters read\n";
	system("pause");

	int i;
	for (i = 0; i<10; i++) {
		printf("\r(.)(.)");
		Sleep(300);
		printf("\r(o)(o)");
		Sleep(300);
	}
	printf("\r      ");
	return 0;
}