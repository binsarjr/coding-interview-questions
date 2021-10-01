#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

string reverseWords(string S)
{
    // code here
    vector<char> str(S.begin(), S.end());

    reverse(str.begin(), str.end());

    auto it = str.begin();
    auto en = str.begin();
    for (en = str.begin(); en != str.end(); ++en)
    {
        if (*en == '.')
        {
            reverse(it, en);
            it = en + 1;
        }
    }

    if (it != str.end())
    {
        reverse(it, en);
    }

    string res = "";

    for (auto i : str)
        res = res + i;

    return res;
}