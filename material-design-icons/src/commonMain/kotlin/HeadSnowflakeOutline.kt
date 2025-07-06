package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadSnowflakeOutline: ImageVector
    get() {
        if (_HeadSnowflakeOutline != null) {
            return _HeadSnowflakeOutline!!
        }
        _HeadSnowflakeOutline = ImageVector.Builder(
            name = "HeadSnowflakeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.41f, 1f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11f)
                lineTo(2.47f, 11f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4f, 14.94f)
                verticalLineTo(16f)
                curveTo(4f, 17.85f, 5.28f, 19.42f, 7f, 19.87f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22f, 13.06f, 22f, 10f)
                curveTo(22f, 5.03f, 17.96f, 1f, 13f, 1f)
                moveTo(17.33f, 9.3f)
                lineTo(15.37f, 9.81f)
                lineTo(16.81f, 11.27f)
                curveTo(17.16f, 11.61f, 17.16f, 12.19f, 16.81f, 12.54f)
                reflectiveCurveTo(15.88f, 12.89f, 15.54f, 12.54f)
                lineTo(14.09f, 11.1f)
                lineTo(13.57f, 13.06f)
                curveTo(13.45f, 13.55f, 12.96f, 13.82f, 12.5f, 13.7f)
                curveTo(12f, 13.57f, 11.72f, 13.08f, 11.84f, 12.59f)
                lineTo(12.37f, 10.63f)
                lineTo(10.41f, 11.16f)
                curveTo(9.92f, 11.28f, 9.43f, 11f, 9.3f, 10.5f)
                curveTo(9.18f, 10.05f, 9.46f, 9.55f, 9.94f, 9.43f)
                lineTo(11.9f, 8.91f)
                lineTo(10.46f, 7.46f)
                curveTo(10.11f, 7.12f, 10.11f, 6.55f, 10.46f, 6.19f)
                curveTo(10.81f, 5.84f, 11.39f, 5.84f, 11.73f, 6.19f)
                lineTo(13.19f, 7.63f)
                lineTo(13.7f, 5.67f)
                curveTo(13.82f, 5.18f, 14.32f, 4.9f, 14.79f, 5.03f)
                curveTo(15.28f, 5.16f, 15.56f, 5.65f, 15.43f, 6.13f)
                lineTo(14.9f, 8.1f)
                lineTo(16.87f, 7.57f)
                curveTo(17.35f, 7.44f, 17.84f, 7.72f, 17.97f, 8.21f)
                curveTo(18.1f, 8.68f, 17.82f, 9.18f, 17.33f, 9.3f)
                close()
            }
        }.build()

        return _HeadSnowflakeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadSnowflakeOutline: ImageVector? = null
