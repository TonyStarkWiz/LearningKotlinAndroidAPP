package io

import java.util.*;
import java.lang.*;
import java.io.*;

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readline()
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    for(i in 1..100) {
        println()
    }

    // Tree
    // tree
    // ['t', 'r', 'e', 'e']
    // {'t', 'r', 'e'}
    val letters = word.toLowerCase().toChararray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {

        printExploreWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails\n")

        print("Guess letter: ")
        val input = readLine()

        if (input == null) {
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            ++fails
        }
    }

    printExploreWord(word, correctGuesses)
    println("#Wrong guesses: $fails\n\n")
    println("Well done")

    printExploreWord("Kotlin", mutableSetOf('o', '1'))
    printExploreWord("Kotlin", mutableSetOf('k', 'o', '1'))
    printExploreWord("Kotlin", mutableSetOf())
}

fun printExploreWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print(character + " ")
        } else {
            print("_ ")
        }
    }
}
