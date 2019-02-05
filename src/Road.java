package cartaskpackage;
import java.util.ArrayList;

    import javafx.animation.AnimationTimer;
    import javafx.application.Application;
    import javafx.scene.Group;
    import javafx.scene.Scene;
    import javafx.scene.input.KeyCode;
    import javafx.scene.paint.Color;
    import javafx.scene.shape.Circle;
    import javafx.stage.Stage;

    public class Road extends Application {

        Scene scene;
        car car;
        static Group root;

        public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();;

        public static void main(String[] args) {
            launch();
        }

        public void start(Stage primaryStage) throws Exception {

            root = new Group();

            scene = new Scene(root, 1920, 1000, Color.BLACK);
            setKeyPress();
            startAnimationTimer();


            car = new car();

            root.getChildren().add(car);

            primaryStage.setScene(scene);
            primaryStage.show();

        }


        private void startAnimationTimer() {

            AnimationTimer at = new AnimationTimer() {
@Override
                public void handle(long now) {

                    for (KeyCode key : keys) {

                        switch (key) {
case W:
                            double deg = Math.toRadians(car.getRotate());
                            car.move();
                            break;

                        case A:
                            car.turnLeft();
                            break;
                        case D:
                            car.turnRight();
                            break;

                        }

                    }

                }

            };

            at.start();

        }


        private void setKeyPress() {

            scene.setOnKeyPressed(event -> {

                KeyCode key = event.getCode();

                if (!keys.contains(key)) {
                    keys.add(key);
                }

            });

            scene.setOnKeyReleased(event -> {

                KeyCode key = event.getCode();

                if (keys.contains(key)) {
                    keys.remove(key);
                }

            });
        }
    }