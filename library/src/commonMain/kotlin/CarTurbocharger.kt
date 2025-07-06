package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarTurbocharger: ImageVector
    get() {
        if (_CarTurbocharger != null) {
            return _CarTurbocharger!!
        }
        _CarTurbocharger = ImageVector.Builder(
            name = "CarTurbocharger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(18.32f)
                curveTo(18.75f, 14.09f, 19f, 13.08f, 19f, 12f)
                curveTo(19f, 8.14f, 15.86f, 5f, 12f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                curveTo(16.97f, 3f, 21f, 7.03f, 21f, 12f)
                curveTo(21f, 12.34f, 20.97f, 12.67f, 20.94f, 13f)
                horizontalLineTo(22f)
                moveTo(12f, 19f)
                curveTo(8.14f, 19f, 5f, 15.86f, 5f, 12f)
                curveTo(5f, 10.93f, 5.25f, 9.91f, 5.69f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(3.06f)
                curveTo(3.03f, 11.33f, 3f, 11.66f, 3f, 12f)
                curveTo(3f, 16.97f, 7.03f, 21f, 12f, 21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                moveTo(16.86f, 12.2f)
                curveTo(15.93f, 12.94f, 14.72f, 12.47f, 14f, 12.05f)
                verticalLineTo(12f)
                curveTo(16.79f, 10.31f, 15.39f, 7.89f, 15.39f, 7.89f)
                reflectiveCurveTo(14.33f, 6.04f, 14.61f, 7.89f)
                curveTo(14.78f, 9.07f, 13.76f, 9.88f, 13.04f, 10.3f)
                lineTo(13f, 10.28f)
                curveTo(12.93f, 7f, 10.13f, 7f, 10.13f, 7f)
                reflectiveCurveTo(8f, 7f, 9.74f, 7.69f)
                curveTo(10.85f, 8.13f, 11.04f, 9.42f, 11.05f, 10.25f)
                lineTo(11f, 10.28f)
                curveTo(8.14f, 8.7f, 6.74f, 11.12f, 6.74f, 11.12f)
                reflectiveCurveTo(5.67f, 12.97f, 7.14f, 11.8f)
                curveTo(8.07f, 11.07f, 9.28f, 11.54f, 10f, 11.95f)
                verticalLineTo(12f)
                curveTo(7.21f, 13.7f, 8.61f, 16.12f, 8.61f, 16.12f)
                reflectiveCurveTo(9.67f, 17.97f, 9.4f, 16.11f)
                curveTo(9.22f, 14.94f, 10.25f, 14.13f, 10.97f, 13.7f)
                lineTo(11f, 13.73f)
                curveTo(11.07f, 17f, 13.87f, 17f, 13.87f, 17f)
                reflectiveCurveTo(16f, 17f, 14.26f, 16.31f)
                curveTo(13.15f, 15.87f, 12.96f, 14.58f, 12.95f, 13.75f)
                lineTo(13f, 13.73f)
                curveTo(15.86f, 15.31f, 17.26f, 12.88f, 17.26f, 12.88f)
                reflectiveCurveTo(18.33f, 11.04f, 16.86f, 12.2f)
                close()
            }
        }.build()

        return _CarTurbocharger!!
    }

@Suppress("ObjectPropertyName")
private var _CarTurbocharger: ImageVector? = null
