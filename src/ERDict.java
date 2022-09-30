import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class ERDict {
    private Map<String,String> ER;
    private Map<String,Integer> counter;

    public ERDict() {
        ER = new HashMap<>();
        counter = new HashMap<>();
        ER.put("January", "Январь");
        counter.put("January", 0);
        ER.put("February", "Февраль");
        counter.put("February", 0);
        ER.put("March", "Март");
        counter.put("March", 0);
        ER.put("April", "Апрель");
        counter.put("April", 0);
        ER.put("May", "Май");
        counter.put("May", 0);
        ER.put("June", "Июнь");
        counter.put("June", 0);
        ER.put("July", "Июль");
        counter.put("July", 0);
        ER.put("August", "Август");
        counter.put("August", 0);
        ER.put("September", "Сентябрь");
        counter.put("September", 0);
        ER.put("October", "Октябрь");
        counter.put("October", 0);
        ER.put("November", "Ноябрь");
        counter.put("November", 0);
        ER.put("December", "Декабрь");
        counter.put("December", 0);
    }

    public void printDictionary()
    {
        for(var item : ER.entrySet()) {
            System.out.println(item);
        }
    }
    public void printWord(String key)
    {
        if(ER.containsKey(key)) {
            System.out.println(key + " - " + ER.get(key));
            counter.computeIfPresent(key, (k,v) -> v++);
        }
        else
            System.out.println("Нет такого слова");
    }
    public void addWord(String key,String value)
    {
        if(!ER.containsKey(key)) {
            ER.putIfAbsent(key, value);
            counter.putIfAbsent(key,0);
        }
        else
            System.out.println("Такое слово уже есть");
    }
    public void removeWord(String key)
    {
        ER.remove(key);
        counter.remove(key);
    }
    public void toChange(String key,String value)
    {
        ER.computeIfPresent(key, (k,v) -> v = value);

    }
    public void popularWord()
    {
        int max = (Collections.max(counter.values()));
        String key ="";
        for (var item : counter.entrySet())
        {
            if(item.getValue() == max){
                key = item.getKey();
                break;
            }
        }
        printWord(key);
    }
    public void unpopularWord()
    {
        int min = (Collections.min(counter.values()));
        String key ="";
        for (var item : counter.entrySet())
        {
            if(item.getValue() == min){
                key = item.getKey();
                break;
            }
        }
        printWord(key);
    }
}
