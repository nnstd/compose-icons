package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageCog: ImageVector
    get() {
        if (_MessageCog != null) {
            return _MessageCog!!
        }
        _MessageCog = ImageVector.Builder(
            name = "MessageCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.5f)
                curveTo(11.16f, 11.5f, 10.5f, 10.83f, 10.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 10f)
                moveTo(22f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                moveTo(16.77f, 11.32f)
                lineTo(15.7f, 10.5f)
                curveTo(15.71f, 10.33f, 15.71f, 10.16f, 15.7f, 10f)
                curveTo(15.72f, 9.84f, 15.72f, 9.67f, 15.7f, 9.5f)
                lineTo(16.76f, 8.68f)
                curveTo(16.85f, 8.6f, 16.88f, 8.47f, 16.82f, 8.36f)
                lineTo(15.82f, 6.63f)
                curveTo(15.76f, 6.5f, 15.63f, 6.47f, 15.5f, 6.5f)
                lineTo(14.27f, 7f)
                curveTo(14f, 6.8f, 13.73f, 6.63f, 13.42f, 6.5f)
                lineTo(13.23f, 5.19f)
                curveTo(13.21f, 5.08f, 13.11f, 5f, 13f, 5f)
                horizontalLineTo(11f)
                curveTo(10.88f, 5f, 10.77f, 5.09f, 10.75f, 5.21f)
                lineTo(10.56f, 6.53f)
                curveTo(10.26f, 6.65f, 9.97f, 6.81f, 9.7f, 7f)
                lineTo(8.46f, 6.5f)
                curveTo(8.34f, 6.46f, 8.21f, 6.5f, 8.15f, 6.61f)
                lineTo(7.15f, 8.34f)
                curveTo(7.09f, 8.45f, 7.11f, 8.58f, 7.21f, 8.66f)
                lineTo(8.27f, 9.5f)
                curveTo(8.23f, 9.82f, 8.23f, 10.16f, 8.27f, 10.5f)
                lineTo(7.21f, 11.32f)
                curveTo(7.12f, 11.4f, 7.09f, 11.53f, 7.15f, 11.64f)
                lineTo(8.15f, 13.37f)
                curveTo(8.21f, 13.5f, 8.34f, 13.53f, 8.46f, 13.5f)
                lineTo(9.7f, 13f)
                curveTo(9.96f, 13.2f, 10.24f, 13.37f, 10.55f, 13.5f)
                lineTo(10.74f, 14.81f)
                curveTo(10.77f, 14.93f, 10.88f, 15f, 11f, 15f)
                horizontalLineTo(13f)
                curveTo(13.12f, 15f, 13.23f, 14.91f, 13.25f, 14.79f)
                lineTo(13.44f, 13.47f)
                curveTo(13.74f, 13.34f, 14f, 13.18f, 14.28f, 13f)
                lineTo(15.53f, 13.5f)
                curveTo(15.65f, 13.5f, 15.78f, 13.5f, 15.84f, 13.37f)
                lineTo(16.84f, 11.64f)
                curveTo(16.9f, 11.53f, 16.87f, 11.4f, 16.77f, 11.32f)
                close()
            }
        }.build()

        return _MessageCog!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCog: ImageVector? = null
