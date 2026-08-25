# B1.3.1 — Frame-by-Frame Change

This lesson teaches students how repeated `draw()` calls create visible change when they update a value that survives between calls. Students read an assignment statement, compare a local variable with a class-level sketch variable, trace values across frames, and construct a growing circle.

## Lesson materials

| Audience | Resource | Purpose |
|---|---|---|
| Teacher | [`teacher/B1.3.1_Frame_By_Frame_Change.pptx`](teacher/B1.3.1_Frame_By_Frame_Change.pptx) | 45-minute projected lesson with explicit BlueJ steps, teacher notes, predictions, checkpoints, recovery code, and troubleshooting |
| Teacher and students | [`examples`](examples) | Six runnable BlueJ projects covering the shell and every program used to explain or test frame-by-frame change |

## Learning outcomes

By the end of the lesson, students can:

- read `d = d + 1` as “take the current value, add 1, and store the result back in `d`”;
- distinguish a local variable declared inside `draw()` from a sketch variable declared in the class;
- predict the value of `d` across several calls to `draw()`;
- explain why a local variable initialized inside `draw()` returns to its starting value on every call;
- build a sketch in which a persistent diameter changes the circle frame by frame;
- debug the declaration, update, use, and order of a changing value.

## Project map

| Project | Role | Expected result |
|---|---|---|
| [`FrameChangeSketch_Starter`](examples/FrameChangeSketch_Starter) | Verified BlueJ/PApplet shell | Blank dark 400 × 400 window |
| [`FrameChangeSketch_Static`](examples/FrameChangeSketch_Static) | Retrieval example | Same centered 80-pixel circle is redrawn every frame |
| [`FrameChangeSketch_LocalReset`](examples/FrameChangeSketch_LocalReset) | Local-variable comparison | Circle remains 82 pixels because `d` starts at 80 inside every call |
| [`FrameChangeSketch_Persistent`](examples/FrameChangeSketch_Persistent) | Persistent-variable comparison | Circle grows by 4 pixels per frame and the old frame is cleared |
| [`FrameChangeSketch_SlowTrace`](examples/FrameChangeSketch_SlowTrace) | Frame-value trace | Console prints 21, 22, 23… once per second while the circle grows slowly |
| [`FrameChangeSketch_Complete`](examples/FrameChangeSketch_Complete) | Construction target | Opaque centered circle grows by 2 pixels per frame without clearing later frames |

## Recommended classroom sequence

1. Create `B1_3_1_Frame_Change` and a class named `FrameChangeSketch`.
2. Paste, compile, and run the starter shell.
3. Read `d = d + 1` from right to left.
4. Trace the local-reset version and the persistent version before running them.
5. Run both verified comparison projects and identify the one declaration-placement difference.
6. Build the growing-circle program from the starter.
7. Explain the declaration, update, values, and drawing call to a partner.
8. Complete the exit ticket without running the code.

## How to run the projects

1. Confirm `core-4.5.6.jar` appears as `(Loaded)` in BlueJ.
2. Open an example folder as a BlueJ project.
3. Click **Compile**.
4. Right-click `FrameChangeSketch`.
5. Run `void main(String[] args)`.
6. Accept the argument and click **OK**.

## Verification

All six source files compile against Processing 4.5.6 using the JDK bundled with BlueJ 6.0.0 on the verified Windows 11 environment.

This lesson deliberately changes diameter only. Position change, trails, clean motion, edge tests, and wrapping remain for later B1.3 lessons.
