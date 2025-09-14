#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    // Короткое решение с алгоритмами STL
    int sum_even = 0;
    for (int num : numbers) {
        if (num % 2 == 0) {
            sum_even += num;
        }
    }
    
    std::cout << "Массив: ";
    for (int num : numbers) std::cout << num << " ";
    std::cout << "\nСумма четных чисел: " << sum_even << std::endl;
    
    return 0;
}