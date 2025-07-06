package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarSpeedLimiter: ImageVector
    get() {
        if (_CarSpeedLimiter != null) {
            return _CarSpeedLimiter!!
        }
        _CarSpeedLimiter = ImageVector.Builder(
            name = "CarSpeedLimiter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                curveTo(18f, 17.6f, 16.8f, 19.9f, 14.9f, 21.3f)
                lineTo(14.4f, 20.8f)
                lineTo(12.3f, 18.7f)
                lineTo(13.7f, 17.3f)
                lineTo(14.9f, 18.5f)
                curveTo(15.4f, 17.8f, 15.8f, 16.9f, 15.9f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(15.9f)
                curveTo(15.7f, 13.1f, 15.4f, 12.3f, 14.9f, 11.5f)
                lineTo(13.7f, 12.7f)
                lineTo(12.3f, 11.3f)
                lineTo(13.5f, 10.1f)
                curveTo(12.8f, 9.6f, 11.9f, 9.2f, 11f, 9.1f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9.1f)
                curveTo(8.1f, 9.3f, 7.3f, 9.6f, 6.5f, 10.1f)
                lineTo(9.5f, 13.1f)
                curveTo(9.7f, 13.1f, 9.8f, 13f, 10f, 13f)
                curveTo(11.11f, 13f, 12f, 13.9f, 12f, 15f)
                reflectiveCurveTo(11.11f, 17f, 10f, 17f)
                reflectiveCurveTo(8f, 16.11f, 8f, 15f)
                curveTo(8f, 14.8f, 8f, 14.7f, 8.1f, 14.5f)
                lineTo(5.1f, 11.5f)
                curveTo(4.6f, 12.2f, 4.2f, 13.1f, 4.1f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4.1f)
                curveTo(4.3f, 16.9f, 4.6f, 17.7f, 5.1f, 18.5f)
                lineTo(6.3f, 17.3f)
                lineTo(7.7f, 18.7f)
                lineTo(5.1f, 21.3f)
                curveTo(3.2f, 19.9f, 2f, 17.6f, 2f, 15f)
                curveTo(2f, 10.58f, 5.58f, 7f, 10f, 7f)
                reflectiveCurveTo(18f, 10.58f, 18f, 15f)
                moveTo(23f, 5f)
                curveTo(23f, 3.34f, 21.66f, 2f, 20f, 2f)
                reflectiveCurveTo(17f, 3.34f, 17f, 5f)
                curveTo(17f, 6.3f, 17.84f, 7.4f, 19f, 7.82f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(7.82f)
                curveTo(22.16f, 7.4f, 23f, 6.3f, 23f, 5f)
                moveTo(20f, 6f)
                curveTo(19.45f, 6f, 19f, 5.55f, 19f, 5f)
                reflectiveCurveTo(19.45f, 4f, 20f, 4f)
                reflectiveCurveTo(21f, 4.45f, 21f, 5f)
                reflectiveCurveTo(20.55f, 6f, 20f, 6f)
                close()
            }
        }.build()

        return _CarSpeedLimiter!!
    }

@Suppress("ObjectPropertyName")
private var _CarSpeedLimiter: ImageVector? = null
