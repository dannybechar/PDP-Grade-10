# B3 — Interactivity and State

**Strategy document** | Unit B: Creative Programming | B3: Interactivity & State

## Purpose and sequence

B3 is the first Unit B sequence driven by live user input. It connects Processing event callbacks
to persistent state, then scales the same mechanism from one changing property to a complete
multi-scene flow and bounded controls.

| Learning statement | Hours | Lessons |
|---|---:|---:|
| B3.1 — Mouse and keyboard events | 3 | 3 |
| B3.2 — Program state | 2 | 2 |
| B3.3 — Multi-scene flow | 3 | 3 |
| B3.4 — User-controlled parameters | 2 | 2 |

## Cumulative model

```text
input event -> update persistent state -> draw() reads current state -> visible result
```

The same model supports a mouse-controlled size, a two-mode toggle, a scene transition, and a
button-driven parameter. Students repeatedly identify the input source, stored state, update
site, and rendering site.

## Technical baseline

- Processing lifecycle and event overrides are written with `public void` in the BlueJ
  `PApplet` subclass.
- Student-authored helper methods may omit an access modifier.
- `mouseX`, `mouseY`, `mousePressed`, `key`, and `keyPressed` are live Processing fields.
- `mousePressed()` and `keyPressed()` are callbacks. Parentheses distinguish the callback from
  the same-named held-state field.
- A held key may generate repeated `keyPressed()` callbacks because of operating-system key
  repeat; designs that require one deliberate action must account for that behaviour.
- A `draw()` method is retained so the running sketch can process input events and provide
  continuous visual feedback.
- Persistent state is represented by class-level fields accessible to both callbacks and
  `draw()`.

## State and control decisions

- Modes and scenes use `int` state plus named `final int` constants, avoiding Java String
  equality pitfalls.
- Student examples use explicit `if` statements. Compound `&&`/`||`, ternary expressions,
  `switch`, and `enum` remain outside the core sequence.
- Core keyboard work uses printable character keys through `key`. Coded-key handling is not
  required for the learning statement.
- Buttons are drawn rectangles plus coordinate hit tests; widget libraries are not introduced.
- Sliders are discussed as a possible control but not constructed within the two-hour B3.4
  allocation.

## Scope boundaries

Formal OOP, custom UI libraries, drag systems, elapsed-time state machines, complex key
combinations, collision systems, and collections of interactive objects remain outside B3. B4
adds collections after students can reason clearly about one element's input–state–render cycle.

## Assessment pattern

Every lesson includes event/state tracing, a guided modification, and an independent build.
Students explain when a callback runs, what state changes, and which later rendering decision
makes the change visible.

## Implementation status

Implemented in `01-mouse-events` through `10-mouse-regions-button`. All ten revised
presentations and thirty synchronized BlueJ projects are versioned in the repository. The
projects compile independently against Processing 4.5.6 and use explicit state/update structures
consistent with the scope above.

