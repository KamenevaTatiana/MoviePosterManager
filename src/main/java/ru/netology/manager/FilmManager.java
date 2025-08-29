package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class FilmManager {

    private PosterItem[] items = new PosterItem[0];
    private int limit;

    public FilmManager() {
        limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {
        PosterItem[] items = findAll();
        PosterItem[] result;
        if (limit < items.length) {
            result = new PosterItem[limit];
        } else {
            result = new PosterItem[items.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }
}
