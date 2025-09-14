# Дан список чисел, найти сумму всех четных чисел
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Короткое решение в одну строку
sum_even = sum(num for num in numbers if num % 2 == 0)

print(f"Список: {numbers}")
print(f"Сумма четных чисел: {sum_even}")