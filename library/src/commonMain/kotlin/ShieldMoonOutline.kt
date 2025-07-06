package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldMoonOutline: ImageVector
    get() {
        if (_ShieldMoonOutline != null) {
            return _ShieldMoonOutline!!
        }
        _ShieldMoonOutline = ImageVector.Builder(
            name = "ShieldMoonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                moveTo(9f, 14.33f)
                curveTo(10.76f, 16.5f, 14.13f, 16.57f, 15.97f, 14.4f)
                curveTo(16.2f, 14.13f, 16.05f, 13.72f, 15.71f, 13.66f)
                curveTo(14.42f, 13.45f, 13.23f, 12.68f, 12.53f, 11.46f)
                curveTo(11.82f, 10.24f, 11.75f, 8.83f, 12.21f, 7.6f)
                curveTo(12.33f, 7.27f, 12.05f, 6.94f, 11.7f, 7f)
                curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9f, 14.33f)
            }
        }.build()

        return _ShieldMoonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldMoonOutline: ImageVector? = null
