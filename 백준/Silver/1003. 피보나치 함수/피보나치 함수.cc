#include <iostream>
#include <stdlib.h>
using namespace std;
int memoryzero[41]={0};
int memoryone[41] ={0};
int fibonacci(int n){
    if(n==0){
		return 0;
	}
	else if(n==1){
		return 0;
	}
	else if(memoryzero[n]==0&&memoryone[n]==0){
			fibonacci(n-2);
			fibonacci(n-1);
		
		memoryzero[n]= memoryzero[n-1]+memoryzero[n-2];
		memoryone[n]= memoryone[n-1]+memoryone[n-2];
		return 0;
	}
	else
	return 0;
}
int main(int argc, char * argv[]){
	memoryzero[0]=1;
	memoryone[1]=1;
	int num=0;
	cin >> num;
	int *temp = (int*)malloc(sizeof(int) * num);
	
	for(int i=0;i<num;i++){
		cin >> temp[i];
    	fibonacci(temp[i]);
    	cout<<memoryzero[temp[i]] <<" "<< memoryone[temp[i]]<<endl;
	}
	free(temp);
	return 0;
}