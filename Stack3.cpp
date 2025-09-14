#include <iostream>
#include <stack>
#include <string>
using namespace std;

bool isBalanced(string expression) {
    stack<char> st;
    
    for (char c : expression) {
        if (c == '(' || c == '[' || c == '{') {
            st.push(c);
        } else {
            if (st.empty()) return false;
            if (c == ')' && st.top() != '(') return false;
            if (c == ']' && st.top() != '[') return false;
            if (c == '}' && st.top() != '{') return false;
            st.pop();
        }
    }
    return st.empty();
}

int main() {
    string tests[] = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};
    for (string test : tests) {
        cout << "'" << test << "': " << (isBalanced(test) ? "true" : "false") << endl;
    }
    return 0;
}