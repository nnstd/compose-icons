package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SnowflakeVariant: ImageVector
    get() {
        if (_SnowflakeVariant != null) {
            return _SnowflakeVariant!!
        }
        _SnowflakeVariant = ImageVector.Builder(
            name = "SnowflakeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 12f)
                lineTo(16.27f, 11f)
                horizontalLineTo(23f)
                lineTo(22f, 9f)
                horizontalLineTo(18.03f)
                lineTo(20.42f, 5.83f)
                lineTo(19.43f, 3.83f)
                lineTo(15.37f, 9.2f)
                lineTo(13.35f, 10.21f)
                lineTo(13.75f, 8f)
                lineTo(17.83f, 2.62f)
                lineTo(15.64f, 2.22f)
                lineTo(12f, 7f)
                lineTo(8.4f, 2.2f)
                lineTo(6.2f, 2.6f)
                lineTo(10.26f, 8f)
                lineTo(10.66f, 10.21f)
                lineTo(8.82f, 9.29f)
                lineTo(8.66f, 9.21f)
                lineTo(4.6f, 3.8f)
                lineTo(3.6f, 5.8f)
                lineTo(6f, 9f)
                horizontalLineTo(2f)
                lineTo(1f, 11f)
                horizontalLineTo(7.77f)
                lineTo(9.75f, 12f)
                lineTo(7.73f, 13f)
                horizontalLineTo(1f)
                lineTo(2f, 15f)
                horizontalLineTo(5.97f)
                lineTo(3.58f, 18.17f)
                lineTo(4.57f, 20.17f)
                lineTo(8.63f, 14.8f)
                lineTo(10.65f, 13.79f)
                lineTo(10.25f, 16f)
                lineTo(6.17f, 21.38f)
                lineTo(8.36f, 21.79f)
                lineTo(12f, 17f)
                lineTo(15.6f, 21.8f)
                lineTo(17.8f, 21.4f)
                lineTo(13.74f, 16f)
                lineTo(13.34f, 13.79f)
                lineTo(15.34f, 14.79f)
                lineTo(19.4f, 20.2f)
                lineTo(20.4f, 18.2f)
                lineTo(18f, 15f)
                horizontalLineTo(22f)
                lineTo(23f, 13f)
                horizontalLineTo(16.23f)
            }
        }.build()

        return _SnowflakeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeVariant: ImageVector? = null
