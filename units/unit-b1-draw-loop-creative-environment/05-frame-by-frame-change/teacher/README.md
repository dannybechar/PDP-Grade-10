# Teacher guide

Use `B1.3.1_Frame_By_Frame_Change.pptx` as the lesson's single projected source of truth.

Slides 1–15 total exactly 45 minutes. Slides 16–19 are recovery and troubleshooting appendices; keep them hidden unless students need a complete example.

## Before class

- Confirm BlueJ 6.0.0 opens.
- Confirm `core-4.5.6.jar` is marked `(Loaded)` in BlueJ Preferences → Libraries.
- Open and run `FrameChangeSketch_Starter`.
- Open and run both `FrameChangeSketch_LocalReset` and `FrameChangeSketch_Persistent` so the contrast is ready to demonstrate.
- Keep `FrameChangeSketch_Complete` available for recovery, but ask students to attempt the construction first.

## Evidence to collect

- A written prediction for the fifth-call value in the local and persistent versions.
- A working growing-circle sketch.
- A spoken or written explanation that identifies where `d` is declared, where it is updated, and where the updated value controls the picture.
- The exit-ticket answer from slide 15.

## Correct exit-ticket answer

The fourth call uses `d = 22`: `10 → 13 → 16 → 19 → 22`. The declaration must be inside the class but outside `draw()` so the updated value remains available on the next call.
