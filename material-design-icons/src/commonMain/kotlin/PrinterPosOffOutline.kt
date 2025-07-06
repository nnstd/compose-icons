package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosOffOutline: ImageVector
    get() {
        if (_PrinterPosOffOutline != null) {
            return _PrinterPosOffOutline!!
        }
        _PrinterPosOffOutline = ImageVector.Builder(
            name = "PrinterPosOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(7f, 8.89f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(17.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(6f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(10.11f)
                lineTo(15.11f, 17f)
                horizontalLineTo(6f)
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                curveTo(19.11f, 10f, 20f, 10.9f, 20f, 12f)
                verticalLineTo(16.8f)
                lineTo(18f, 14.8f)
                verticalLineTo(12f)
                horizontalLineTo(15.2f)
                lineTo(13.2f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                moveTo(7f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _PrinterPosOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosOffOutline: ImageVector? = null
