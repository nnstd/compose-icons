package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosOff: ImageVector
    get() {
        if (_PrinterPosOff != null) {
            return _PrinterPosOff!!
        }
        _PrinterPosOff = ImageVector.Builder(
            name = "PrinterPosOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.2f, 9f)
                lineTo(7.2f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                moveTo(20f, 16.8f)
                verticalLineTo(12f)
                curveTo(20f, 10.9f, 19.11f, 10f, 18f, 10f)
                horizontalLineTo(13.2f)
                lineTo(20f, 16.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.11f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(8.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PrinterPosOff!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosOff: ImageVector? = null
