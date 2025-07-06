package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteOutline: ImageVector
    get() {
        if (_MusicNoteOutline != null) {
            return _MusicNoteOutline!!
        }
        _MusicNoteOutline = ImageVector.Builder(
            name = "MusicNoteOutline",
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
                moveTo(10f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                close()
            }
        }.build()

        return _MusicNoteOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteOutline: ImageVector? = null
