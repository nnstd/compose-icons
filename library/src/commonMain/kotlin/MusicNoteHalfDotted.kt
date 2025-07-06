package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteHalfDotted: ImageVector
    get() {
        if (_MusicNoteHalfDotted != null) {
            return _MusicNoteHalfDotted!!
        }
        _MusicNoteHalfDotted = ImageVector.Builder(
            name = "MusicNoteHalfDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(13.56f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 17f)
                verticalLineTo(3f)
                moveTo(10f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                moveTo(16.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 20f)
                close()
            }
        }.build()

        return _MusicNoteHalfDotted!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteHalfDotted: ImageVector? = null
