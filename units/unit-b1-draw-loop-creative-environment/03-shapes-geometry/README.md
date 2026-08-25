# B1.2.1 — Shapes & Geometry

This lesson teaches students to translate geometric specifications into Processing calls. Students use `rect()`, `ellipse()`, and `line()`, compare their default reference points, and predict each result before running it in BlueJ.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.2.1_Shapes_Geometry.pptx`](teacher/B1.2.1_Shapes_Geometry.pptx) | 45-minute projected lesson with speaker notes, explicit BlueJ instructions, checkpoints, a complete starter shell, recovery methods, and troubleshooting |
| Teacher and students | [`examples`](examples) | Six runnable BlueJ projects covering every program used in the lesson |

## Learning outcomes

By the end of the lesson, students can:

- draw a rectangle with `rect(x, y, width, height)`;
- explain that the first pair identifies the upper-left corner in the default `CORNER` mode;
- explain that the first pair identifies the center of an ellipse in the default `CENTER` mode;
- draw a line with `line(x1, y1, x2, y2)`;
- predict shape placement, size, and endpoints before running the program;
- diagnose a geometry error by explaining what each argument controls.

## Project map

| Project | Role in the lesson | Expected result |
|---|---|---|
| [`ShapesSketch_Starter`](examples/ShapesSketch_Starter) | Complete runnable BlueJ/PApplet shell | A blank light-gray 400 × 300 sketch window |
| [`ShapesSketch_Rectangle`](examples/ShapesSketch_Rectangle) | Checkpoint 1 | A rectangle whose upper-left corner is `(100, 100)`, width is `150`, and height is `80` |
| [`ShapesSketch_Compare`](examples/ShapesSketch_Compare) | `rect()` versus `ellipse()` comparison | The two shapes interpret the same `(x, y)` pair differently |
| [`ShapesSketch_Line`](examples/ShapesSketch_Line) | Checkpoint 2 | A line connecting `(60, 260)` and `(260, 60)` |
| [`ShapesSketch_Predict`](examples/ShapesSketch_Predict) | Mixed-primitives formative check | A rectangle, ellipse, and horizontal line on a 300 × 300 canvas |
| [`ShapesSketch_Complete`](examples/ShapesSketch_Complete) | Checkpoint 3 and final student target | The required rectangle, circle, and horizontal line on a 400 × 300 canvas |

## Recommended classroom sequence

1. Create the `B1_2_1_Shapes_Geometry` BlueJ project and the `ShapesSketch` class by following the presentation.
2. Paste, compile, and run the complete shell shown on slide 5.
3. Build and verify the rectangle checkpoint.
4. Compare `rect()` and `ellipse()` using the same four values.
5. Build and verify the line checkpoint.
6. Predict the mixed scene before running it.
7. Construct the final three-shape scene from specifications.
8. Use the peer check and exit ticket to require an explanation of each argument.

## How to run the projects

1. Confirm that `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open an example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `ShapesSketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

## Verification

All six source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

The student-facing programs use default shape appearance so colour, fill, stroke, and line thickness remain available for B1.2.2.
