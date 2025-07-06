package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneMissed: ImageVector
    get() {
        if (_PhoneMissed != null) {
            return _PhoneMissed!!
        }
        _PhoneMissed = ImageVector.Builder(
            name = "PhoneMissed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 16.67f)
                curveTo(20.66f, 13.77f, 16.54f, 12f, 12f, 12f)
                curveTo(7.46f, 12f, 3.34f, 13.77f, 0.29f, 16.67f)
                curveTo(0.11f, 16.85f, 0f, 17.1f, 0f, 17.38f)
                curveTo(0f, 17.65f, 0.11f, 17.9f, 0.29f, 18.08f)
                lineTo(2.77f, 20.56f)
                curveTo(2.95f, 20.74f, 3.2f, 20.86f, 3.5f, 20.86f)
                curveTo(3.75f, 20.86f, 4f, 20.75f, 4.18f, 20.57f)
                curveTo(4.97f, 19.83f, 5.86f, 19.21f, 6.84f, 18.72f)
                curveTo(7.17f, 18.56f, 7.4f, 18.22f, 7.4f, 17.82f)
                verticalLineTo(14.72f)
                curveTo(8.85f, 14.25f, 10.39f, 14f, 12f, 14f)
                curveTo(13.6f, 14f, 15.15f, 14.25f, 16.6f, 14.72f)
                verticalLineTo(17.82f)
                curveTo(16.6f, 18.22f, 16.83f, 18.56f, 17.16f, 18.72f)
                curveTo(18.14f, 19.21f, 19.03f, 19.83f, 19.82f, 20.57f)
                curveTo(20f, 20.75f, 20.25f, 20.86f, 20.5f, 20.86f)
                curveTo(20.8f, 20.86f, 21.05f, 20.74f, 21.23f, 20.56f)
                lineTo(23.71f, 18.08f)
                curveTo(23.89f, 17.9f, 24f, 17.65f, 24f, 17.38f)
                curveTo(24f, 17.1f, 23.89f, 16.85f, 23.71f, 16.67f)
                moveTo(6.5f, 5.5f)
                lineTo(12f, 11f)
                lineTo(19f, 4f)
                lineTo(18f, 3f)
                lineTo(12f, 9f)
                lineTo(7.5f, 4.5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()

        return _PhoneMissed!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMissed: ImageVector? = null
