package work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Record {
    private String tableID;
    private String data;


    public Record(String tableID, String data) {
        this.tableID = tableID;
        this.data = data;
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

public class HashMapTest {
    public static void main(String[] args) {
        List<Record> stream = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            stream.add(new Record(String.valueOf(i), "test"));
        }
        HashMap<String, List<Record>> hm = new HashMap<>();
        send(stream, hm);
    }

    public static void send(List<Record> stream, HashMap<String, List<Record>> hm) {
        List<Record> records = new ArrayList<>();
        while (true) {
            for (Record r : stream) {
                if (hm.containsKey(r.getTableID())) {
                    records = hm.get(r.getTableID());
                    if (records.size() >= 3) {
                        sendDataToDB(records);
                        records.clear();
                        System.out.println("clear the list");
                    } else {
                        records.add(r);
                    }
                } else {
                    records.add(r);
                    hm.put(r.getTableID(), records);
                }
            }
        }
    }

    public static void sendDataToDB(List<Record> records) {
        System.out.println("sent number of records " + records.size());
    }
}
