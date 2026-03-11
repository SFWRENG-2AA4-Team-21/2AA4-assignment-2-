
import catan.Building;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BuildingTest {
    private Building building;
    @BeforeEach
    void setBuilding(){
        building = new Building(100);
    }
    @Test
    void testSetandget(){
        building.setVictoryPoints(110);
        assertEquals(110,building.getVictoryPoints());
    }
}
