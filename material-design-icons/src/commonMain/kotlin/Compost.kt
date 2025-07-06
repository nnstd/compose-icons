package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Compost: ImageVector
    get() {
        if (_Compost != null) {
            return _Compost!!
        }
        _Compost = ImageVector.Builder(
            name = "Compost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 14f)
                curveTo(18.64f, 15.97f, 17.53f, 17.68f, 15.96f, 18.76f)
                curveTo(15.76f, 17.93f, 14.53f, 17.25f, 12.92f, 17.06f)
                curveTo(13.09f, 15.87f, 13.44f, 14.76f, 13.68f, 14.12f)
                curveTo(14.06f, 14.36f, 14.5f, 14.5f, 15f, 14.5f)
                curveTo(18.55f, 14.5f, 18f, 8.5f, 18f, 8.5f)
                reflectiveCurveTo(17.5f, 9.5f, 16f, 9.5f)
                horizontalLineTo(15f)
                curveTo(13.62f, 9.5f, 12.5f, 10.62f, 12.5f, 12f)
                curveTo(12.5f, 12.5f, 12.64f, 12.93f, 12.87f, 13.31f)
                curveTo(13.53f, 12.62f, 14.24f, 12f, 15f, 11.5f)
                curveTo(13.68f, 12.83f, 12.67f, 14.5f, 12f, 16.1f)
                curveTo(11.37f, 14.87f, 10.58f, 13.93f, 10f, 13.5f)
                curveTo(10.47f, 13.7f, 10.91f, 14f, 11.33f, 14.3f)
                curveTo(11.44f, 14.06f, 11.5f, 13.79f, 11.5f, 13.5f)
                curveTo(11.45f, 10.77f, 7f, 11f, 7f, 11f)
                curveTo(7.31f, 11.42f, 7.5f, 11.95f, 7.5f, 12.5f)
                verticalLineTo(13.5f)
                curveTo(7.5f, 14.6f, 8.4f, 15.5f, 9.5f, 15.5f)
                curveTo(10f, 15.5f, 10.45f, 15.32f, 10.8f, 15f)
                curveTo(11.03f, 15.63f, 11.2f, 16.35f, 11.29f, 17.04f)
                curveTo(9.57f, 17.19f, 8.25f, 17.89f, 8.04f, 18.77f)
                curveTo(6.21f, 17.5f, 5f, 15.39f, 5f, 13f)
                curveTo(5f, 9.14f, 8.14f, 6f, 12f, 6f)
                verticalLineTo(9f)
                lineTo(17f, 5f)
                lineTo(12f, 1f)
                verticalLineTo(4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(16.63f, 22f, 20.44f, 18.5f, 20.94f, 14f)
                horizontalLineTo(18.92f)
                close()
            }
        }.build()

        return _Compost!!
    }

@Suppress("ObjectPropertyName")
private var _Compost: ImageVector? = null
