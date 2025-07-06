package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SerialPort: ImageVector
    get() {
        if (_SerialPort != null) {
            return _SerialPort!!
        }
        _SerialPort = ImageVector.Builder(
            name = "SerialPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                moveTo(17f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SerialPort!!
    }

@Suppress("ObjectPropertyName")
private var _SerialPort: ImageVector? = null
