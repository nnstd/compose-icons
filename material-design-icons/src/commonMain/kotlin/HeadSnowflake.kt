package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadSnowflake: ImageVector
    get() {
        if (_HeadSnowflake != null) {
            return _HeadSnowflake!!
        }
        _HeadSnowflake = ImageVector.Builder(
            name = "HeadSnowflake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(17.06f, 9.57f)
                lineTo(15.1f, 10.09f)
                lineTo(16.54f, 11.54f)
                curveTo(16.89f, 11.88f, 16.89f, 12.46f, 16.54f, 12.81f)
                curveTo(16.19f, 13.16f, 15.61f, 13.16f, 15.27f, 12.81f)
                lineTo(13.81f, 11.37f)
                lineTo(13.3f, 13.33f)
                curveTo(13.18f, 13.82f, 12.68f, 14.1f, 12.21f, 13.97f)
                curveTo(11.72f, 13.84f, 11.44f, 13.35f, 11.57f, 12.87f)
                lineTo(12.1f, 10.9f)
                lineTo(10.13f, 11.43f)
                curveTo(9.65f, 11.56f, 9.15f, 11.28f, 9.03f, 10.79f)
                curveTo(8.9f, 10.32f, 9.18f, 9.82f, 9.67f, 9.7f)
                lineTo(11.63f, 9.19f)
                lineTo(10.19f, 7.73f)
                curveTo(9.84f, 7.39f, 9.84f, 6.82f, 10.19f, 6.46f)
                curveTo(10.54f, 6.11f, 11.12f, 6.11f, 11.46f, 6.46f)
                lineTo(12.91f, 7.9f)
                lineTo(13.43f, 5.94f)
                curveTo(13.55f, 5.46f, 14.04f, 5.18f, 14.5f, 5.3f)
                curveTo(15f, 5.43f, 15.28f, 5.92f, 15.16f, 6.41f)
                lineTo(14.63f, 8.37f)
                lineTo(16.59f, 7.84f)
                curveTo(17.08f, 7.72f, 17.57f, 8f, 17.7f, 8.5f)
                curveTo(17.82f, 8.96f, 17.54f, 9.45f, 17.06f, 9.57f)
                close()
            }
        }.build()

        return _HeadSnowflake!!
    }

@Suppress("ObjectPropertyName")
private var _HeadSnowflake: ImageVector? = null
