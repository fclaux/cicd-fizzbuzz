package fizzbuzz;

import fizzbuzz.handler.BangHandler;
import fizzbuzz.handler.BuzzBangHandler;
import fizzbuzz.handler.BuzzHandler;
import fizzbuzz.handler.FizzBangHandler;
import fizzbuzz.handler.FizzBuzzBangHandler;
import fizzbuzz.handler.FizzBuzzHandler;
import fizzbuzz.handler.FizzHandler;
import fizzbuzz.handler.MultipleHandler;

/**
 * Classe principale du jeu FizzBuzz.
 * Permet de calculer la réponse "Fizz", "Buzz", "Bang" ou le nombre
 * en fonction des règles du jeu.
 */
public class FizzBuzz {

  /**
   * Premier handler de la chaîne de responsabilité.
   * C'est le point d'entrée pour déterminer la réponse Fizz/Buzz/Bang.
   */
  private final MultipleHandler firstHandler;

  /**
   * Constructeur de la classe FizzBuzz.
   * Initialise tous les handlers dans l'ordre de priorité et les
   * relie entre eux pour former une chaîne de responsabilité.
   * La chaîne commence par le handler FizzBuzzBangHandler et se termine
   * par le FizzHandler.
   */
  public FizzBuzz() {
    final MultipleHandler fizzBuzzBangHandler = new FizzBuzzBangHandler();
    final MultipleHandler buzzBangHandler = new BuzzBangHandler();
    final MultipleHandler fizzBangHandler = new FizzBangHandler();
    final MultipleHandler bangHandler = new BangHandler();
    final MultipleHandler fizzBuzzHandler = new FizzBuzzHandler();
    final MultipleHandler buzzHandler = new BuzzHandler();
    final MultipleHandler fizzHandler = new FizzHandler();

    fizzBuzzBangHandler.setNextHandler(buzzBangHandler);
    buzzBangHandler.setNextHandler(fizzBangHandler);
    fizzBangHandler.setNextHandler(bangHandler);
    bangHandler.setNextHandler(fizzBuzzHandler);
    fizzBuzzHandler.setNextHandler(buzzHandler);
    buzzHandler.setNextHandler(fizzHandler);

    this.firstHandler = fizzBuzzBangHandler;
  }

  /**
   * Retourne la réponse Fizz/Buzz/Bang pour un nombre donné.
   *
   * @param number le nombre à analyser
   * @return la chaîne correspondante ("Fizz", "Buzz", "Bang", ou le nombre)
   */
  public String sayAnswerFor(final int number) {
    return firstHandler.sayAnswerFor(number);
  }
}
