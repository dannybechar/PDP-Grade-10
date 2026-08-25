# B1.2.2 — Color, Stroke & Fill

This lesson teaches students to control the current Processing drawing style with `fill()`, `stroke()`, `strokeWeight()`, `noFill()`, and `noStroke()`. Students predict each result, trace persistent state from top to bottom, and apply deliberate state changes in a final static scene.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.2.2_Color_Stroke_Fill.pptx`](teacher/B1.2.2_Color_Stroke_Fill.pptx) | 45-minute projected lesson with BlueJ instructions, teacher notes, checkpoints, recovery code, and troubleshooting |
| Teacher and students | [`examples`](examples) | Eight runnable BlueJ projects covering every program and edit used in the lesson |

## Learning outcomes

By the end of the lesson, students can:

- use `fill()` to control shape interiors;
- use `stroke()` to control outlines and lines;
- use `strokeWeight()` to set stroke thickness in pixels;
- explain that style calls affect subsequent drawing until another style call changes the state;
- distinguish one grayscale value from three RGB values in Processing's default colour mode;
- use `noFill()` and `noStroke()` deliberately and restore disabled state;
- explain which style is active immediately before a shape call.

## Project map

| Project | Role | Expected result |
|---|---|---|
| [`StyleSketch_Starter`](examples/StyleSketch_Starter) | Runnable BlueJ/PApplet shell | Blank light-gray 400 × 300 window |
| [`StyleSketch_Basics`](examples/StyleSketch_Basics) | Checkpoint 1 | Light-gray rectangle with a black 3-pixel outline |
| [`StyleSketch_Persistence`](examples/StyleSketch_Persistence) | Checkpoint 2 | Two shapes inherit fill(220); the final ellipse uses fill(80) |
| [`StyleSketch_Line`](examples/StyleSketch_Line) | Line exception | Black 4-pixel line; red fill has no effect |
| [`StyleSketch_ColorModes`](examples/StyleSketch_ColorModes) | Grayscale/RGB comparison | Gray rectangle beside a warm RGB rectangle |
| [`StyleSketch_Omit`](examples/StyleSketch_Omit) | noFill/noStroke comparison | Outline-only rectangle and fill-only ellipse |
| [`StyleSketch_PredictEdit`](examples/StyleSketch_PredictEdit) | One-value prediction | White circle with black outline; students change only its fill |
| [`StyleSketch_Complete`](examples/StyleSketch_Complete) | Checkpoint 3 target | Filled rectangle, outline-only ellipse, styled line, and fill-only circle |

## Recommended classroom sequence

1. Create `B1_2_2_Color_Stroke_Fill` and a class named `StyleSketch`.
2. Paste, compile, and run the complete shell.
3. Style a rectangle and change only its stroke weight.
4. Predict and verify which shapes inherit a persistent fill.
5. Prove that a line uses stroke rather than fill.
6. Compare grayscale and RGB values.
7. Use `noFill()` and `noStroke()` and restore state deliberately.
8. Build the final four-requirement scene and explain each active state to a peer.

## How to run the projects

1. Confirm `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open an example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `StyleSketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

## Verification

All eight source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

The lesson deliberately stays with static values and Processing's default RGB mode. Alpha, HSB, colour variables, and animation remain outside this lesson.
