#include<iostream>
#include"stock00.h"

int main()
{
	Stock fluff_thr_cat;
	fluff_thr_cat.acquire("NanoSmart", 20, 12.50);
	fluff_thr_cat.show();
	fluff_thr_cat.buy(15,18.125);
	fluff_thr_cat.show();
	fluff_thr_cat.sell(400, 20.00);
	fluff_thr_cat.show();
	fluff_thr_cat.buy(300000, 40.125);
	fluff_thr_cat.show();
	fluff_thr_cat.sell(300000, 0.125);
	fluff_thr_cat.show();
	return 0;
}