package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldMoon: ImageVector
    get() {
        if (_ShieldMoon != null) {
            return _ShieldMoon!!
        }
        _ShieldMoon = ImageVector.Builder(
            name = "ShieldMoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(17.16f, 21.74f, 21f, 16.55f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(15.97f, 14.41f)
                curveTo(14.13f, 16.58f, 10.76f, 16.5f, 9f, 14.34f)
                curveTo(6.82f, 11.62f, 8.36f, 7.62f, 11.7f, 7f)
                curveTo(12.04f, 6.95f, 12.33f, 7.28f, 12.21f, 7.61f)
                curveTo(11.75f, 8.84f, 11.82f, 10.25f, 12.53f, 11.47f)
                curveTo(13.24f, 12.69f, 14.42f, 13.46f, 15.71f, 13.67f)
                curveTo(16.05f, 13.72f, 16.2f, 14.14f, 15.97f, 14.41f)
                close()
            }
        }.build()

        return _ShieldMoon!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldMoon: ImageVector? = null
