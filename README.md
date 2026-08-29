# PDP Grade 10

This repository is the source of truth for working examples and teaching resources for the Grade 10 PDP course.

## Current unit

### Unit B1 — The Draw Loop & Creative Environment

The onboarding package is complete and contains:

- A 45-minute teacher presentation for installing and connecting BlueJ and Processing.
- A student setup checklist for Windows and macOS.
- A teacher runbook with timings, checkpoints, and recovery guidance.
- Starter and complete versions of the first verified BlueJ project.

The first programming lesson is also available:

- [`B1.1.1 — Canvas & Coordinate System`](units/unit-b1-draw-loop-creative-environment/01-canvas-coordinates)
- Four runnable BlueJ projects covering every code example in the lesson.

The second programming lesson is available:

- [`B1.1.2 — Setup vs. Continuous Draw`](units/unit-b1-draw-loop-creative-environment/02-setup-draw)
- Five runnable BlueJ projects covering the lesson shell, three checkpoints, and the optional motion demonstration.

The third programming lesson is available:

- [`B1.2.1 — Shapes & Geometry`](units/unit-b1-draw-loop-creative-environment/03-shapes-geometry)
- Six runnable BlueJ projects covering the lesson shell, shape comparisons, checkpoints, prediction task, and final construction.

The fourth programming lesson is available:

- [`B1.2.2 — Color, Stroke & Fill`](units/unit-b1-draw-loop-creative-environment/04-color-stroke-fill)
- Eight runnable BlueJ projects covering style controls, persistent drawing state, grayscale and RGB, omission commands, prediction, and final construction.

The fifth programming lesson is available:

- [`B1.3.1 — Frame-by-Frame Change`](units/unit-b1-draw-loop-creative-environment/05-frame-by-frame-change)
- Six runnable BlueJ projects covering the verified shell, repeated static drawing, local reset, persistent state, slow frame tracing, and the final growing-circle construction.

The sixth programming lesson is available:

- [`B1.3.2 — Velocity-Style Movement`](units/unit-b1-draw-loop-creative-environment/06-velocity-style-movement)
- Six runnable BlueJ projects covering the verified shell, cumulative trails, clean frame clearing, signed horizontal and vertical movement, and the final construction.

The seventh programming lesson is available:

- [`B1.3.3 — Combining & Practicing`](units/unit-b1-draw-loop-creative-environment/07-combining-practicing)
- Six runnable BlueJ projects covering the verified shell, movement retrieval, move-and-grow, diagonal motion, a prediction check, and the final combined construction.

The eighth programming lesson is available:

- [`B1.4 — Read, Trace & Deliberately Modify`](units/unit-b1-draw-loop-creative-environment/08-read-trace-modify)
- Five runnable BlueJ projects covering the verified shell, two unfamiliar sketches, a local-style modification, and a signed-velocity modification.

Open [`units/unit-b1-draw-loop-creative-environment/00-onboarding`](units/unit-b1-draw-loop-creative-environment/00-onboarding) to begin.

### Unit B2 — Parameterized & Procedural Creation

The complete Unit B2 lesson sequence is available:

- [`B2.1.1 — Reusable Visual Components`](units/unit-b2-parameterized-procedural-creation/01-reusable-visual-components)
- Five runnable BlueJ projects covering the inline baseline, packaged flower, overlapping duplicate calls, balloon starter, and completed refactor.
- Nine further lessons develop position and size parameters, loops, grids, procedural rules, controlled randomness, regeneration, and conditions.
- Each lesson includes a revised presentation with teacher notes and three synchronized runnable BlueJ projects.

See the complete lesson sequence in [`course-map.md`](course-map.md).

### Unit B3 — Interactivity & State

The complete Unit B3 lesson sequence is available:

- Ten revised presentations develop mouse and keyboard events, persistent state, named scenes, guarded scene transitions, bounded key controls, and mouse-region buttons.
- Each lesson includes detailed teacher notes and three synchronized runnable BlueJ projects.

Start with [`B3.1.1 — Mouse Events`](units/unit-b3-interactivity-state/01-mouse-events), or see the complete sequence in [`course-map.md`](course-map.md).

## Verified environment

| Item | Verified value |
|---|---|
| Operating system | Windows 11, 64-bit, x64 processor |
| BlueJ | 6.0.0 |
| Processing | 4.5.6 |
| Processing library | `core-4.5.6.jar` shown as `(Loaded)` in BlueJ |
| Verification date | 25 August 2026 |

The macOS route follows the official BlueJ and Processing installation guidance, but still requires a real-Mac classroom preflight.

## Repository conventions

- Every program must compile before it is committed.
- Every classroom example should include a `Starter` and `Complete` BlueJ project when students are expected to modify code.
- Each example must document how to run it and what should appear.
- Generated BlueJ files such as `.class` and `.ctxt` are not committed.
- Processing JAR files and software installers are not stored here; use the official download sites.
- Never commit student information, passwords, tokens, or private school data.

## Course workflow

1. Open the lesson folder.
2. Read the example instructions.
3. Open the project in BlueJ.
4. Compile and run it.
5. Compare the result with the stated success criteria.
6. Commit only after the example has been verified.
