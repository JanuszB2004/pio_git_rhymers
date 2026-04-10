package edu.kis.vh.nursery;

/**
 * Klasa implementuje prosty mechanizm przechowywania liczb
 * działa ona na zasadzie stosu, umożliwia dodawanie elementów
 * oraz ich usuwanie. Jej maksymalna wielkość jest ograniczona stałą CAPACITY
 */
public class DefaultCountingOutRhymer {
    private static final int EMPTY = -1;
    private static final int CAPACITY = 12;
    private static final int FULL = CAPACITY - 1;
    private static final int DEFAULT_VALUE = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    /**
     * Dodaje element na stos
     * @param in zmienna zawierająca liczbę którą dodaje metoda
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy stos jest pusty
     * @return zwraca czy stos jest pusty
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy stos jest pełny
     * @return zwraca czy stos jest pełny
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca wartość z stosu
     * @return zwraca ostatnią wartość z stosu lub jeśli pusty wartość domyślną
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Sprawdza ilość elementów na stosie
     * @return zwraca aktuaną ilość elementów
     */
    public int getTotal() {
        return total;
    }

    /**
     * zwraca i usuwa ostatnią wartość z stosu
     * @return zwraca ostatnią wartość z stosu
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
