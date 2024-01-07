package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;
import java.util.Map;

public interface FruitShopService {
    abstract Map<String, Integer> processTransactions(List<FruitTransaction> transactions);
}
