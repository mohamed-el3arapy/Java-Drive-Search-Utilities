# 🔍 Java Drive Search Utilities

A lightweight collection of Java command-line applications for searching files and file contents across local drives using recursive directory traversal.

This project demonstrates practical usage of Java's `File` API, recursion, and console-based input handling to perform efficient file system searches.

---

## 🚀 Quick Access

- 📄 **[`ContentSearcher.java`](./Programs/ContentSearcher.java)** — Search for a specific word inside files.
- 📄 **[`DriveSearcher.java`](./Programs/DriveSearcher.java)** — Search for a file by its exact name.

---

## 📌 Overview

This repository contains two standalone Java applications.

| Program | Description |
|----------|-------------|
| **[`ContentSearcher.java`](./Programs/ContentSearcher.java)** | Recursively scans a drive and searches for a specific word inside files. |
| **[`DriveSearcher.java`](./Programs/DriveSearcher.java)** | Recursively scans a drive and searches for a file by its exact name. |

---

## 📂 Project Structure

```
Java-Drive-Search-Utilities/
│
├── 📄 ContentSearcher.java
├── 📄 DriveSearcher.java
└── 📄 README.md
```

---

## ✨ Features

- Recursive directory traversal
- Search by exact file name
- Search inside file contents
- Case-insensitive search
- Absolute path output
- Command-line interface
- Lightweight and easy to understand
- No external libraries required

---

## ⚙️ Technologies Used

- Java
- Java IO (`java.io.File`)
- Scanner API
- Recursion
- Depth-First Search (DFS)

---

# 📖 Programs

## 📄 [`ContentSearcher.java`](./ContentSearcher.java)

Searches for a specific word inside files located on a selected drive.

### Input

```
Word
Drive Letter
```

### Example

```
Enter word:
java

Enter drive:
D
```

### Output

```
D:\Projects\Notes.txt
D:\Books\JavaGuide.txt
```

---

## 📄 [`DriveSearcher.java`](./DriveSearcher.java)

Searches for a file using its exact name.

### Input

```
File Name
Drive Letter
```

### Example

```
Enter file name:
Resume.pdf

Enter drive:
C
```

### Output

```
File found:
C:\Users\Mohamed\Documents\Resume.pdf
```

If the file cannot be found:

```
File does not exist
```

---

## 🔄 Search Algorithm

Both applications use recursive directory traversal (Depth-First Search).

```
Drive
│
├── Folder
│   ├── Folder
│   ├── Folder
│   └── File
│
├── Folder
│   └── File
│
└── ...
```

Every accessible directory is visited until the entire drive has been scanned.

---

## 💡 Concepts Demonstrated

- Recursive Algorithms
- File System Traversal
- Java File API
- Console Applications
- User Input Handling
- Directory Processing
- Depth-First Search (DFS)

---

## ▶️ Getting Started

### Compile

```bash
javac ContentSearcher.java
javac DriveSearcher.java
```

### Run

Content Search

```bash
java ContentSearcher
```

File Search

```bash
java DriveSearcher
```

---
## ⚡ Benchmark

The following benchmark was performed using **DriveSearcher** on a local Windows machine.

| Scenario | Drive | Files Scanned | Execution Time |
|----------|:-----:|--------------:|---------------:|
| Existing File | G: | 197,885 | 4.166 s |
| Non-existing File | G: | 197,885 | 4.230 s |

### Test Environment

- Operating System: Windows
- Search Method: Recursive Depth-First Search (DFS)
- Search Scope: Entire `G:/` drive

> **Note:** Benchmark values were collected from actual execution on the author's local machine. Results may vary depending on hardware specifications, storage type, operating system, and the number of files stored on the selected drive.


---
## ⚠️ Notes

- Searches are case-insensitive.
- Some protected system folders may be skipped because of operating system permissions.
- Search time depends on the size of the selected drive.
- The content search is intended for readable text-based files.

---

## 📈 Future Improvements

- Multi-threaded search
- File extension filtering
- Regular expression support
- Search multiple drives simultaneously
- Export search results to a text file
- Progress indicator
- Graphical User Interface (JavaFX)
