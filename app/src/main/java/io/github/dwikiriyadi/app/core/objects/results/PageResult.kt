package io.github.dwikiriyadi.app.core.objects.results

data class PageResult(
    val id: Long,
    val sectionId: Long,
    val title: String,
    val content: String
)