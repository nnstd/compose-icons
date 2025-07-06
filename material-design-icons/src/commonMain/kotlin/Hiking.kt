package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hiking: ImageVector
    get() {
        if (_Hiking != null) {
            return _Hiking!!
        }
        _Hiking = ImageVector.Builder(
            name = "Hiking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.47f, 8.67f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(17.47f)
                verticalLineTo(12.6f)
                curveTo(16.67f, 12.44f, 15.92f, 12.14f, 15.21f, 11.71f)
                reflectiveCurveTo(13.9f, 10.78f, 13.39f, 10.2f)
                lineTo(12.77f, 13.27f)
                lineTo(15f, 15.47f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                lineTo(10.76f, 14.8f)
                lineTo(8.89f, 23f)
                horizontalLineTo(6.73f)
                curveTo(6.73f, 23f, 9.86f, 7.22f, 9.89f, 7.09f)
                curveTo(10f, 6.61f, 10.22f, 6.24f, 10.59f, 6f)
                curveTo(10.96f, 5.73f, 11.33f, 5.6f, 11.71f, 5.6f)
                curveTo(12.1f, 5.6f, 12.46f, 5.69f, 12.79f, 5.87f)
                curveTo(13.13f, 6.04f, 13.39f, 6.29f, 13.58f, 6.61f)
                lineTo(14.64f, 8.24f)
                curveTo(14.93f, 8.78f, 15.32f, 9.25f, 15.81f, 9.63f)
                reflectiveCurveTo(16.86f, 10.3f, 17.47f, 10.5f)
                verticalLineTo(8.67f)
                moveTo(8.55f, 5.89f)
                lineTo(7.4f, 5.65f)
                curveTo(6.83f, 5.5f, 6.31f, 5.62f, 5.84f, 5.94f)
                curveTo(5.38f, 6.26f, 5.1f, 6.7f, 5f, 7.28f)
                lineTo(4.19f, 11.26f)
                curveTo(4.16f, 11.55f, 4.22f, 11.81f, 4.38f, 12.05f)
                curveTo(4.54f, 12.29f, 4.75f, 12.42f, 5f, 12.46f)
                lineTo(7.21f, 12.89f)
                lineTo(8.55f, 5.89f)
                moveTo(13f, 1f)
                curveTo(11.9f, 1f, 11f, 1.9f, 11f, 3f)
                reflectiveCurveTo(11.9f, 5f, 13f, 5f)
                reflectiveCurveTo(15f, 4.11f, 15f, 3f)
                reflectiveCurveTo(14.11f, 1f, 13f, 1f)
                close()
            }
        }.build()

        return _Hiking!!
    }

@Suppress("ObjectPropertyName")
private var _Hiking: ImageVector? = null
