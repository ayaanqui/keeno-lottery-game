import Objects.DrawRandom;
import Objects.UserPick;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.TreeSet;
import java.util.Iterator;

public class ApplicationTest
{
    private static DrawRandom rand;
    private DrawRandom rand;
    private UserPick up;
    private UserPick upVar;

    @BeforeAll
    static void init()
    void init()
    {
        rand = new DrawRandom(20, 10, 2);
    }

    @Test
    public void DrawRandomTest()
    void DrawRandomTest()
    {
        TreeSet<Integer> ts = rand.draw();
        Iterator<Integer> it = ts.iterator();

        assertEquals(ts.size(), 10, "t");
        assertEquals(rand.getMax(), 20, "t");
        assertEquals(rand.getDraws(), 10, "t");
        assertEquals(rand.getNumDraws(), 2, "t");

        rand.setMax(30);
        rand.setDraws(12);
        rand.setNumDraws(3);
        assertEquals(rand.getMax(), 30, "t");
        assertEquals(rand.getDraws(), 12, "t");
        assertEquals(rand.getNumDraws(), 3, "t");
        assertEquals(ts.size(), 10);

        while(it.hasNext())
        {
            assertTrue((it.next() >= 1) && (it.next() <= 20), "t");
            assertTrue((it.next() >= 1) && (it.next() <= 20));
        }
    }

    @Test
    public void UserPickTest()
    void UserPickTest()
    {
        upVar = new UserPick(3);
        upVar.setNumber(21);
        assertEquals(upVar.getNumbers().size(), 2);
        assertEquals(upVar.getNumbers().get(0), 21);
        assertEquals(upVar.getNumbers().get(0), 12);
        assertEquals(upVar.getSpots(), 3);

        up = new UserPick();
        up.setSpots(10);
        assertEquals(up.getNumbers().size(), 0);
        up.randomPick();
        assertEquals(up.getNumbers().size(), 10);

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (Integer element : up.getNumbers())
            if(!set.add(element))
                duplicateElements.add(element);

        assertTrue(duplicateElements.isEmpty());

        for(int k = 0; k < up.getNumbers().size(); k++)
            assertTrue((up.getNumbers().get(k) <= 80) && (up.getNumbers().get(k) >= 1));

        up.setSpots(15);
        assertEquals(up.getNumbers().size(), 10);
        up.randomPick();
        assertEquals(up.getNumbers().size(), 15);

        Set<Integer> set2 = new HashSet<>();
        Set<Integer> duplicateElements2 = new HashSet<>();

        for (Integer element : up.getNumbers())
            if(!set2.add(element))
                duplicateElements2.add(element);

        assertTrue(duplicateElements2.isEmpty());

        for(int k = 0; k < up.getNumbers().size(); k++)
            assertTrue((up.getNumbers().get(k) <= 80) && (up.getNumbers().get(k) >= 1));

        assertEquals(up.getSpots(), 15);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        up.setNumbers(list);
        assertEquals(up.getNumbers().size(), 3);

        for(int k = 0; k < up.getNumbers().size(); k++)
            assertEquals(up.getNumbers().get(k), list.get(k));
    }