# B1.4 — Read, Trace & Deliberately Modify

This lesson closes Unit B1 with a repeatable method for understanding code written by someone else: read its structure, classify variable scope, trace changing values, predict the visible result, make one deliberate edit, and check the prediction by running the program.

## Learning goals

Students will be able to:

- identify what runs before, once, and repeatedly in a BlueJ Processing class;
- distinguish persistent class fields from local variables;
- trace changing values in the exact order used by `draw()`;
- connect the newest values to `ellipse()` and `rect()` arguments;
- predict position, size, style, motion, and trails before running; and
- explain precisely what one edit changes and what it leaves unchanged.

## Lesson materials

- [`teacher/B1.4_Read_Trace_Modify_Revised.pptx`](teacher/B1.4_Read_Trace_Modify_Revised.pptx): 45-minute teacher deck with BlueJ steps, two unfamiliar programs, worked traces, prediction checkpoints, deliberate modifications, speaker notes, and appendices.
- [`examples`](examples): five runnable BlueJ projects matching the lesson checkpoints.

## Example projects

| Project | Purpose | Expected result |
|---|---|---|
| `TraceSketch_Starter` | Verified BlueJ/Processing shell | Blank white 400 × 300 window |
| `TraceSketch_Circle` | First unfamiliar program | Mid-gray circle moves right and grows with no trail |
| `TraceSketch_CircleDark` | Local-style modification | Same motion and growth with a darker circle |
| `TraceSketch_Rectangle` | Second unfamiliar program | Gray outlined square moves upward by 3 pixels and shrinks by 1 pixel per frame |
| `TraceSketch_Complete` | Field modification | Same square moves upward by 6 pixels and still shrinks by 1 pixel per frame |

The examples intentionally omit edge tests, wrapping, and bouncing. Shapes eventually leave the canvas; close the sketch and run it again.

## Verified environment

- Windows 11 x64
- BlueJ 6.0.0
- Processing 4.5.6
- `core-4.5.6.jar` loaded in BlueJ

## Run any example

1. Open the example folder as a BlueJ project.
2. Compile `TraceSketch`.
3. Close the editor.
4. Right-click the `TraceSketch` class tile.
5. Choose `void main(String[] args)` and click OK.
6. Compare the animation with the prediction in the project README.

## Technical language

The projects use `vx` and `vy` for signed per-frame position changes. The sign determines direction, while the absolute value determines the number of pixels changed per frame. `growth` and `shrink` are signed per-frame size changes.
