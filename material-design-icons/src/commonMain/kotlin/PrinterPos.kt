package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPos: ImageVector
    get() {
        if (_PrinterPos != null) {
            return _PrinterPos!!
        }
        _PrinterPos = ImageVector.Builder(
            name = "PrinterPos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                moveTo(18f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PrinterPos!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPos: ImageVector? = null
