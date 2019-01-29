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
        Rocket rocket;
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

            for (int i = 0; i < 1000; i++) {

                Circle star = new Circle(Math.random() * 4);
                star.setFill(Color.YELLOW);
                star.setTranslateX(Math.random() * 1920);
                star.setTranslateY(Math.random() * 1000);

                root.getChildren().add(star);

            }

            for (int i = 0; i < 30; i++) {

                Circle planet = new Circle(Math.random() * 15 + 15);
                planet.setFill(Color.GREEN);
                planet.setTranslateX(Math.random() * 1800+ 100);
                planet.setTranslateY(Math.random() * 800 + 100);

                root.getChildren().add(planet);

            }

            rocket = new Rocket();

            root.getChildren().add(rocket);





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
                            double deg = Math.toRadians(rocket.getRotate());
                            rocket.moveForward();
                            break;

                        case A:
                            rocket.rotateLeft();
                            break;
                        case D:
                            rocket.rotateRight();
                            break;
                        case SPACE:
                            Bullet b = rocket.shoot();
                            root.getChildren().add(b);
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