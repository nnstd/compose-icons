package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosPlay: ImageVector
    get() {
        if (_PrinterPosPlay != null) {
            return _PrinterPosPlay!!
        }
        _PrinterPosPlay = ImageVector.Builder(
            name = "PrinterPosPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13.09f)
                verticalLineTo(12f)
                curveTo(20f, 10.9f, 19.11f, 10f, 18f, 10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                moveTo(10f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(22f, 19f)
                lineTo(17f, 22f)
                verticalLineTo(16f)
                lineTo(22f, 19f)
                close()
            }
        }.build()

        return _PrinterPosPlay!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosPlay: ImageVector? = null
