#include <iostream>

void compare_and_print_different(const char* s, const char* t) {
  int i = 0;
  while (s[i] != '\0' && t[i] != '\0') {
    if (s[i] != t[i]) {
      std::cout << s[i];
    }
    i++;
  }

  // Print remaining characters from s if t is shorter
  while (s[i] != '\0') {
    std::cout << s[i];
    i++;
  }
}

int main() {
  const char* s = "hello";
  const char* t = "world";

  compare_and_print_different(s, t);

  return 0;
}
