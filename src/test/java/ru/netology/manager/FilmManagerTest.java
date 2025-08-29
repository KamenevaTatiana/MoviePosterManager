package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class FilmManagerTest {

    PosterItem item1 = new PosterItem("Бладшот");
    PosterItem item2 = new PosterItem("Вперёд");
    PosterItem item3 = new PosterItem("Отель «Белград»");
    PosterItem item4 = new PosterItem("Джентльмены");
    PosterItem item5 = new PosterItem("Человек-невидимка");
    PosterItem item6 = new PosterItem("Тролли. Мировой тур");
    PosterItem item7 = new PosterItem("Номер один");

    @Test
    public void shouldFindAll() {
        FilmManager manager = new FilmManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5() {
        FilmManager manager = new FilmManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast7() {
        FilmManager manager = new FilmManager(7);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        FilmManager manager = new FilmManager(3);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        PosterItem[] expected = {item7, item6, item5};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5If3Items() {
        FilmManager manager = new FilmManager();
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        PosterItem[] expected = {item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmName() {
        PosterItem item = new PosterItem("Матрица");
        item.setFilmName("Матрица");
        Assertions.assertEquals("Матрица", item.getFilmName());
    }

}
