# B1.3.2 — Velocity-Style Movement

This lesson applies persistent frame-by-frame change to position. Students update a horizontal or vertical coordinate, use a signed per-frame velocity to control direction, predict positions across frames, and compare cumulative trails with clean motion.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.3.2_Velocity_Style_Movement.pptx`](teacher/B1.3.2_Velocity_Style_Movement.pptx) | 45-minute projected lesson with explicit BlueJ steps, teacher notes, predictions, runnable comparisons, recovery code, and troubleshooting |
| Teacher and students | [`examples`](examples) | Six runnable BlueJ projects covering the shell and every program used to teach or test constant per-frame movement |

## Learning outcomes

By the end of the lesson, students can:

- update a persistent position once per frame using `x = x + vx` or `y = y + vy`;
- distinguish current position from signed change per frame;
- use the sign of `vx` or `vy` to determine direction on Processing's screen axes;
- use the magnitude of velocity to describe the number of pixels changed per frame;
- predict a shape's position after several calls to `draw()`;
- explain why `background()` at the start of `draw()` produces clean motion;
- diagnose a missing update, wrong sign, misplaced `background()`, or unused position variable.

## Project map

| Project | Role | Expected result |
|---|---|---|
| [`VelocitySketch_Starter`](examples/VelocitySketch_Starter) | Verified BlueJ/PApplet shell | Blank white 400 × 300 window |
| [`VelocitySketch_Trail`](examples/VelocitySketch_Trail) | Cumulative-drawing comparison | Orange trail remains because `background()` runs only once |
| [`VelocitySketch_Clean`](examples/VelocitySketch_Clean) | Frame-clearing comparison | One orange circle moves right with no trail |
| [`VelocitySketch_Left`](examples/VelocitySketch_Left) | Signed horizontal velocity | One orange circle moves left because `vx` is negative |
| [`VelocitySketch_Vertical`](examples/VelocitySketch_Vertical) | Screen y-axis comparison | One blue circle moves upward because `vy` is negative |
| [`VelocitySketch_Complete`](examples/VelocitySketch_Complete) | Construction target | One orange circle moves right by 2 pixels per frame with clean clearing |

## Recommended classroom sequence

1. Create `B1_3_2_Velocity_Movement` and a class named `VelocitySketch`.
2. Paste, compile, and run the starter shell.
3. Add persistent `x` and `vx`; trace the first four visible positions.
4. Map positive and negative `vx` or `vy` to the screen axes.
5. Run the trail and clean versions and identify the placement of `background()`.
6. Run the leftward version after predicting its direction and position.
7. Build the complete clean-motion program from the starter.
8. Modify magnitude, sign, and initial position one at a time.
9. Complete the exit ticket without running the code.

## How to run the projects

1. Confirm `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open an example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `VelocitySketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

## Verification

All six source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

This lesson deliberately omits edge tests, wrapping, bouncing, acceleration, and time-based delta movement. A circle leaving the canvas is expected; close and run the sketch again.
