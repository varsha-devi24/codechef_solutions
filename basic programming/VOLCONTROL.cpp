#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int T,X,Y;
	cin>>T;
	while(T--)
	{
	    cin>>X>>Y;
	    int diff=0;
	    diff=abs(X-Y);
	    cout<<diff<<endl;
	}
	return 0;
}
