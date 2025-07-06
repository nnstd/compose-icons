package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteQuarterDotted: ImageVector
    get() {
        if (_MusicNoteQuarterDotted != null) {
            return _MusicNoteQuarterDotted!!
        }
        _MusicNoteQuarterDotted = ImageVector.Builder(
            name = "MusicNoteQuarterDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                verticalLineTo(13.56f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 17f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                moveTo(16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                close()
            }
        }.build()

        return _MusicNoteQuarterDotted!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteQuarterDotted: ImageVector? = null
