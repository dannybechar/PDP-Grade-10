# Teacher Runbook — First 45 Minutes

## Session outcome

Every student leaves with BlueJ and Processing connected, a sketch that runs, and evidence that changing source code changes program behaviour.

## Before every new class

- [ ] Confirm the lesson computer or projector runs BlueJ 6.0.0 and Processing 4.5.6.
- [ ] Confirm the official download sites are reachable from the school network.
- [ ] Know whether students can install software or need an approved administrator process.
- [ ] Open the starter project from a clean folder, compile it, and run it.
- [ ] Confirm `core-4.5.6.jar` appears as `(Loaded)` after restarting BlueJ.
- [ ] Keep the starter project available locally in case GitHub is blocked.
- [ ] On macOS, test the route on each processor family that students will use before class.

Do not distribute Processing installers or JAR files through this repository. Use official downloads and keep the tested version visible in the lesson materials.

## 45-minute teaching sequence

| Time | Teacher action | Student evidence |
|---|---|---|
| 0–5 min | State the finish line and identify each computer | OS and processor type recorded |
| 5–12 min | Guide the BlueJ download, installation, and version check | BlueJ 6.0.0 opens |
| 12–19 min | Guide the Processing installation and first launch | Processing editor opens |
| 19–28 min | Add the Processing core JAR and restart BlueJ | Library shows `(Loaded)` |
| 28–35 min | Open the starter project and compile | No syntax errors |
| 35–40 min | Run `main` and move the mouse | Orange circle follows the mouse |
| 40–44 min | Change the diameter from 60 to 120 | Circle visibly doubles in width |
| 44–45 min | Check the exit condition | Student demonstrates the result |

If installation delays threaten the programming cycle, pair the affected student with a working computer and record the machine for follow-up. The class should still experience edit → compile → run → observe.

## Checkpoints and decisions

### BlueJ does not open

1. Confirm the installer matched the operating system and processor.
2. On Windows, confirm the computer is 64-bit.
3. On macOS, confirm the correct Apple-silicon or Intel package was used.
4. Escalate permission restrictions rather than repeatedly reinstalling.

### Processing does not open

1. Confirm it came from the official download page.
2. On macOS, confirm Processing was moved into Applications.
3. Record any operating-system security message before changing settings.

### The JAR is not loaded

1. Click OK to save the library preference.
2. Close every BlueJ window.
3. Reopen BlueJ and check again.
4. If it still fails, remove the entry and select the exact core JAR again.

### The code compiles but no sketch appears

1. Confirm the student selected `void main(String[] args)`.
2. Accept the unchanged argument and click OK.
3. Look behind BlueJ or use the operating-system task switcher.
4. Close any previous sketch window before rerunning.

## Success criteria

A student is ready when they can show all three pieces of evidence:

1. `core-4.5.6.jar (Loaded)` in BlueJ.
2. `Class compiled — no syntax errors` for `FirstSketch`.
3. A moving orange circle whose diameter changes from 60 to 120 after recompilation.

## Platform verification record

| Platform | Status | Notes |
|---|---|---|
| Windows 11 x64 | Verified 25 August 2026 | BlueJ 6.0.0 and Processing 4.5.6 |
| macOS Apple silicon | Pending physical preflight | Official BlueJ package is processor-specific |
| macOS Intel | Pending physical preflight | Use the separate Intel BlueJ package |

## Official references

- [BlueJ download page and current platform requirements](https://www.bluej.org/)
- [BlueJ version history](https://www.bluej.org/versions.html)
- [Processing getting-started guide](https://processing.org/tutorials/gettingstarted/)
- [Processing download page](https://processing.org/download/)

