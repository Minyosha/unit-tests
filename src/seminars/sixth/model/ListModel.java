package seminars.sixth.model;

import seminars.sixth.controller.ListWorker;

import java.util.List;

public class ListModel {
    public List<Integer> list;
    int listSize;

    public ListModel(int listSize) {
        this.listSize = listSize;
        this.list = ListWorker.generateList(listSize);
    }
}
