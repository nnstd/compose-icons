package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UmbrellaBeachOutline: ImageVector
    get() {
        if (_UmbrellaBeachOutline != null) {
            return _UmbrellaBeachOutline!!
        }
        _UmbrellaBeachOutline = ImageVector.Builder(
            name = "UmbrellaBeachOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19.57f)
                lineTo(19.57f, 21f)
                lineTo(13.13f, 14.56f)
                lineTo(14.56f, 13.13f)
                lineTo(21f, 19.57f)
                moveTo(13.12f, 3f)
                curveTo(10.54f, 3f, 7.96f, 4f, 6f, 5.95f)
                lineTo(5.97f, 5.96f)
                curveTo(2f, 9.91f, 2f, 16.32f, 5.97f, 20.27f)
                lineTo(20.27f, 5.96f)
                curveTo(18.3f, 4f, 15.71f, 3f, 13.12f, 3f)
                moveTo(6.14f, 17.27f)
                curveTo(5.4f, 16.03f, 5f, 14.61f, 5f, 13.12f)
                curveTo(5f, 12.19f, 5.16f, 11.3f, 5.46f, 10.45f)
                curveTo(5.65f, 12.36f, 6.35f, 14.24f, 7.53f, 15.89f)
                lineTo(6.14f, 17.27f)
                moveTo(9f, 14.43f)
                curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f)
                curveTo(8.18f, 7.5f, 8.76f, 7.42f, 9.35f, 7.42f)
                curveTo(11.15f, 7.42f, 12.9f, 7.97f, 14.43f, 9f)
                lineTo(9f, 14.43f)
                moveTo(10.45f, 5.46f)
                curveTo(11.3f, 5.16f, 12.19f, 5f, 13.12f, 5f)
                curveTo(14.61f, 5f, 16.03f, 5.4f, 17.27f, 6.14f)
                lineTo(15.88f, 7.53f)
                curveTo(14.23f, 6.35f, 12.36f, 5.65f, 10.45f, 5.46f)
                close()
            }
        }.build()

        return _UmbrellaBeachOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaBeachOutline: ImageVector? = null
