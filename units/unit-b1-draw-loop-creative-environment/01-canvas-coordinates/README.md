# B1.1.1 — Canvas & Coordinate System

This lesson introduces the Processing canvas, screen coordinates, and the parameters of `ellipse()` through four small BlueJ projects.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.1.1_Canvas_Coordinates.pptx`](teacher/B1.1.1_Canvas_Coordinates.pptx) | 45-minute projected lesson with speaker notes, embedded BlueJ instructions, and troubleshooting appendices |
| Teacher and students | [`examples`](examples) | Four runnable BlueJ projects covering every code example in the presentation |

## Learning outcomes

By the end of the lesson, students can:

- create a canvas with `size(width, height)` inside `settings()`;
- explain that `(0, 0)` is the top-left corner;
- state that x increases to the right and y increases downward;
- read `ellipse(x, y, width, height)` using the default center-based ellipse mode;
- predict a shape's position before compiling and running the program.

## Project map

| Project | Role in the lesson | Expected result |
|---|---|---|
| [`CanvasSketch_Starter`](examples/CanvasSketch_Starter) | First complete BlueJ/PApplet wrapper | A blank 400 × 400 sketch window |
| [`CanvasSketch_SingleCircle`](examples/CanvasSketch_SingleCircle) | Demonstrates one shape at a known center | A 40 × 40 circle centered at `(100, 150)` on a 400 × 400 canvas |
| [`CanvasSketch_Prediction`](examples/CanvasSketch_Prediction) | Predict-before-run formative check | Three 30 × 30 circles centered at `(50, 50)`, `(250, 50)`, and `(150, 250)` |
| [`CanvasSketch_Complete`](examples/CanvasSketch_Complete) | Final construction target | Two 50 × 50 circles centered at `(100, 75)` and `(400, 225)` on a 500 × 300 canvas |

## Recommended classroom sequence

1. Open and run `CanvasSketch_Starter` to confirm the wrapper works.
2. Use `CanvasSketch_SingleCircle` while teaching the four `ellipse()` parameters.
3. Show the source in `CanvasSketch_Prediction`, but ask students to predict the output before running it.
4. Return to the starter and have students construct the final program themselves.
5. Use `CanvasSketch_Complete` only for recovery or comparison after the task.

## How to run any project

1. Confirm that `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open the example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `CanvasSketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

## Verification

All four source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

The examples intentionally use Processing's default fill, stroke, and ellipse mode. Color and styling are introduced later in Unit B1.
