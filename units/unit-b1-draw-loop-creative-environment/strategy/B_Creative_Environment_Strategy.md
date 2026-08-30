# B1 — Creative Environment and Unit Orientation

**Strategy document** | Unit B: Creative Programming | B1: The Draw Loop & Creative Environment

## Position and purpose

This orientation precedes B1.1. It establishes the tools, vocabulary, and working routine used
throughout Unit B without consuming time from B1's eight syllabus hours. Students encounter the
complete Processing-in-BlueJ class template, but the wrapper is treated as launcher code to
recognize and use rather than as an introduction to object-oriented programming.

The central workflow is:

```text
Edit -> Compile -> Run -> Observe
```

Students also see the B1–B5 progression: draw-loop foundations, procedural creation,
interactivity and state, collections and interaction, then design process and capstone work.

## Learning objectives

Students should be able to:

- Distinguish the Algorithms unit's problem-solving emphasis from Unit B's visible creative
  outcomes.
- Explain the different roles of Processing and BlueJ in this course.
- Open a BlueJ project, identify its class, compile it, and run `main(String[] args)`.
- Recognize `settings()`, `setup()`, and `draw()` and state when each is called.
- Modify one supplied value, recompile, rerun, and verify the visible effect.

## Technical baseline

- The verified classroom environment is BlueJ 6.0.0 with Processing 4.5.6.
- The Processing library is loaded from `core-4.5.6.jar`.
- The supplied class extends `PApplet` and includes a `main()` launcher.
- In this external-Java configuration, canvas configuration is placed in `settings()`.
- `settings()` runs first for window configuration, `setup()` performs one-time initialization,
  and `draw()` repeats by default.
- Lifecycle methods are shown with `public void`; formal inheritance terminology remains out of
  scope.

## Lesson flow

1. Introduce creative programming and the Unit B roadmap.
2. Separate the roles of the Processing library and the BlueJ development environment.
3. Walk through project, class, compile, and run.
4. Read the complete template without unpacking its object-oriented implementation.
5. Run the supplied sketch and change its canvas dimensions.
6. Verify the change and complete a short tool-and-lifecycle check.

## Readiness evidence

A student is ready for B1.1 when BlueJ shows the Processing JAR as loaded, the supplied project
compiles, the sketch opens at the expected dimensions, and a deliberate value change produces the
predicted result after recompilation.

## Scope boundaries

Coordinates, drawing primitives, style commands, persistent motion variables, and independent
code tracing are introduced in B1.1–B1.4. This lesson names the lifecycle and the course roadmap;
it does not duplicate those later mechanisms.

## Implementation status

Implemented in `00-onboarding`. The revised orientation presentation, teacher runbook, and
student setup checklist target the verified environment. Both supplied BlueJ projects compile
against Processing 4.5.6. The former `size()`-in-`setup()` follow-up is complete: the onboarding
and B1.1 materials consistently use `settings()`.

