package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DNozzleOff: ImageVector
    get() {
        if (_Printer3DNozzleOff != null) {
            return _Printer3DNozzleOff!!
        }
        _Printer3DNozzleOff = ImageVector.Builder(
            name = "Printer3DNozzleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(14f, 15.9f)
                lineTo(13f, 17f)
                horizontalLineTo(11f)
                lineTo(7.5f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(6.1f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(11f, 19f)
                curveTo(11f, 19.6f, 10.6f, 20f, 10f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                curveTo(11.7f, 22f, 13f, 20.7f, 13f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(19f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(3.8f)
                lineTo(16.2f, 13f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Printer3DNozzleOff!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DNozzleOff: ImageVector? = null
