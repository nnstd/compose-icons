package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteOff: ImageVector
    get() {
        if (_NoteOff != null) {
            return _NoteOff!!
        }
        _NoteOff = ImageVector.Builder(
            name = "NoteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21f)
                curveTo(19.07f, 21f, 19.03f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.97f, 3f, 4.93f, 3f, 4.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(20.7f, 20.04f)
                lineTo(20.7f, 20.05f)
                lineTo(22.11f, 21.46f)
                moveTo(21f, 17.8f)
                lineTo(6.2f, 3f)
                horizontalLineTo(15f)
                lineTo(21f, 9f)
                verticalLineTo(17.8f)
                moveTo(19.5f, 10f)
                lineTo(14f, 4.5f)
                verticalLineTo(10f)
                horizontalLineTo(19.5f)
                close()
            }
        }.build()

        return _NoteOff!!
    }

@Suppress("ObjectPropertyName")
private var _NoteOff: ImageVector? = null
