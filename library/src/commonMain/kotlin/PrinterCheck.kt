package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterCheck: ImageVector
    get() {
        if (_PrinterCheck != null) {
            return _PrinterCheck!!
        }
        _PrinterCheck = ImageVector.Builder(
            name = "PrinterCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(6f, 21f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 9.34f, 3.34f, 8f, 5f, 8f)
                horizontalLineTo(19f)
                curveTo(20.66f, 8f, 22f, 9.34f, 22f, 11f)
                verticalLineTo(13.81f)
                curveTo(21.12f, 13.3f, 20.1f, 13f, 19f, 13f)
                curveTo(17.77f, 13f, 16.64f, 13.37f, 15.69f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                horizontalLineTo(6f)
                moveTo(18f, 11f)
                curveTo(18f, 11.55f, 18.45f, 12f, 19f, 12f)
                reflectiveCurveTo(20f, 11.55f, 20f, 11f)
                reflectiveCurveTo(19.55f, 10f, 19f, 10f)
                reflectiveCurveTo(18f, 10.45f, 18f, 11f)
                moveTo(23.5f, 17f)
                lineTo(22f, 15.5f)
                lineTo(18.5f, 19f)
                lineTo(16.5f, 17f)
                lineTo(15f, 18.5f)
                lineTo(18.5f, 22f)
                lineTo(23.5f, 17f)
            }
        }.build()

        return _PrinterCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterCheck: ImageVector? = null
