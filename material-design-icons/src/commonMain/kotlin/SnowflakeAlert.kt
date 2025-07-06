package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SnowflakeAlert: ImageVector
    get() {
        if (_SnowflakeAlert != null) {
            return _SnowflakeAlert!!
        }
        _SnowflakeAlert = ImageVector.Builder(
            name = "SnowflakeAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.46f, 9.41f)
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
                lineTo(14.7f, 20.59f)
                lineTo(13f, 18.88f)
                verticalLineTo(16.62f)
                lineTo(16.46f, 14.61f)
                moveTo(9.5f, 10.56f)
                lineTo(12f, 9.11f)
                lineTo(14.5f, 10.56f)
                verticalLineTo(13.44f)
                lineTo(12f, 14.89f)
                lineTo(9.5f, 13.44f)
                moveTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _SnowflakeAlert!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeAlert: ImageVector? = null
