# Student Setup Checklist

Use this checklist during the first 45 minutes of Unit B1. Stop and ask the teacher as soon as a checkpoint fails.

## 1. Identify your computer

### Windows

- [ ] Press **Windows + I**.
- [ ] Open **System → About**.
- [ ] Confirm **64-bit operating system**.
- [ ] Tell the teacher whether the processor is x64-based.

### macOS

- [ ] Open **Apple menu → About This Mac**.
- [ ] Record the macOS version.
- [ ] Record whether the chip is **Apple silicon** or the processor is **Intel**.
- [ ] Confirm with the teacher that you selected the matching BlueJ download.

## 2. Install and open BlueJ

- [ ] Download BlueJ only from [bluej.org](https://www.bluej.org/).
- [ ] Install BlueJ using the matching Windows, Apple-silicon, or Intel package.
- [ ] Open BlueJ.
- [ ] Choose **Help → About BlueJ**.
- [ ] Confirm version **6.0.0**.

**Checkpoint 1:** BlueJ opens and shows version 6.0.0.

## 3. Install and open Processing

- [ ] Download Processing only from [processing.org/download](https://processing.org/download/).
- [ ] Windows: run the `.msi` installer.
- [ ] macOS: open the `.dmg` and drag Processing into **Applications**.
- [ ] Open Processing once.
- [ ] Close Processing after its editor appears.

**Checkpoint 2:** Processing opens correctly.

## 4. Connect Processing to BlueJ

1. In BlueJ, open **Tools → Preferences → Libraries**.
2. Click **Add File**.
3. Select the Processing core JAR.

### Windows path

```text
C:\Program Files\Processing\app\resources\core\library\core-4.5.6.jar
```

### macOS path

1. Open **Applications** in Finder.
2. Control-click `Processing.app` and choose **Show Package Contents**.
3. Open `Contents/app/resources/core/library`.
4. Select `core-4.5.6.jar`.

Do not select a native or OpenGL JAR.

- [ ] Click **OK** in Preferences.
- [ ] Close BlueJ completely.
- [ ] Reopen BlueJ.
- [ ] Return to **Preferences → Libraries**.
- [ ] Confirm the JAR ends with **`(Loaded)`**.

**Checkpoint 3:** `core-4.5.6.jar (Loaded)` appears.

## 5. Open and run the first program

1. Open `examples/FirstSketch_Starter` as a BlueJ project.
2. Click **Compile**.
3. Confirm **Class compiled — no syntax errors**.
4. Right-click `FirstSketch`.
5. Choose `void main(String[] args)`.
6. Leave the argument unchanged and click **OK**.
7. Move the mouse inside the sketch window.

**Checkpoint 4:** A 400 × 400 dark window opens and an orange circle follows the mouse.

## 6. Prove that your edit controls the program

Find this line:

```java
circle(mouseX, mouseY, 60);
```

Change only `60` to `120`, then compile and run again.

```java
circle(mouseX, mouseY, 120);
```

**Final checkpoint:** The circle becomes twice as wide. Show the result to the teacher.

## Quick troubleshooting

- **The library says `(Not loaded)`:** click OK, close BlueJ completely, reopen it, and check again.
- **`processing.core` cannot be found:** confirm the selected file is exactly `core-4.5.6.jar` and that it says `(Loaded)`.
- **The sketch does not open:** run `void main(String[] args)`, accept the unchanged argument, and look behind BlueJ for the sketch window.
- **The change is not visible:** compile again before rerunning.

