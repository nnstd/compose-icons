package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteEighthDotted: ImageVector
    get() {
        if (_MusicNoteEighthDotted != null) {
            return _MusicNoteEighthDotted!!
        }
        _MusicNoteEighthDotted = ImageVector.Builder(
            name = "MusicNoteEighthDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                verticalLineTo(13.55f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                moveTo(16.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 20f)
                close()
            }
        }.build()

        return _MusicNoteEighthDotted!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteEighthDotted: ImageVector? = null
