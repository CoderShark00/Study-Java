package c19_generic.wildcards.wildcard_practice;

public class Main {
    // 여기서 와일드 카드 적용
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
//        }else if (flag == 3) {
//            AnimalData<Car> animalData = new AnimalData<>(new Car("셀토스"));
//            return animalData;  당연히안되지  Car 는 Animal 클래스를 상속 받지 않았기 때문
//

        return null; // flag가 1, 2가 아닌 경우에 null 반환하겠다는 의미
    }
    public static void main(String[] args) {
        Main main = new Main();
        AnimalData<? extends Animal> animalData1 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData2 = main.getAnimal(2);

        if(animalData1 != null) {
            animalData1.printData();
        }
        if(animalData2 != null) {
            animalData2.printData();
        }

    }
}
