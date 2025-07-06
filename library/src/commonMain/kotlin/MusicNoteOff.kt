package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteOff: ImageVector
    get() {
        if (_MusicNoteOff != null) {
            return _MusicNoteOff!!
        }
        _MusicNoteOff = ImageVector.Builder(
            name = "MusicNoteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineTo(12f, 13.27f)
                verticalLineTo(13.55f)
                curveTo(11.41f, 13.21f, 10.73f, 13f, 10f, 13f)
                curveTo(7.79f, 13f, 6f, 14.79f, 6f, 17f)
                reflectiveCurveTo(7.79f, 21f, 10f, 21f)
                reflectiveCurveTo(14f, 19.21f, 14f, 17f)
                verticalLineTo(15.27f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                moveTo(14f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(8.18f)
                lineTo(14f, 10.18f)
                close()
            }
        }.build()

        return _MusicNoteOff!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteOff: ImageVector? = null
