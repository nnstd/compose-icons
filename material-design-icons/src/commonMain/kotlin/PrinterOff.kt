package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterOff: ImageVector
    get() {
        if (_PrinterOff != null) {
            return _PrinterOff!!
        }
        _PrinterOff = ImageVector.Builder(
            name = "PrinterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                verticalLineTo(4.18f)
                lineTo(8.82f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                moveTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                lineTo(4.75f, 8f)
                curveTo(3.19f, 8.15f, 2f, 9.44f, 2f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(17.73f)
                lineTo(19.73f, 23f)
                lineTo(21f, 21.72f)
                lineTo(2.28f, 3f)
                moveTo(9.82f, 8f)
                lineTo(18.82f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                horizontalLineTo(9.82f)
                moveTo(19f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                moveTo(8f, 14f)
                horizontalLineTo(10.73f)
                lineTo(15.73f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _PrinterOff!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterOff: ImageVector? = null
