package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterEye: ImageVector
    get() {
        if (_PrinterEye != null) {
            return _PrinterEye!!
        }
        _PrinterEye = ImageVector.Builder(
            name = "PrinterEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.8f, 21f)
                curveTo(9.6f, 20.6f, 9.3f, 20.2f, 9.2f, 19.7f)
                lineTo(8.8f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                curveTo(14.2f, 13.4f, 15.6f, 13f, 17f, 13f)
                curveTo(18.9f, 13f, 20.6f, 13.6f, 22f, 14.6f)
                verticalLineTo(11f)
                curveTo(22f, 9.3f, 20.7f, 8f, 19f, 8f)
                horizontalLineTo(5f)
                curveTo(3.3f, 8f, 2f, 9.3f, 2f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(9.8f)
                moveTo(19f, 10f)
                curveTo(19.6f, 10f, 20f, 10.4f, 20f, 11f)
                reflectiveCurveTo(19.6f, 12f, 19f, 12f)
                reflectiveCurveTo(18f, 11.6f, 18f, 11f)
                reflectiveCurveTo(18.4f, 10f, 19f, 10f)
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(17f, 18f)
                curveTo(17.6f, 18f, 18f, 18.4f, 18f, 19f)
                reflectiveCurveTo(17.6f, 20f, 17f, 20f)
                reflectiveCurveTo(16f, 19.6f, 16f, 19f)
                reflectiveCurveTo(16.4f, 18f, 17f, 18f)
                moveTo(17f, 15f)
                curveTo(14.3f, 15f, 11.9f, 16.7f, 11f, 19f)
                curveTo(11.9f, 21.3f, 14.3f, 23f, 17f, 23f)
                reflectiveCurveTo(22.1f, 21.3f, 23f, 19f)
                curveTo(22.1f, 16.7f, 19.7f, 15f, 17f, 15f)
                moveTo(17f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19f)
                reflectiveCurveTo(15.6f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19f)
                reflectiveCurveTo(18.4f, 21.5f, 17f, 21.5f)
                close()
            }
        }.build()

        return _PrinterEye!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterEye: ImageVector? = null
