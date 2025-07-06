package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarChildSeat: ImageVector
    get() {
        if (_CarChildSeat != null) {
            return _CarChildSeat!!
        }
        _CarChildSeat = ImageVector.Builder(
            name = "CarChildSeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4.5f)
                curveTo(17f, 5.9f, 15.9f, 7f, 14.5f, 7f)
                reflectiveCurveTo(12f, 5.9f, 12f, 4.5f)
                reflectiveCurveTo(13.1f, 2f, 14.5f, 2f)
                reflectiveCurveTo(17f, 3.1f, 17f, 4.5f)
                moveTo(15f, 8f)
                horizontalLineTo(14.2f)
                curveTo(12.1f, 8f, 10.1f, 6.8f, 9.1f, 4.9f)
                curveTo(9f, 4.8f, 8.9f, 4.7f, 8.9f, 4.6f)
                lineTo(7.1f, 5.4f)
                curveTo(7.6f, 6.8f, 9.2f, 8.6f, 11.5f, 9.5f)
                lineTo(9.7f, 14.5f)
                lineTo(5.8f, 13.4f)
                lineTo(3f, 18.9f)
                lineTo(5f, 19.4f)
                lineTo(6.8f, 15.8f)
                lineTo(11.3f, 17f)
                curveTo(12.3f, 17.2f, 13.3f, 16.7f, 13.7f, 15.8f)
                lineTo(16f, 9.4f)
                curveTo(16.2f, 8.7f, 15.7f, 8f, 15f, 8f)
                moveTo(18.9f, 7f)
                lineTo(15.5f, 16.4f)
                curveTo(14.9f, 18f, 13.4f, 19f, 11.8f, 19f)
                curveTo(11.5f, 19f, 11.1f, 19f, 10.8f, 18.9f)
                lineTo(7.9f, 18.1f)
                lineTo(7f, 19.9f)
                lineTo(9f, 20.4f)
                lineTo(10.4f, 20.8f)
                curveTo(10.9f, 20.9f, 11.4f, 21f, 11.9f, 21f)
                curveTo(14.4f, 21f, 16.6f, 19.5f, 17.5f, 17.1f)
                lineTo(21f, 7f)
                horizontalLineTo(18.9f)
                close()
            }
        }.build()

        return _CarChildSeat!!
    }

@Suppress("ObjectPropertyName")
private var _CarChildSeat: ImageVector? = null
