package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeParking: ImageVector
    get() {
        if (_CarBrakeParking != null) {
            return _CarBrakeParking!!
        }
        _CarBrakeParking = ImageVector.Builder(
            name = "CarBrakeParking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7f, 3f, 3f, 7f, 3f, 12f)
                curveTo(3f, 17f, 7f, 21f, 12f, 21f)
                curveTo(17f, 21f, 21f, 17f, 21f, 12f)
                curveTo(21f, 7f, 17f, 3f, 12f, 3f)
                moveTo(12f, 19f)
                curveTo(8.1f, 19f, 5f, 15.9f, 5f, 12f)
                curveTo(5f, 8.1f, 8.1f, 5f, 12f, 5f)
                curveTo(15.9f, 5f, 19f, 8.1f, 19f, 12f)
                curveTo(19f, 15.9f, 15.9f, 19f, 12f, 19f)
                moveTo(20.5f, 20.5f)
                curveTo(22.7f, 18.3f, 24f, 15.3f, 24f, 12f)
                curveTo(24f, 8.7f, 22.7f, 5.7f, 20.5f, 3.5f)
                lineTo(19.4f, 4.6f)
                curveTo(21.3f, 6.5f, 22.5f, 9.1f, 22.5f, 12f)
                curveTo(22.5f, 14.9f, 21.3f, 17.5f, 19.4f, 19.4f)
                lineTo(20.5f, 20.5f)
                moveTo(4.6f, 19.4f)
                curveTo(2.7f, 17.5f, 1.5f, 14.9f, 1.5f, 12f)
                curveTo(1.5f, 9.1f, 2.7f, 6.5f, 4.6f, 4.6f)
                lineTo(3.5f, 3.5f)
                curveTo(1.3f, 5.7f, 0f, 8.7f, 0f, 12f)
                curveTo(0f, 15.3f, 1.3f, 18.3f, 3.5f, 20.5f)
                lineTo(4.6f, 19.4f)
                moveTo(9.5f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11.5f)
                verticalLineTo(13f)
                horizontalLineTo(13.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 11f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7f)
                horizontalLineTo(9.5f)
                moveTo(11.5f, 9f)
                horizontalLineTo(13.5f)
                verticalLineTo(11f)
                horizontalLineTo(11.5f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _CarBrakeParking!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeParking: ImageVector? = null
