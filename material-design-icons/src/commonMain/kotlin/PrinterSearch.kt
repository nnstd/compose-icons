package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterSearch: ImageVector
    get() {
        if (_PrinterSearch != null) {
            return _PrinterSearch!!
        }
        _PrinterSearch = ImageVector.Builder(
            name = "PrinterSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.3f, 18.9f)
                curveTo(20.7f, 18.2f, 21f, 17.4f, 21f, 16.5f)
                curveTo(21f, 14f, 19f, 12f, 16.5f, 12f)
                reflectiveCurveTo(12f, 14f, 12f, 16.5f)
                reflectiveCurveTo(14f, 21f, 16.5f, 21f)
                curveTo(17.4f, 21f, 18.2f, 20.8f, 18.9f, 20.3f)
                lineTo(22f, 23.4f)
                lineTo(23.4f, 22f)
                lineTo(20.3f, 18.9f)
                moveTo(16.5f, 19f)
                curveTo(15.1f, 19f, 14f, 17.9f, 14f, 16.5f)
                reflectiveCurveTo(15.1f, 14f, 16.5f, 14f)
                reflectiveCurveTo(19f, 15.1f, 19f, 16.5f)
                reflectiveCurveTo(17.9f, 19f, 16.5f, 19f)
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(6f, 21f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 9.3f, 3.3f, 8f, 5f, 8f)
                horizontalLineTo(19f)
                curveTo(20.7f, 8f, 22f, 9.3f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(20.8f, 11.2f, 18.8f, 10f, 16.5f, 10f)
                curveTo(13.8f, 10f, 11.5f, 11.7f, 10.5f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(10.5f)
                curveTo(10.8f, 19.7f, 11.3f, 20.4f, 11.8f, 21f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _PrinterSearch!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterSearch: ImageVector? = null
