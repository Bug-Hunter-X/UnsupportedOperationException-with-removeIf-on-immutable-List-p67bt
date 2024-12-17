# Kotlin: UnsupportedOperationException with removeIf on immutable List

This repository demonstrates a common Kotlin error: attempting to modify an immutable list using `removeIf` or `removeAll`.  The `removeIf` and `removeAll` functions are designed to work with mutable lists (created with `mutableListOf`). Applying them to an immutable list (created with `listOf`) results in an `UnsupportedOperationException`.

The example showcases the correct usage with mutable lists and the error caused by using it with an immutable list.  The solution provides an alternative approach for handling this scenario with immutable lists.  This example highlights the importance of understanding the difference between mutable and immutable collections in Kotlin.