package service;

import model.*;
import service.interfaces.ILoadService;

import java.util.ArrayList;
import java.util.List;

public class LoadService implements ILoadService {
    @Override
    public List<Villain> loadVillains() {
        List<Villain> villainList = new ArrayList<>();
        Villain raptile = new Raptiles("Raptile", 1,true, 1, )
        return null;
    }

    @Override
    public MarioBaseCharacter loadMario() {
        Coordinate marioCoordinate = new Coordinate(0,0);
        MarioBaseCharacter mario = new Mario("Mario", 1, GrowthCycleEnum.LITTLE, 1,false,
                3, marioCoordinate);
        return mario;
    }

    @Override
    public MarioBaseCharacter loadLuigi() {
        return null;
    }

    @Override
    public Map loadMap() {
        return null;
    }
}
