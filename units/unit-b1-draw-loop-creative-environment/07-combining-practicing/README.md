# B1.3.3 — Combining & Practicing

This lesson combines the persistent-change patterns from B1.3.1 and B1.3.2. Students make one circle change in two ways, trace both values across frames, compare two combinations, and construct a complete sketch in BlueJ.

## Learning goals

Students will be able to:

- keep more than one changing property in persistent class fields;
- update each property once inside `draw()`;
- predict multiple values after several frames;
- connect each update line to the matching `ellipse()` argument; and
- explain the role of `background()` in clean animation.

## Lesson materials

- [`teacher/B1.3.3_Combining_Practicing_Revised.pptx`](teacher/B1.3.3_Combining_Practicing_Revised.pptx): 45-minute teacher deck with explicit BlueJ steps, checks for understanding, construction time, speaker notes, and appendices.
- [`examples`](examples): six runnable BlueJ projects covering the shell, retrieval example, core combinations, prediction check, and final construction.

## Example projects

| Project | Purpose | Expected result |
|---|---|---|
| `CombinedSketch_Starter` | Verified BlueJ/Processing shell | Blank white 400 × 300 window |
| `CombinedSketch_MoveOnly` | Retrieval from B1.3.2 | Orange circle moves right at constant size |
| `CombinedSketch_MoveGrow` | Core combination | Orange circle moves right and grows |
| `CombinedSketch_Diagonal` | Alternative combination | Blue circle moves down and right at constant size |
| `CombinedSketch_LeftGrow` | Prediction check | Purple circle moves left and grows |
| `CombinedSketch_Complete` | Construction target | Orange circle moves right and grows from the student-task values |

All projects intentionally omit edge tests, wrapping, and bouncing. A shape eventually leaving the canvas is expected; close the sketch and run it again.

## Verified environment

- Windows 11 x64
- BlueJ 6.0.0
- Processing 4.5.6
- `core-4.5.6.jar` loaded in BlueJ

## Run any example

1. Open the example folder as a BlueJ project.
2. Compile `CombinedSketch`.
3. Close the editor.
4. Right-click the `CombinedSketch` class tile.
5. Choose `void main(String[] args)` and click OK.
6. Compare the result with that project's README.

## Technical language

The projects use `vx` and `vy` for signed per-frame position changes. Their signs set direction; their absolute values are the speeds in pixels per frame. The `growth` field is the signed change in diameter per frame.
