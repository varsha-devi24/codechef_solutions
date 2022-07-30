#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int X,A,B;
	cin>>X;
	cin>>A>>B;
	int sum=0;
	sum=A+B;
	if(sum<=X){
	    cout<<"YES"<<endl;
	}
	else{
	    cout<<"NO"<<endl;
	}
	return 0;
}
