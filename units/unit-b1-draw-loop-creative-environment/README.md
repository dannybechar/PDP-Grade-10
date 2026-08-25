# Unit B1 — The Draw Loop & Creative Environment

Unit B1 introduces the creative-coding environment and the programming cycle students will use throughout the unit:

> Edit → Compile → Run → Observe

## Contents

- [`00-onboarding`](00-onboarding): install BlueJ and Processing, connect the Processing core library, and run the first verified sketch.
- [`01-canvas-coordinates`](01-canvas-coordinates): create a canvas, read screen coordinates, predict positions, and place circles precisely.
- [`02-setup-draw`](02-setup-draw): compare code that runs once with code that runs every frame by building a static sketch, a mouse trail, and a clean mouse follower.
- [`03-shapes-geometry`](03-shapes-geometry): translate geometric specifications into `rect()`, `ellipse()`, and `line()` calls, predict their placement, and verify the result in BlueJ.
- [`04-color-stroke-fill`](04-color-stroke-fill): control fill, outline colour, and stroke weight; trace persistent style state; and use `noFill()` and `noStroke()` deliberately.
- [`05-frame-by-frame-change`](05-frame-by-frame-change): update a value inside `draw()`, contrast local and class-level variables, trace values across frames, and build a growing circle.
- [`06-velocity-style-movement`](06-velocity-style-movement): update position with signed per-frame velocity, predict direction and coordinates, compare trails with clean frame clearing, and build steady movement.
- [`07-combining-practicing`](07-combining-practicing): combine multiple persistent properties, trace simultaneous changes, compare move-and-grow with diagonal movement, and build one sketch that changes in two ways.
- [`08-read-trace-modify`](08-read-trace-modify): read unfamiliar program structure, classify fields and local variables, trace updates in execution order, predict visible behaviour, and verify deliberate one-value modifications.

## Definition of ready

A student is ready for the first programming lesson when all of the following are true:

- BlueJ opens and reports version 6.0.0.
- Processing opens successfully.
- BlueJ lists `core-4.5.6.jar` as `(Loaded)` after a restart.
- `FirstSketch` compiles without syntax errors.
- The sketch opens in a 400 × 400 window.
- The orange circle follows the mouse.
- Changing its diameter from 60 to 120 changes the running program.
