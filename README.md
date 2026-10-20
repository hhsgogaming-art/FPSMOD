# PulseFPS — Fabric 1.21.11

A conservative client-side Fabric mod project intended to build on GitHub Actions and coexist with Sodium.

## Build on GitHub (no local Java or Gradle needed)

1. Download this ZIP and extract it.
2. Create a new empty repository on GitHub.
3. Upload the **contents** of this folder to the repository root (not the containing folder).
4. Open the repository's **Actions** tab and enable Actions if prompted.
5. Push/commit the files. The workflow `.github/workflows/build.yml` runs automatically.
6. Open the completed workflow run, scroll to **Artifacts**, and download `PulseFPS-1.0.0`.
7. Extract the artifact ZIP. Put `pulsefps-1.0.0.jar` in your Fabric 1.21.11 instance's `mods` folder alongside Fabric Loader, Fabric API, and Sodium.

You can also click **Actions → Build PulseFPS → Run workflow** to start a build manually.

## Important scope notes

- This is a safe starter build with no renderer replacement and no combat/network/gameplay modifications.
- It does not force Vulkan. Minecraft 1.21.11 uses the OpenGL rendering path; a mod cannot add Vulkan driver support to unsupported hardware.
- It does not promise compatibility with literally every mod. It is deliberately small to minimize conflicts.
- The starter does not yet implement the full optimization feature set. A successful build only proves that the source compiles, not that it increases FPS on every system.

## Versions

- Minecraft: 1.21.11
- Java: 21
- Fabric Loader: 0.18.4
- Yarn mappings: 1.21.11+build.4
- Fabric API: 0.141.1+1.21.11
