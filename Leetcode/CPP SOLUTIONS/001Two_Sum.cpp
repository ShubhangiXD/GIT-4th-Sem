#include <iostream>
#include <vector>
#include <map>
using namespace std;

vector<int> twoSum(vector<int> &nums, int target)
{
    map<int, int> visited;
    int len = nums.size();
    for (int i = 0; i < len; ++i)
    {
        int n = nums[i];
        int complement = target - n;
        if (visited.count(complement))
        {
            return {visited[complement], i};
        }
        visited[n] = i;
    }
    return {};
}

int main()
{
    cout << "Enter the number of array elements: " << endl;
    int len = 5;
    // cin >> len;
    vector<int> arr_num;
    cout << "Enter array elements:" << endl;

    for (int i = 0; i < len; i++)
    {
        int temp = 0;
        // cin >> temp;
        arr_num.push_back(i);
    }
    cout << "Enter the target:" << endl;
    int tar = 7;
    // cin >> tar;
    vector<int> sol = twoSum(arr_num, tar);
    for (auto i = sol.begin(); i != sol.end(); ++i)
        cout << *i << " ";
}
