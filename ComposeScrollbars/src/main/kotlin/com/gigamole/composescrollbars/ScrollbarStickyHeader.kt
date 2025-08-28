@file:Suppress("unused")

package com.gigamole.composescrollbars

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable

/**
 * Adds a sticky header to a [LazyListScope] that can be detected by [ScrollbarsState] to ensure proper scroll behavior.
 *
 * @param contentType Optional type of the content, used for optimization in Lazy lists.
 * @param content The composable content of the sticky header.
 */
fun LazyListScope.scrollbarStickyHeader(
    contentType: Any? = null,
    content: @Composable LazyItemScope.() -> Unit
) {
    @OptIn(ExperimentalFoundationApi::class)
    stickyHeader(key = "stickyHeader_${System.identityHashCode(content)}", contentType, content)
}