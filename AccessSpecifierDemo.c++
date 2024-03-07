#include<iostream>
using namespace std;
class AccessSpecifierDemo {
    private: 
        int priVar;
    protected:
        int proVar;
    public:
        int pubVar;
        void setVar(int priValue,int proValue, int pubValue){
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
        cout<<"The value of private variable is "<<priVar<<endl;
        cout<<"The value of proVar variable is "<<proVar<<endl;
        cout<<"The value of pubVar variable is "<<pubVar<<endl;
        }
        void getVar(){
        cout<<"The value of private variable is "<<priVar<<endl;
        cout<<"The value of proVar variable is "<<proVar<<endl;
        cout<<"The value of pubVar variable is "<<pubVar<<endl;
        }
};

int main(){
    int priVar,proVar,pubVar;
    cout<<"Enter the values to set private,protected and public variables ";
    cin>>priVar>>proVar>>pubVar;
    AccessSpecifierDemo obj;
    cout<<"setting variables"<<endl;
    obj.setVar(priVar,proVar,pubVar);
    cout<<"getting variables"<<endl;
    obj.getVar();
}