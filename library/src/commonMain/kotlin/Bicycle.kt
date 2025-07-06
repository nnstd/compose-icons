package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bicycle: ImageVector
    get() {
        if (_Bicycle != null) {
            return _Bicycle!!
        }
        _Bicycle = ImageVector.Builder(
            name = "Bicycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                curveTo(18.44f, 10f, 17.91f, 10.11f, 17.41f, 10.28f)
                lineTo(14.46f, 4.5f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(13.54f)
                lineTo(14.42f, 7.72f)
                lineTo(12f, 13.13f)
                lineTo(10.23f, 8.95f)
                curveTo(10.5f, 8.85f, 10.74f, 8.58f, 10.74f, 8.25f)
                curveTo(10.74f, 7.84f, 10.41f, 7.5f, 10f, 7.5f)
                horizontalLineTo(8f)
                curveTo(7.58f, 7.5f, 7.24f, 7.84f, 7.24f, 8.25f)
                reflectiveCurveTo(7.58f, 9f, 8f, 9f)
                horizontalLineTo(8.61f)
                lineTo(10.86f, 14.25f)
                horizontalLineTo(9.92f)
                curveTo(9.56f, 11.85f, 7.5f, 10f, 5f, 10f)
                curveTo(2.24f, 10f, 0f, 12.24f, 0f, 15f)
                reflectiveCurveTo(2.24f, 20f, 5f, 20f)
                curveTo(7.5f, 20f, 9.56f, 18.15f, 9.92f, 15.75f)
                horizontalLineTo(12.5f)
                lineTo(15.29f, 9.43f)
                lineTo(16.08f, 10.96f)
                curveTo(14.82f, 11.87f, 14f, 13.34f, 14f, 15f)
                curveTo(14f, 17.76f, 16.24f, 20f, 19f, 20f)
                reflectiveCurveTo(24f, 17.76f, 24f, 15f)
                reflectiveCurveTo(21.76f, 10f, 19f, 10f)
                moveTo(5f, 18.5f)
                curveTo(3.07f, 18.5f, 1.5f, 16.93f, 1.5f, 15f)
                reflectiveCurveTo(3.07f, 11.5f, 5f, 11.5f)
                curveTo(6.67f, 11.5f, 8.07f, 12.68f, 8.41f, 14.25f)
                horizontalLineTo(4f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.41f)
                curveTo(8.07f, 17.32f, 6.67f, 18.5f, 5f, 18.5f)
                moveTo(19f, 18.5f)
                curveTo(17.07f, 18.5f, 15.5f, 16.93f, 15.5f, 15f)
                curveTo(15.5f, 13.92f, 16f, 12.97f, 16.77f, 12.33f)
                lineTo(18.57f, 15.85f)
                lineTo(19.89f, 15.13f)
                lineTo(18.1f, 11.63f)
                curveTo(18.39f, 11.56f, 18.69f, 11.5f, 19f, 11.5f)
                curveTo(20.93f, 11.5f, 22.5f, 13.07f, 22.5f, 15f)
                reflectiveCurveTo(20.93f, 18.5f, 19f, 18.5f)
                close()
            }
        }.build()

        return _Bicycle!!
    }

@Suppress("ObjectPropertyName")
private var _Bicycle: ImageVector? = null
