package c19_generic.wildcards.wildcard_practice;

import c15_casting.animals.Dog;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal) animal).move();

        if(animal.getClass() == Human.class){
            ((Human) animal).readBook();
        }else if(animal.getClass() == Tiger.class){
            ((Tiger) animal).hunt();
        }
    }
}
