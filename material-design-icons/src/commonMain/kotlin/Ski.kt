package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ski: ImageVector
    get() {
        if (_Ski != null) {
            return _Ski!!
        }
        _Ski = ImageVector.Builder(
            name = "Ski",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.92f, 13.32f)
                curveTo(17.67f, 13.28f, 16.71f, 13f, 16.46f, 12.89f)
                lineTo(14.39f, 19.37f)
                lineTo(11.3f, 18.24f)
                lineTo(13.5f, 12.47f)
                lineTo(10.45f, 9f)
                lineTo(13f, 7.54f)
                curveTo(13.45f, 8.67f, 14.17f, 9.62f, 15.12f, 10.4f)
                reflectiveCurveTo(17.16f, 11.67f, 18.38f, 11.86f)
                lineTo(19.5f, 8.43f)
                lineTo(18.06f, 7.96f)
                lineTo(17.54f, 9.56f)
                curveTo(16.88f, 9.28f, 16.3f, 8.86f, 15.8f, 8.32f)
                curveTo(15.3f, 7.77f, 14.94f, 7.13f, 14.72f, 6.41f)
                lineTo(14.39f, 5.33f)
                curveTo(14.27f, 4.93f, 14.04f, 4.61f, 13.71f, 4.37f)
                curveTo(13.38f, 4.14f, 13f, 4f, 12.63f, 3.97f)
                curveTo(12.24f, 3.94f, 11.86f, 4f, 11.5f, 4.21f)
                lineTo(8f, 6.23f)
                curveTo(7.63f, 6.44f, 7.36f, 6.74f, 7.19f, 7.12f)
                curveTo(7f, 7.5f, 6.96f, 7.88f, 7f, 8.29f)
                reflectiveCurveTo(7.26f, 9.06f, 7.54f, 9.37f)
                lineTo(11.11f, 13.08f)
                lineTo(9.42f, 17.54f)
                lineTo(2.47f, 15.05f)
                lineTo(2f, 16.46f)
                lineTo(16.04f, 21.58f)
                curveTo(16.82f, 21.86f, 17.65f, 22f, 18.53f, 22f)
                curveTo(19.15f, 22f, 19.76f, 21.92f, 20.36f, 21.77f)
                curveTo(20.95f, 21.61f, 21.5f, 21.39f, 22f, 21.11f)
                lineTo(20.87f, 20f)
                curveTo(20.12f, 20.33f, 19.34f, 20.5f, 18.53f, 20.5f)
                curveTo(17.87f, 20.5f, 17.21f, 20.39f, 16.55f, 20.17f)
                lineTo(15.8f, 19.89f)
                lineTo(17.92f, 13.32f)
                moveTo(19f, 3f)
                curveTo(19f, 4.11f, 18.11f, 5f, 17f, 5f)
                reflectiveCurveTo(15f, 4.11f, 15f, 3f)
                reflectiveCurveTo(15.9f, 1f, 17f, 1f)
                reflectiveCurveTo(19f, 1.9f, 19f, 3f)
                close()
            }
        }.build()

        return _Ski!!
    }

@Suppress("ObjectPropertyName")
private var _Ski: ImageVector? = null
