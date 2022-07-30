#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int T;
	cin>>T;
	while(T--)
	{
	    int X,Y,Z;
	    cin>>X>>Y>>Z;
	    int total=0;
	    total=(5*X)+(10*Y);
	    int result = 0;
	    result=total/Z;
	    cout<<result<<endl;
	}
	return 0;
}
