#include <iostream>

int main(int argc, char const* argv[]) {
  using namespace std;
  const int n = 2'100'000'000;
  cout << "sizeof(n): " << sizeof(n) << endl;
  //   int a[n];
  int* a = new int[n];
  cout << argc << endl << argv[0] << endl;
  return 0;
}
