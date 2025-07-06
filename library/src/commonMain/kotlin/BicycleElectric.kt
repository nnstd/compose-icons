package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BicycleElectric: ImageVector
    get() {
        if (_BicycleElectric != null) {
            return _BicycleElectric!!
        }
        _BicycleElectric = ImageVector.Builder(
            name = "BicycleElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                curveTo(18.44f, 7f, 17.91f, 7.11f, 17.41f, 7.28f)
                lineTo(14.46f, 1.5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(13.54f)
                lineTo(14.42f, 4.72f)
                lineTo(12f, 10.13f)
                lineTo(10.23f, 5.95f)
                curveTo(10.5f, 5.85f, 10.74f, 5.58f, 10.74f, 5.25f)
                curveTo(10.74f, 4.84f, 10.41f, 4.5f, 10f, 4.5f)
                horizontalLineTo(8f)
                curveTo(7.58f, 4.5f, 7.24f, 4.84f, 7.24f, 5.25f)
                reflectiveCurveTo(7.58f, 6f, 8f, 6f)
                horizontalLineTo(8.61f)
                lineTo(10.86f, 11.25f)
                horizontalLineTo(9.92f)
                curveTo(9.56f, 8.85f, 7.5f, 7f, 5f, 7f)
                curveTo(2.24f, 7f, 0f, 9.24f, 0f, 12f)
                reflectiveCurveTo(2.24f, 17f, 5f, 17f)
                curveTo(7.5f, 17f, 9.56f, 15.15f, 9.92f, 12.75f)
                horizontalLineTo(12.5f)
                lineTo(15.29f, 6.43f)
                lineTo(16.08f, 7.96f)
                curveTo(14.82f, 8.87f, 14f, 10.34f, 14f, 12f)
                curveTo(14f, 14.76f, 16.24f, 17f, 19f, 17f)
                reflectiveCurveTo(24f, 14.76f, 24f, 12f)
                reflectiveCurveTo(21.76f, 7f, 19f, 7f)
                moveTo(5f, 15.5f)
                curveTo(3.07f, 15.5f, 1.5f, 13.93f, 1.5f, 12f)
                reflectiveCurveTo(3.07f, 8.5f, 5f, 8.5f)
                curveTo(6.67f, 8.5f, 8.07f, 9.68f, 8.41f, 11.25f)
                horizontalLineTo(4f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.41f)
                curveTo(8.07f, 14.32f, 6.67f, 15.5f, 5f, 15.5f)
                moveTo(19f, 15.5f)
                curveTo(17.07f, 15.5f, 15.5f, 13.93f, 15.5f, 12f)
                curveTo(15.5f, 10.92f, 16f, 9.97f, 16.77f, 9.33f)
                lineTo(18.57f, 12.85f)
                lineTo(19.89f, 12.13f)
                lineTo(18.1f, 8.63f)
                curveTo(18.39f, 8.56f, 18.69f, 8.5f, 19f, 8.5f)
                curveTo(20.93f, 8.5f, 22.5f, 10.07f, 22.5f, 12f)
                reflectiveCurveTo(20.93f, 15.5f, 19f, 15.5f)
                moveTo(11f, 20f)
                horizontalLineTo(7f)
                lineTo(13f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                lineTo(11f, 18f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _BicycleElectric!!
    }

@Suppress("ObjectPropertyName")
private var _BicycleElectric: ImageVector? = null
