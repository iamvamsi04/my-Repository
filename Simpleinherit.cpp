#include<iostream>
using namespace std;
class SuperClass{
    protected:
        int b=10;
    private:
        int c=5;
    public:
        int a=1;
        void getme(){
            cout<<"private var is "<<c<<endl;
        }
        int mummy(){
            return c;
        }

};

class PublicSubclass : public SuperClass{
    public:
        void display(){
            cout<<"public var is "<<a<<endl;
            cout<<"protected var is "<<b<<endl;
        }
};

class ProtectedSubclass : protected SuperClass{
    public:
        void display(){
            cout<<"public var is "<<a<<endl;
            cout<<"protected var is "<<b<<endl;
        }
        void dummy(){
            getme();
        }

};

class PrivateSubclass : private SuperClass{
    public:
        void display(){
            cout<<"public var is "<<a<<endl;
            cout<<"protected var is "<<b<<endl;
        }
        int e = mummy();
};

int main(){
    PublicSubclass obj;
    cout<<"viewing variables in public inheritance"<<endl;
    obj.display();
    obj.getme();

    ProtectedSubclass obj1;
    cout<<"viewing variables in protected inheritance"<<endl;
    obj1.display();
    obj1.dummy();
    cout<<"viewing variables in private inheritance"<<endl;

    PrivateSubclass obj2;
    obj2.display();
    cout<<"private var is "<<obj2.e<<endl;

}
