package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeRetarder: ImageVector
    get() {
        if (_CarBrakeRetarder != null) {
            return _CarBrakeRetarder!!
        }
        _CarBrakeRetarder = ImageVector.Builder(
            name = "CarBrakeRetarder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7f, 3f, 3f, 7f, 3f, 12f)
                reflectiveCurveTo(7f, 21f, 12f, 21f)
                reflectiveCurveTo(21f, 17f, 21f, 12f)
                reflectiveCurveTo(17f, 3f, 12f, 3f)
                moveTo(12f, 19f)
                curveTo(8.1f, 19f, 5f, 15.9f, 5f, 12f)
                reflectiveCurveTo(8.1f, 5f, 12f, 5f)
                reflectiveCurveTo(19f, 8.1f, 19f, 12f)
                reflectiveCurveTo(15.9f, 19f, 12f, 19f)
                moveTo(20.5f, 20.5f)
                curveTo(22.7f, 18.3f, 24f, 15.3f, 24f, 12f)
                reflectiveCurveTo(22.7f, 5.7f, 20.5f, 3.5f)
                lineTo(19.4f, 4.6f)
                curveTo(21.3f, 6.5f, 22.5f, 9.1f, 22.5f, 12f)
                reflectiveCurveTo(21.3f, 17.5f, 19.4f, 19.4f)
                lineTo(20.5f, 20.5f)
                moveTo(4.6f, 19.4f)
                curveTo(2.7f, 17.5f, 1.5f, 14.9f, 1.5f, 12f)
                reflectiveCurveTo(2.7f, 6.5f, 4.6f, 4.6f)
                lineTo(3.5f, 3.5f)
                curveTo(1.3f, 5.7f, 0f, 8.7f, 0f, 12f)
                reflectiveCurveTo(1.3f, 18.3f, 3.5f, 20.5f)
                lineTo(4.6f, 19.4f)
                moveTo(15.3f, 10.5f)
                curveTo(15.96f, 10.5f, 16.5f, 11.17f, 16.5f, 12f)
                curveTo(16.5f, 12.81f, 15.95f, 13.5f, 15.3f, 13.5f)
                curveTo(14.93f, 13.5f, 14.66f, 13.29f, 14.5f, 13.11f)
                lineTo(14.47f, 13.08f)
                lineTo(14.44f, 13.05f)
                lineTo(13.38f, 12f)
                lineTo(14.47f, 10.92f)
                lineTo(14.5f, 10.89f)
                lineTo(14.53f, 10.86f)
                curveTo(14.74f, 10.63f, 15f, 10.5f, 15.3f, 10.5f)
                moveTo(8.7f, 10.5f)
                curveTo(9.07f, 10.5f, 9.34f, 10.71f, 9.5f, 10.88f)
                lineTo(9.5f, 10.92f)
                lineTo(9.56f, 10.95f)
                lineTo(10.62f, 12f)
                lineTo(9.53f, 13.08f)
                lineTo(9.5f, 13.11f)
                lineTo(9.47f, 13.15f)
                curveTo(9.26f, 13.37f, 9f, 13.5f, 8.7f, 13.5f)
                curveTo(8.05f, 13.5f, 7.5f, 12.81f, 7.5f, 12f)
                reflectiveCurveTo(8.05f, 10.5f, 8.7f, 10.5f)
                moveTo(15.3f, 9f)
                curveTo(14.58f, 9f, 13.9f, 9.31f, 13.42f, 9.85f)
                lineTo(12f, 11.25f)
                lineTo(10.61f, 9.88f)
                curveTo(10.1f, 9.31f, 9.42f, 9f, 8.7f, 9f)
                curveTo(7.21f, 9f, 6f, 10.35f, 6f, 12f)
                reflectiveCurveTo(7.21f, 15f, 8.7f, 15f)
                curveTo(9.42f, 15f, 10.1f, 14.69f, 10.59f, 14.15f)
                lineTo(12f, 12.75f)
                lineTo(13.39f, 14.12f)
                curveTo(13.9f, 14.68f, 14.58f, 15f, 15.3f, 15f)
                curveTo(16.79f, 15f, 18f, 13.65f, 18f, 12f)
                curveTo(18f, 10.33f, 16.79f, 9f, 15.3f, 9f)
                close()
            }
        }.build()

        return _CarBrakeRetarder!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeRetarder: ImageVector? = null
