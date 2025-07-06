package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NoteAlertOutline: ImageVector
    get() {
        if (_NoteAlertOutline != null) {
            return _NoteAlertOutline!!
        }
        _NoteAlertOutline = ImageVector.Builder(
            name = "NoteAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.1f, 1.89f, 21f, 3f, 21f)
                horizontalLineTo(17f)
                curveTo(18.11f, 21f, 19f, 20.11f, 19f, 19f)
                verticalLineTo(9f)
                lineTo(13f, 3f)
                horizontalLineTo(3f)
                moveTo(17f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(12f, 10f)
                verticalLineTo(4.5f)
                lineTo(17.5f, 10f)
                horizontalLineTo(12f)
                moveTo(23f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                moveTo(21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _NoteAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NoteAlertOutline: ImageVector? = null
