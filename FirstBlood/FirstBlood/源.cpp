#define WIN32_LEAN_AND_MEAN

#include<windows.h>
#include<windowsx.h>

int WINAPI WinMain(HINSTANCE hinstance,
	HINSTANCE hprevinstance,//h for Windows object
	LPSTR lpcmdline,//lp for 32 long pointer
	int ncmdshow)// n for short
{
	MessageBox(NULL,"Freakin The First Program!", "Freakin Program!", MB_OK | MB_ICONEXCLAMATION);
	return (0);
}
//�˴��ǵ������ַ�����ʹ�ö��ֽ��ַ����� �Լ�ϵͳ����WINDOWS���ڣ�