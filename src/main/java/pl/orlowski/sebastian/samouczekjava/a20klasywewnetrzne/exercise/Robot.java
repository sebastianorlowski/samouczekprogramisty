package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne.exercise;

public class Robot {
    private HelloRobot helloRobot;

    public Robot(HelloRobot helloRobot) {
        this.helloRobot = helloRobot;
    }

    public void welcome() {
        helloRobot.sayHello();
    }

    public void polandRobot(){
        Robot poland = new Robot(new HelloRobot() {
            @Override
            public void sayHello() {
                System.out.println("Cześć");
            }
        }) ;
    }

    public void germanRobot() {
        Robot german = new Robot(new HelloRobot() {
            @Override
            public void sayHello() {
                System.out.println("Hallo");
            }
        });
    }

    public void ukRobot() {
        Robot uk = new Robot(new HelloRobot() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        });
    }
}
