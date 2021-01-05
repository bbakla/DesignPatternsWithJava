package structural.facade.subsystems.cachier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cachier {

  private Map<String, List<Item>> customerMap = new HashMap<>();

  public void saveOrderItems(List<String> items, String tableName) {
    if (customerMap.containsKey(tableName)) {

      customerMap.get(tableName).addAll(getItemsWithPrice(items));
    } else {
      customerMap.put(tableName, getItemsWithPrice(items));
    }
  }

  public void saveOrder(String item, String tableName) {

    var items = new ArrayList<String>()
    {{
      add(item);
    }};

    saveOrderItems(items, tableName);
  }

  public double pay(String tableName) {

    var items = customerMap.get(tableName);

    return items.stream().mapToDouble(a -> a.getPrice()).sum();
  }

  private List<Item> getItemsWithPrice(List<String> items) {
    return items.stream()
        .map(i -> new Item(i, getItemPrice(i)))
        .collect(Collectors.toList());
  }

  private double getItemPrice(String itemName) {
    return 3;
  }
}
