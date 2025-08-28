@file:Suppress("unused")

package com.gigamole.composescrollbars

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable

fun LazyListScope.scrollBarStickyHeader(
    contentType: Any? = null,
    content: @Composable LazyItemScope.() -> Unit
) {
    @OptIn(ExperimentalFoundationApi::class)
    stickyHeader(key = "stickyHeader_${System.identityHashCode(content)}", contentType, content)
}