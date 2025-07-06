package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteHalf: ImageVector
    get() {
        if (_MusicNoteHalf != null) {
            return _MusicNoteHalf!!
        }
        _MusicNoteHalf = ImageVector.Builder(
            name = "MusicNoteHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(13.56f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 17f)
                verticalLineTo(3f)
                moveTo(12f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.build()

        return _MusicNoteHalf!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteHalf: ImageVector? = null
