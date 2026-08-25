# B1.1.2 — Setup vs. Continuous Draw

This lesson teaches students to choose between `settings()`, `setup()`, and `draw()` according to when a behavior must happen. Students build three observable checkpoints in one BlueJ class: a static setup, a mouse trail, and a clean mouse follower.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.1.2_Setup_Draw.pptx`](teacher/B1.1.2_Setup_Draw.pptx) | 45-minute projected lesson with speaker notes, explicit BlueJ instructions, complete code appendices, and troubleshooting |
| Teacher and students | [`examples`](examples) | Five runnable BlueJ projects covering every program used in the lesson |

## Learning outcomes

By the end of the lesson, students can:

- explain that `settings()` runs before `setup()` and configures the canvas in these BlueJ/PApplet projects;
- explain that `setup()` runs once after `settings()`;
- explain that `draw()` runs repeatedly by default;
- place a line of code according to when its effect must occur;
- explain why `background()` in `setup()` creates a trail while `background()` in `draw()` creates a clean follower.

## Project map

| Project | Role in the lesson | Expected result |
|---|---|---|
| [`SetupDrawSketch_Starter`](examples/SetupDrawSketch_Starter) | Complete runnable BlueJ/PApplet shell | A blank 500 × 350 sketch window |
| [`SetupDrawSketch_SetupOnce`](examples/SetupDrawSketch_SetupOnce) | Checkpoint 1: one-time initialization | One orange circle remains on a light-gray canvas while `draw()` is empty |
| [`SetupDrawSketch_Trail`](examples/SetupDrawSketch_Trail) | Checkpoint 2: repeated drawing without clearing | Moving the pointer creates a trail of orange circles |
| [`SetupDrawSketch_Clean`](examples/SetupDrawSketch_Clean) | Checkpoint 3 and final student target | One orange circle follows the pointer without leaving a trail |
| [`MovingCircleDemo`](examples/MovingCircleDemo) | Optional teacher preview | A circle moves right because `draw()` repeats and `x` increases each frame |

## Recommended classroom sequence

1. Create the `B1_1_2_Setup_Draw` project and `SetupDrawSketch` class by following the presentation.
2. Paste, compile, and run the complete wrapper shown on slide 5.
3. Build `SetupDrawSketch_SetupOnce` and confirm that setup code can leave visible pixels.
4. Predict the result before building `SetupDrawSketch_Trail`.
5. Move only `background(220);` into `draw()` to produce `SetupDrawSketch_Clean`.
6. Use the sort and exit-ticket slides to require an explanation, not just a working result.
7. Use `MovingCircleDemo` only as an optional teacher preview; controlled motion is taught later.

## How to run the SetupDrawSketch projects

1. Confirm that `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open the example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `SetupDrawSketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

For `MovingCircleDemo`, right-click `MovingCircleDemo` instead.

## Verification

All five source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

The lesson deliberately uses `mouseX` and `mouseY` so repetition becomes visible without requiring students to learn velocity or edge logic yet.

