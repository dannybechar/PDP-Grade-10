# B2.1.1 — Reusable Visual Components

This lesson introduces a new use for familiar Java method syntax: giving one multi-shape drawing responsibility a clear name. Students identify the statements that draw a flower, move them into `drawFlower()`, trace the method call, predict the effect of two identical calls, and independently refactor a balloon into `drawBalloon()`.

## Learning goals

Students will be able to:

- identify the statements that work together to draw one visual component;
- distinguish a method call from a method definition;
- move a drawing sequence into a named no-parameter method;
- place the helper method at class level rather than nesting it inside `draw()`;
- keep whole-frame work such as `background(255)` in `draw()`; and
- compile, run, and compare before and after versions to verify preserved behaviour.

## Lesson materials

- [`teacher/B2.1.1_Reusable_Visual_Components_Revised.pptx`](teacher/B2.1.1_Reusable_Visual_Components_Revised.pptx): 45-minute teacher deck with retrieval, modelling, tracing, BlueJ checkpoints, prediction, guided construction, verification, speaker notes, and appendices.
- [`examples`](examples): five runnable BlueJ projects matching every meaningful program state in the lesson.

## Example projects

| Project | Purpose | Expected result |
|---|---|---|
| `ComponentSketch_Inline` | Baseline inline flower | One fixed flower on a white 400 × 400 canvas |
| `ComponentSketch_Flower` | Flower packaged into `drawFlower()` | Same flower and canvas as the inline baseline |
| `ComponentSketch_DoubleCall` | Two calls with fixed coordinates | One visible flower because the two results overlap perfectly |
| `ComponentSketch_BalloonStarter` | Student refactor starting point | One inline gray balloon with a black string |
| `ComponentSketch_BalloonComplete` | Verified construct-task solution | Same balloon produced by `draw()` calling `drawBalloon()` |

## Run any example

1. Open the example folder as a BlueJ project.
2. Compile `ComponentSketch`.
3. Close the editor.
4. Right-click the `ComponentSketch` class tile.
5. Choose `void main(String[] args)` and click OK.
6. Compare the result with the project README and the lesson checkpoint.

