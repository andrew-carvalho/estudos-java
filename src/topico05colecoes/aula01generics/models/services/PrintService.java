package topico05colecoes.aula01generics.models.services;

import java.util.ArrayList;

public class PrintService<T> {
    private ArrayList<T> list;

    public PrintService() {
        this.list = new ArrayList<T>();
    }

    public void add(T data) throws Exception {
        if (data == null) {
            throw new Exception("Invalid data!");
        }
        this.list.add(data);
    }

    public T first() throws Exception {
        if (this.list.isEmpty()) {
            throw new Exception("Empty list");
        }
        return this.list.getFirst();
    }

    public void print() {
        for (T data : list) {
            System.out.println(data);
        }
    }

    public ArrayList<T> getList() {
        return list;
    }
}
