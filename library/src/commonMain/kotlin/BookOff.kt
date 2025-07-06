package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOff: ImageVector
    get() {
        if (_BookOff != null) {
            return _BookOff!!
        }
        _BookOff = ImageVector.Builder(
            name = "BookOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.68f, 2.12f)
                lineTo(12f, 8.8f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(18.24f, 2f, 18.46f, 2.05f, 18.68f, 2.12f)
                moveTo(9.5f, 7.5f)
                lineTo(7f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(16.8f)
                lineTo(11.88f, 8.93f)
                lineTo(9.5f, 7.5f)
                moveTo(21.61f, 1.73f)
                lineTo(1.89f, 21.46f)
                lineTo(3.16f, 22.73f)
                lineTo(4.54f, 21.35f)
                curveTo(4.9f, 21.75f, 5.42f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(5.89f)
                lineTo(22.89f, 3f)
                lineTo(21.61f, 1.73f)
                close()
            }
        }.build()

        return _BookOff!!
    }

@Suppress("ObjectPropertyName")
private var _BookOff: ImageVector? = null
