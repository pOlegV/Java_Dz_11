public class Repository {
    private Product[] items = new Product[0];

    public void save(Product newItem) {
        Product[] tmp = new Product[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = newItem;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[items.length - 1];
        int index = 0;
        for (Product item : items) {
            if (item.id != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
