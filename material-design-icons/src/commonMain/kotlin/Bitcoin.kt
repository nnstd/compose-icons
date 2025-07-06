package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "Bitcoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.24f, 10.56f)
                curveTo(13.93f, 11.8f, 12f, 11.17f, 11.4f, 11f)
                lineTo(11.95f, 8.82f)
                curveTo(12.57f, 9f, 14.56f, 9.26f, 14.24f, 10.56f)
                moveTo(11.13f, 12.12f)
                lineTo(10.53f, 14.53f)
                curveTo(11.27f, 14.72f, 13.56f, 15.45f, 13.9f, 14.09f)
                curveTo(14.26f, 12.67f, 11.87f, 12.3f, 11.13f, 12.12f)
                moveTo(21.7f, 14.42f)
                curveTo(20.36f, 19.78f, 14.94f, 23.04f, 9.58f, 21.7f)
                curveTo(4.22f, 20.36f, 0.963f, 14.94f, 2.3f, 9.58f)
                curveTo(3.64f, 4.22f, 9.06f, 0.964f, 14.42f, 2.3f)
                curveTo(19.77f, 3.64f, 23.03f, 9.06f, 21.7f, 14.42f)
                moveTo(14.21f, 8.05f)
                lineTo(14.66f, 6.25f)
                lineTo(13.56f, 6f)
                lineTo(13.12f, 7.73f)
                curveTo(12.83f, 7.66f, 12.54f, 7.59f, 12.24f, 7.53f)
                lineTo(12.68f, 5.76f)
                lineTo(11.59f, 5.5f)
                lineTo(11.14f, 7.29f)
                curveTo(10.9f, 7.23f, 10.66f, 7.18f, 10.44f, 7.12f)
                lineTo(10.44f, 7.12f)
                lineTo(8.93f, 6.74f)
                lineTo(8.63f, 7.91f)
                curveTo(8.63f, 7.91f, 9.45f, 8.1f, 9.43f, 8.11f)
                curveTo(9.88f, 8.22f, 9.96f, 8.5f, 9.94f, 8.75f)
                lineTo(8.71f, 13.68f)
                curveTo(8.66f, 13.82f, 8.5f, 14f, 8.21f, 13.95f)
                curveTo(8.22f, 13.96f, 7.41f, 13.75f, 7.41f, 13.75f)
                lineTo(6.87f, 15f)
                lineTo(8.29f, 15.36f)
                curveTo(8.56f, 15.43f, 8.82f, 15.5f, 9.08f, 15.56f)
                lineTo(8.62f, 17.38f)
                lineTo(9.72f, 17.66f)
                lineTo(10.17f, 15.85f)
                curveTo(10.47f, 15.93f, 10.76f, 16f, 11.04f, 16.08f)
                lineTo(10.59f, 17.87f)
                lineTo(11.69f, 18.15f)
                lineTo(12.15f, 16.33f)
                curveTo(14f, 16.68f, 15.42f, 16.54f, 16f, 14.85f)
                curveTo(16.5f, 13.5f, 16f, 12.7f, 15f, 12.19f)
                curveTo(15.72f, 12f, 16.26f, 11.55f, 16.41f, 10.57f)
                curveTo(16.61f, 9.24f, 15.59f, 8.53f, 14.21f, 8.05f)
                close()
            }
        }.build()

        return _Bitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _Bitcoin: ImageVector? = null
