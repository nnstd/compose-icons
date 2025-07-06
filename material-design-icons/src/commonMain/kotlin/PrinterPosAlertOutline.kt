package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosAlertOutline: ImageVector
    get() {
        if (_PrinterPosAlertOutline != null) {
            return _PrinterPosAlertOutline!!
        }
        _PrinterPosAlertOutline = ImageVector.Builder(
            name = "PrinterPosAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                moveTo(18f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                curveTo(2f, 10.9f, 2.9f, 10f, 4f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                curveTo(17.11f, 10f, 18f, 10.9f, 18f, 12f)
                moveTo(7f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                moveTo(16f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _PrinterPosAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosAlertOutline: ImageVector? = null
