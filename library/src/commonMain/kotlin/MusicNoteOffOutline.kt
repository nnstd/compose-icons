package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteOffOutline: ImageVector
    get() {
        if (_MusicNoteOffOutline != null) {
            return _MusicNoteOffOutline!!
        }
        _MusicNoteOffOutline = ImageVector.Builder(
            name = "MusicNoteOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(7.61f)
                lineTo(14f, 9.61f)
                moveTo(12f, 10.44f)
                lineTo(4.41f, 2.86f)
                lineTo(3f, 4.27f)
                lineTo(12f, 13.27f)
                verticalLineTo(13.55f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 13.23f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.65f, 20.95f)
                arcTo(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.85f)
                verticalLineTo(15.27f)
                lineTo(19.73f, 21f)
                lineTo(21.14f, 19.59f)
                moveTo(10f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                close()
            }
        }.build()

        return _MusicNoteOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteOffOutline: ImageVector? = null
