package team147;

import battlecode.common.*;

public class RobotPlayer {

    public static void run(RobotController myRC) {
        if (myRC.getType() == RobotType.ARCHON) {
            // call to Archon class here to start it off!
        }
        while (true) {
            try {
                while (myRC.isMovementActive()) {
                    myRC.yield();
                }

                if (myRC.canMove(myRC.getDirection())) {
                    myRC.moveForward();
                } else {
                    myRC.setDirection(myRC.getDirection().rotateRight());
                }
                myRC.yield();
            } catch (Exception e) {
                System.out.println("caught exception:");
                e.printStackTrace();
            }
        }
    }
}
