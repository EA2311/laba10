package onpu;

import java.util.Comparator;

class CoordinatesComparator implements Comparator<Coordinates> {

    @Override
    public int compare(Coordinates c1, Coordinates c2) {
        int ret=0;
        try {
            if (c1.getY() / c1.getX() < c2.getY() / c2.getX())
                ret = -1;
            else if (c1.getY() / c1.getX() > c2.getY() / c2.getX())
                ret = 1;
            else if (c1.getY() / c1.getX() == c2.getY() / c2.getX()) {
                if (c1.getX() < c2.getX())
                    ret = -1;
                else if (c1.getX() > c2.getX())
                    ret = 1;
                else if (c1.getX() == c2.getX())
                    if (c1.getY() > c2.getY())
                        ret = 1;
                    else if (c1.getY() < c2.getY())
                        ret = -1;
                    else ret = 0;
            }
        }catch (ArithmeticException e){
            if (c1.getY() < c2.getY())
                ret = -1;
            else if (c1.getY() > c2.getY())
                ret = 1;
            else ret = 0;
        }
        return ret;
    }
}