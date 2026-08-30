# B2 — Parameterized and Procedural Creation

**Strategy document** | Unit B: Creative Programming | B2: Parameterized & Procedural Creation

## Purpose and sequence

B2 shifts familiar Algorithms mechanisms into visible creative work. Students are expected to
recognize Java-style methods, parameters, counted loops, `if`/`else`, and random-number concepts;
the unit does not restart those topics from first principles. Its new work is choosing how each
mechanism controls a generated visual result.

The ten 45-minute lessons follow the syllabus allocation:

| Learning statement | Hours | Lessons |
|---|---:|---:|
| B2.1 — Reusable visual functions | 3 | 3 |
| B2.2 — Repeated structures, grids, and patterns | 3 | 3 |
| B2.3 — Controlled randomness | 2 | 2 |
| B2.4 — Conditions for procedural variation | 2 | 2 |

## Cumulative progression

1. Package one visual responsibility in a named custom drawing method.
2. Parameterize position, then add another configurable property.
3. Call the same method from a counted loop.
4. Nest row and column loops to generate a grid.
5. Feed loop variables into visual parameters to create a systematic pattern.
6. Replace selected systematic values with bounded random values.
7. Regenerate and compare while naming what remains fixed.
8. Apply a simple condition to one generated value.
9. Compose methods, loops, randomness, and conditions without introducing a new mechanism.

## Technical baseline

- Processing runs as a Java library in BlueJ; `size()` remains in `settings()`.
- Lifecycle methods use `public void`; student-authored helper methods do not require `public`.
- Drawing primitives, grayscale/RGB style state, persistent fields, and frame behaviour carry
  forward from B1.
- `random(low, high)` returns a `float` and excludes the upper bound. Cast to `int` only where an
  integer value is required.
- Nested loops are applied explicitly for grids rather than assumed to be self-evident.
- Examples prefer direct arithmetic and single comparisons so the creative mechanism stays
  visible.

## Scope boundaries

- No re-teaching of basic loop, function, or conditional syntax.
- No mouse or keyboard interaction; B3 owns user input.
- No arrays, collections, or independently tracked elements; B4 owns those structures.
- No custom classes, constructors, generics, recursion, or formal object-oriented design.
- No transformation stack (`translate()`, `rotate()`, `pushMatrix()`, `popMatrix()`).
- No modulo, ternary expressions, or compound `&&`/`||` conditions in core student examples.
- Random drawings are generated once in `setup()` unless regeneration is an explicit user action;
  accidental per-frame flicker is not used as the model for B2.3.

## Assessment pattern

Every lesson combines retrieval, prediction or tracing, a guided modification, and an independent
construction. Students must explain which mechanism controls count, position, appearance, or
variation instead of treating a successful image as sufficient evidence.

## Implementation status

Implemented in `01-reusable-visual-components` through `10-combining-conditions`. All ten revised
presentations and thirty-two synchronized BlueJ projects are versioned in the repository. The
projects compile independently against Processing 4.5.6; B2.3's runnable examples generate stable
one-run results in `setup()`.

