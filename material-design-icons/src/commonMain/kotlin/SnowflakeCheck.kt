package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SnowflakeCheck: ImageVector
    get() {
        if (_SnowflakeCheck != null) {
            return _SnowflakeCheck!!
        }
        _SnowflakeCheck = ImageVector.Builder(
            name = "SnowflakeCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.75f, 21.16f)
                lineTo(15f, 18.16f)
                lineTo(16.16f, 17f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(12f, 18f)
                curveTo(12f, 16.46f, 12.59f, 15.06f, 13.54f, 14f)
                lineTo(12f, 14.89f)
                lineTo(9.5f, 13.44f)
                verticalLineTo(10.56f)
                lineTo(12f, 9.11f)
                lineTo(14.5f, 10.56f)
                verticalLineTo(13.13f)
                curveTo(15.08f, 12.71f, 15.75f, 12.4f, 16.46f, 12.21f)
                verticalLineTo(10.56f)
                lineTo(18.46f, 9.43f)
                lineTo(20.79f, 10.05f)
                lineTo(21.31f, 8.12f)
                lineTo(19.54f, 7.65f)
                lineTo(20f, 5.88f)
                lineTo(18.07f, 5.36f)
                lineTo(17.45f, 7.69f)
                lineTo(15.45f, 8.82f)
                lineTo(13f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(14.71f, 3.41f)
                lineTo(13.29f, 2f)
                lineTo(12f, 3.29f)
                lineTo(10.71f, 2f)
                lineTo(9.29f, 3.41f)
                lineTo(11f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(8.5f, 8.82f)
                lineTo(6.5f, 7.69f)
                lineTo(5.92f, 5.36f)
                lineTo(4f, 5.88f)
                lineTo(4.47f, 7.65f)
                lineTo(2.7f, 8.12f)
                lineTo(3.22f, 10.05f)
                lineTo(5.55f, 9.43f)
                lineTo(7.55f, 10.56f)
                verticalLineTo(13.45f)
                lineTo(5.55f, 14.58f)
                lineTo(3.22f, 13.96f)
                lineTo(2.7f, 15.89f)
                lineTo(4.47f, 16.36f)
                lineTo(4f, 18.12f)
                lineTo(5.93f, 18.64f)
                lineTo(6.55f, 16.31f)
                lineTo(8.55f, 15.18f)
                lineTo(11f, 16.62f)
                verticalLineTo(18.88f)
                lineTo(9.29f, 20.59f)
                lineTo(10.71f, 22f)
                lineTo(12f, 20.71f)
                lineTo(13.29f, 22f)
                lineTo(13.42f, 21.87f)
                curveTo(12.54f, 20.83f, 12f, 19.5f, 12f, 18f)
                close()
            }
        }.build()

        return _SnowflakeCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeCheck: ImageVector? = null
