package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterWireless: ImageVector
    get() {
        if (_PrinterWireless != null) {
            return _PrinterWireless!!
        }
        _PrinterWireless = ImageVector.Builder(
            name = "PrinterWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.93f, 3.92f)
                lineTo(6.34f, 5.33f)
                curveTo(9.46f, 2.2f, 14.53f, 2.2f, 17.66f, 5.33f)
                lineTo(19.07f, 3.92f)
                curveTo(15.17f, 0f, 8.84f, 0f, 4.93f, 3.92f)
                moveTo(7.76f, 6.75f)
                lineTo(9.17f, 8.16f)
                curveTo(10.73f, 6.6f, 13.26f, 6.6f, 14.83f, 8.16f)
                lineTo(16.24f, 6.75f)
                curveTo(13.9f, 4.41f, 10.1f, 4.41f, 7.76f, 6.75f)
                moveTo(19f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(19f, 10f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                close()
            }
        }.build()

        return _PrinterWireless!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterWireless: ImageVector? = null
