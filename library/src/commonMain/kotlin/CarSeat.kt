package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSeat: ImageVector
    get() {
        if (_CarSeat != null) {
            return _CarSeat!!
        }
        _CarSeat = ImageVector.Builder(
            name = "CarSeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 18f)
                curveTo(7f, 18f, 4f, 10f, 4f, 6f)
                reflectiveCurveTo(6f, 2f, 6f, 2f)
                horizontalLineTo(7f)
                curveTo(7f, 2f, 8f, 2f, 8f, 3f)
                reflectiveCurveTo(7f, 4f, 7f, 6f)
                reflectiveCurveTo(10f, 10f, 10f, 13f)
                reflectiveCurveTo(7f, 18f, 7f, 18f)
                moveTo(12f, 17f)
                curveTo(11f, 17f, 8f, 19.5f, 8f, 19.5f)
                curveTo(7.7f, 19.7f, 7.8f, 20f, 8f, 20.3f)
                curveTo(8f, 20.3f, 9f, 22.1f, 11f, 22.1f)
                horizontalLineTo(17f)
                curveTo(18.1f, 22.1f, 19f, 21.2f, 19f, 20.1f)
                verticalLineTo(19.1f)
                curveTo(19f, 18f, 18.1f, 17.1f, 17f, 17.1f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _CarSeat!!
    }

@Suppress("ObjectPropertyName")
private var _CarSeat: ImageVector? = null
