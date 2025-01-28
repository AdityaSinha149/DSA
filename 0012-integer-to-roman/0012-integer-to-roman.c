char* intToRoman(int num) {
    if (num <= 0 || num > 3999) {
        return NULL;
    }

    char* arr = (char*)malloc(20);
    int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char* symbols[] = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                       "XL", "X",  "IX", "V",  "IV", "I"};

    int i = 0;

    for (int j = 0; num > 0; j++) {
        int count = num / values[j];
        num %= values[j];

        for (int k = 0; k < count; k++) {
            for (int l = 0; symbols[j][l] != '\0'; l++) {
                arr[i++] = symbols[j][l];
            }
        }
    }

    arr[i] = '\0'; // Null-terminate the string
    return arr;
}