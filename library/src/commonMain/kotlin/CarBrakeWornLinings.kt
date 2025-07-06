package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBrakeWornLinings: ImageVector
    get() {
        if (_CarBrakeWornLinings != null) {
            return _CarBrakeWornLinings!!
        }
        _CarBrakeWornLinings = ImageVector.Builder(
            name = "CarBrakeWornLinings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(15.86f, 5f, 19f, 8.14f, 19f, 12f)
                reflectiveCurveTo(15.86f, 19f, 12f, 19f)
                reflectiveCurveTo(5f, 15.86f, 5f, 12f)
                reflectiveCurveTo(8.14f, 5f, 12f, 5f)
                moveTo(12f, 3f)
                curveTo(7.03f, 3f, 3f, 7.03f, 3f, 12f)
                reflectiveCurveTo(7.03f, 21f, 12f, 21f)
                reflectiveCurveTo(21f, 16.97f, 21f, 12f)
                reflectiveCurveTo(16.97f, 3f, 12f, 3f)
                moveTo(4.58f, 4.58f)
                lineTo(3.5f, 3.5f)
                curveTo(2.37f, 4.65f, 1.47f, 6.03f, 0.861f, 7.55f)
                lineTo(2.3f, 8f)
                curveTo(2.84f, 6.71f, 3.61f, 5.56f, 4.58f, 4.58f)
                moveTo(1.71f, 14.1f)
                curveTo(1.57f, 13.42f, 1.5f, 12.72f, 1.5f, 12f)
                curveTo(1.5f, 11.28f, 1.57f, 10.58f, 1.71f, 9.9f)
                lineTo(0.275f, 9.46f)
                curveTo(0.098f, 10.28f, 0f, 11.13f, 0f, 12f)
                reflectiveCurveTo(0.098f, 13.72f, 0.275f, 14.54f)
                lineTo(1.71f, 14.1f)
                moveTo(23.14f, 7.55f)
                curveTo(22.53f, 6.03f, 21.63f, 4.65f, 20.5f, 3.5f)
                lineTo(19.42f, 4.58f)
                curveTo(20.39f, 5.56f, 21.16f, 6.71f, 21.7f, 8f)
                lineTo(23.14f, 7.55f)
                moveTo(0.861f, 16.45f)
                curveTo(1.47f, 18f, 2.37f, 19.35f, 3.5f, 20.5f)
                lineTo(4.58f, 19.42f)
                curveTo(3.61f, 18.44f, 2.84f, 17.29f, 2.3f, 16f)
                lineTo(0.861f, 16.45f)
                moveTo(19.42f, 19.42f)
                lineTo(20.5f, 20.5f)
                curveTo(21.63f, 19.35f, 22.53f, 18f, 23.14f, 16.45f)
                lineTo(21.7f, 16f)
                curveTo(21.16f, 17.29f, 20.39f, 18.44f, 19.42f, 19.42f)
                moveTo(22.29f, 9.9f)
                curveTo(22.43f, 10.58f, 22.5f, 11.28f, 22.5f, 12f)
                curveTo(22.5f, 12.72f, 22.43f, 13.42f, 22.29f, 14.1f)
                lineTo(23.73f, 14.54f)
                curveTo(23.9f, 13.72f, 24f, 12.87f, 24f, 12f)
                reflectiveCurveTo(23.9f, 10.28f, 23.73f, 9.46f)
                lineTo(22.29f, 9.9f)
                close()
            }
        }.build()

        return _CarBrakeWornLinings!!
    }

@Suppress("ObjectPropertyName")
private var _CarBrakeWornLinings: ImageVector? = null
