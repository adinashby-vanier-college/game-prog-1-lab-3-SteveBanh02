// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new Crab();
        addObject(crab, 111, 211);
        Worm worm =  new Worm();
        addObject(worm, 323, 107);
        Worm worm2 =  new Worm();
        addObject(worm2, 107, 60);
        Worm worm3 =  new Worm();
        addObject(worm3, 485, 69);
        Worm worm4 =  new Worm();
        addObject(worm4, 480, 260);
        Worm worm5 =  new Worm();
        addObject(worm5, 321, 402);
        Worm worm6 =  new Worm();
        addObject(worm6, 449, 465);
        Worm worm7 =  new Worm();
        addObject(worm7, 68, 441);
        Worm worm8 =  new Worm();
        addObject(worm8, 204, 317);
        Worm worm9 =  new Worm();
        addObject(worm9, 333, 232);
        Lobster lobster =  new Lobster();
        addObject(lobster, 461, 156);
    }
}
