package service;

import model.Map;
import model.Villain;
import service.interfaces.IMapService;

import java.util.List;

public class MapService implements IMapService {
    @Override
    public void putVillainsToMap(Map map, List<Villain> villainList) {
        for (int i = 0; i < villainList.size(); i++){
            villainList.get(i).getCoordinate().setxAxis(villainList.get(i).getCoordinate().getxAxis() + (2 * (i + 1) ));
            map.getMapPlacement()[villainList.get(i).getCoordinate().getxAxis()][villainList.get(i).getCoordinate().getyAxis()] = villainList.get(i);

        }
    }
    @Override
    public void printMap(Map map){
        for (int i = 0; i < map.getxLength(); i++){
            for (int y = 0; y < map.getyLength(); y++){
                if(map.getMapPlacement()[i][y] != null && map.getMapPlacement()[i][y].getName() != null){
                    System.out.print(map.getMapPlacement()[i][y].getName() + " ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println(" ");
        }
    }
}
