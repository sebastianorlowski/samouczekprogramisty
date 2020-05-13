package pl.orlowski.sebastian.samouczekjava.a15testyjednostkowe.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Napisz program, który będzie reprezentował koszyk w sklepie internetowym. Do koszyka reprezentowanego przez klasę Basket możemy dodawać bądź usuwać kolejne przedmioty. Każdy przedmiot powinien mieć nazwę i cenę jednostkową. Koszyk powinien także pozwalać na dodanie/usunięcie od razu kilku egzemplarzy przedmiotu ze sklepu. Koszyk powinien także być w stanie policzyć sumaryczną wartość zamówienia oraz wyświetlić swoją zawartość. Pamiętaj o poprawnym obsłużeniu sytuacji wyjątkowych np. usunięcie elementów z pustego koszyka czy dodaniu ujemnej liczby przedmiotów.
//
//Napisz zestaw testów jednostkowych potwierdzających poprawne działanie Twojego koszyka z zakupami.
//
//Drobna podpowiedź z przykładowym zestawem klas, które mogą rozwiązać ten problem:
//
//Item, która posiada dwa atrybuty double price4 oraz String name,
//Basket, który posiada atrybut Map orderedItems reprezentujący zamówione towary wraz z ich ilością.
public interface BasketInterface {


    void addItem(Item item, int count);
    void removeItem(Item item, int count);
    Double total();
    void returnBasket();
}
