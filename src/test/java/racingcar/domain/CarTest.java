package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void testCarInitializationWithName() {
        String name = "sam";
        Car car = new Car(name);
        assertThat(name).isEqualTo(car.getName().toString());
        assertThat(0).isEqualTo(car.getPositionNumber());
    }


    @Test
    void testGoForwardByNumber() {
        int forwardNumber = 4;
        int noMoveNumber = 3;

        Car car = new Car("sam");
        car.goForwardByNumber(forwardNumber);
        assertThat(1).isEqualTo(car.getPositionNumber());

        car.goForwardByNumber(noMoveNumber);
        assertThat(1).isEqualTo(car.getPositionNumber());
    }

}