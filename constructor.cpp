#include<iostream>
using namespace std;
class student
{
    public:
        string fullname;
        int rollnum;
        double sempercentage;
        string collegename;
        int collegecode;
        student(string name,int roll,double sempercent,string collegena,int collegeco)
        {
            fullname=name;
            rollnum=roll;
            sempercentage=sempercent;
            collegename=collegena;
            collegecode=collegeco;
        }
        ~student()
        {
            cout<<"student class destructed";
        }
};
int main()
{
    string fullname;
    int rollnum;
    double sempercentage;
    string collegename;
    int collegecode;
    cout<<"enter your full name,rollnum,sempercentage,collegename,collegecode: ";
    cin>>fullname>>rollnum>>sempercentage>>collegename>>collegecode;
    student abc(fullname,rollnum,sempercentage,collegename,collegecode);
    cout<<abc.fullname;
    cout<<endl;
    cout<<abc.rollnum;
    cout<<endl;
    cout<<abc.sempercentage;
    cout<<endl;
    cout<<abc.collegename;
    cout<<endl;
    cout<<abc.collegecode;
    cout<<endl;
}
