package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterOffOutline: ImageVector
    get() {
        if (_PrinterOffOutline != null) {
            return _PrinterOffOutline!!
        }
        _PrinterOffOutline = ImageVector.Builder(
            name = "PrinterOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.41f, 1.6f)
                lineTo(22.36f, 22.55f)
                lineTo(20.95f, 23.96f)
                lineTo(18f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 9.34f, 3.34f, 8f, 5f, 8f)
                lineTo(0f, 3f)
                lineTo(1.41f, 1.6f)
                moveTo(6f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                lineTo(7f, 10f)
                horizontalLineTo(5f)
                curveTo(4.45f, 10f, 4f, 10.45f, 4f, 11f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                moveTo(8f, 19f)
                horizontalLineTo(16f)
                lineTo(12f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                moveTo(8f, 5f)
                verticalLineTo(5.36f)
                lineTo(6f, 3.36f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                curveTo(20.66f, 8f, 22f, 9.34f, 22f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(19.66f)
                lineTo(15.66f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                lineTo(20f, 15f)
                verticalLineTo(11f)
                curveTo(20f, 10.45f, 19.55f, 10f, 19f, 10f)
                horizontalLineTo(12.66f)
                lineTo(10.66f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                moveTo(19f, 11.5f)
                curveTo(19f, 12.06f, 18.55f, 12.5f, 18f, 12.5f)
                curveTo(17.45f, 12.5f, 17f, 12.06f, 17f, 11.5f)
                curveTo(17f, 10.96f, 17.45f, 10.5f, 18f, 10.5f)
                curveTo(18.55f, 10.5f, 19f, 10.96f, 19f, 11.5f)
                close()
            }
        }.build()

        return _PrinterOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterOffOutline: ImageVector? = null
