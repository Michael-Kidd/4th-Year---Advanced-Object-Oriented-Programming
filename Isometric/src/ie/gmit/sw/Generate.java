package ie.gmit.sw;

import java.util.ArrayList;

import ie.gmit.sw.model.Enemy;
import ie.gmit.sw.model.Ground;
import ie.gmit.sw.model.Item;

public interface Generate {

	ArrayList<Ground> createGround(ArrayList<Ground> list, int offset);

	ArrayList<Item> createObjects(ArrayList<Item> list, int offset);

	ArrayList<Enemy> createEnemies(ArrayList<Enemy> list, int offset);

}
