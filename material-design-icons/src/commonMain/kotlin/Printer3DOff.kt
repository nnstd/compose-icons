package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DOff: ImageVector
    get() {
        if (_Printer3DOff != null) {
            return _Printer3DOff!!
        }
        _Printer3DOff = ImageVector.Builder(
            name = "Printer3DOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.3f, 2f)
                lineTo(1f, 3.3f)
                lineTo(2.1f, 4.4f)
                curveTo(2f, 4.6f, 2f, 4.8f, 2f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(8.3f)
                lineTo(8.7f, 11f)
                lineTo(6.5f, 12.1f)
                curveTo(6.2f, 12.3f, 6f, 12.6f, 6f, 13f)
                verticalLineTo(18.2f)
                curveTo(6f, 18.6f, 6.2f, 18.9f, 6.5f, 19.1f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22f, 12f, 22f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(17.1f, 19.3f)
                lineTo(20.8f, 23f)
                lineTo(22.1f, 21.7f)
                lineTo(2.3f, 2f)
                moveTo(4.9f, 2f)
                horizontalLineTo(4.8f)
                lineTo(9.8f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                curveTo(22f, 3.3f, 20.7f, 2f, 19f, 2f)
                horizontalLineTo(4.9f)
                curveTo(5f, 2f, 5f, 2f, 4.9f, 2f)
                moveTo(19f, 4f)
                curveTo(19.6f, 4f, 20f, 4.4f, 20f, 5f)
                reflectiveCurveTo(19.6f, 6f, 19f, 6f)
                reflectiveCurveTo(18f, 5.6f, 18f, 5f)
                reflectiveCurveTo(18.4f, 4f, 19f, 4f)
                moveTo(12.4f, 9.6f)
                lineTo(18f, 15.2f)
                verticalLineTo(13f)
                curveTo(18f, 12.6f, 17.8f, 12.3f, 17.5f, 12.1f)
                lineTo(12.6f, 9.7f)
                curveTo(12.5f, 9.7f, 12.5f, 9.6f, 12.4f, 9.6f)
                moveTo(10.2f, 12.5f)
                lineTo(12.2f, 14.5f)
                lineTo(12f, 14.6f)
                lineTo(9f, 13f)
                lineTo(10.2f, 12.5f)
                moveTo(8f, 14.7f)
                lineTo(11f, 16.3f)
                verticalLineTo(19.3f)
                lineTo(8f, 17.7f)
                verticalLineTo(14.7f)
                moveTo(13.7f, 16f)
                lineTo(15.6f, 17.9f)
                lineTo(13f, 19.3f)
                verticalLineTo(16.3f)
                lineTo(13.7f, 16f)
                close()
            }
        }.build()

        return _Printer3DOff!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DOff: ImageVector? = null
