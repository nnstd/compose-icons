package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosStopOutline: ImageVector
    get() {
        if (_PrinterPosStopOutline != null) {
            return _PrinterPosStopOutline!!
        }
        _PrinterPosStopOutline = ImageVector.Builder(
            name = "PrinterPosStopOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(13.09f)
                curveTo(18.33f, 13.04f, 18.66f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(12f)
                curveTo(20f, 10.9f, 19.11f, 10f, 18f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                curveTo(13f, 18.3f, 13.13f, 17.63f, 13.35f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(22f, 16f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _PrinterPosStopOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosStopOutline: ImageVector? = null
