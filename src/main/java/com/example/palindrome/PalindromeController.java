package com.example.palindrome;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

    @GetMapping("/check")
    public Map<String, Object> checkPalindrome(@RequestParam String word) {
        boolean isPalindrome = isPalindrome(word);
        return Map.of(
                "word", word,
                "isPalindrome", isPalindrome
        );
    }

    private boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
