package ie.gmit.sw.view;

import java.util.ArrayList;

import ie.gmit.sw.tiles.Enemy;
import ie.gmit.sw.tiles.Ground;
import ie.gmit.sw.tiles.Item;

public interface Generate {

	ArrayList<Ground> createGround(ArrayList<Ground> list, int offset);

	ArrayList<Item> createObjects(ArrayList<Item> list, int offset);

	ArrayList<Enemy> createEnemies(ArrayList<Enemy> list, int offset);

}
