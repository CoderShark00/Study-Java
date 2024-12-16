package c18_static.singleton.databases;

public class DatabaseMain {
    public static void main(String[] args) {

        DataManager dataManager1 = new DataManager();
        dataManager1.performDatabaseOperation();

        DataManager dataManager2 = new DataManager();
        dataManager2.performDatabaseOperation();

    }
}
