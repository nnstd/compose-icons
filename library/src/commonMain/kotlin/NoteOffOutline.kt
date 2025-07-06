package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteOffOutline: ImageVector
    get() {
        if (_NoteOffOutline != null) {
            return _NoteOffOutline!!
        }
        _NoteOffOutline = ImageVector.Builder(
            name = "NoteOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                verticalLineTo(8.8f)
                lineTo(15.2f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(21f, 17.8f)
                verticalLineTo(9f)
                lineTo(15f, 3f)
                horizontalLineTo(6.2f)
                lineTo(8.2f, 5f)
                horizontalLineTo(12f)
                moveTo(14f, 4.5f)
                lineTo(19.5f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(4.5f)
                moveTo(20.7f, 20.05f)
                lineTo(20.7f, 20.04f)
                lineTo(19f, 18.34f)
                verticalLineTo(18.35f)
                lineTo(12.66f, 12f)
                horizontalLineTo(12.66f)
                lineTo(12f, 11.34f)
                verticalLineTo(11.35f)
                lineTo(6.14f, 5.5f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.9f)
                curveTo(3f, 4.93f, 3f, 4.97f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.03f, 21f, 19.07f, 21f, 19.1f, 21f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.7f, 20.05f)
                moveTo(5f, 19f)
                verticalLineTo(6.89f)
                lineTo(17.11f, 19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _NoteOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteOffOutline: ImageVector? = null
