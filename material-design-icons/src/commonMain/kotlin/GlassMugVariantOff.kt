package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassMugVariantOff: ImageVector
    get() {
        if (_GlassMugVariantOff != null) {
            return _GlassMugVariantOff!!
        }
        _GlassMugVariantOff = ImageVector.Builder(
            name = "GlassMugVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.44f, 5.24f)
                lineTo(7f, 3.79f)
                curveTo(7.71f, 3.29f, 8.57f, 3f, 9.5f, 3f)
                curveTo(10.53f, 3f, 11.5f, 3.35f, 12.32f, 4f)
                horizontalLineTo(14f)
                curveTo(16.21f, 4f, 18f, 5.79f, 18f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                curveTo(20.55f, 10f, 21f, 10.45f, 21f, 11f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(13.8f)
                lineTo(11.26f, 8.06f)
                curveTo(11.5f, 8f, 11.73f, 8f, 12f, 8f)
                horizontalLineTo(16f)
                curveTo(16f, 6.9f, 15.11f, 6f, 14f, 6f)
                horizontalLineTo(11.5f)
                curveTo(11.03f, 5.37f, 10.29f, 5f, 9.5f, 5f)
                curveTo(9.12f, 5f, 8.76f, 5.09f, 8.44f, 5.24f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                curveTo(3.79f, 14f, 2f, 12.21f, 2f, 10f)
                curveTo(2f, 8.37f, 3f, 6.94f, 4.44f, 6.33f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(7.19f, 6.54f)
                lineTo(9.61f, 8.96f)
                lineTo(17f, 16.34f)
                verticalLineTo(16.35f)
                lineTo(18.65f, 18f)
                horizontalLineTo(18.66f)
                lineTo(20.5f, 19.84f)
                verticalLineTo(19.85f)
                lineTo(22.11f, 21.46f)
                moveTo(8.59f, 10.5f)
                lineTo(6.11f, 8f)
                horizontalLineTo(6f)
                curveTo(4.89f, 8f, 4f, 8.9f, 4f, 10f)
                curveTo(4f, 11.11f, 4.89f, 12f, 6f, 12f)
                curveTo(6f, 12f, 7.68f, 12.13f, 8.5f, 10.63f)
                lineTo(8.59f, 10.5f)
                close()
            }
        }.build()

        return _GlassMugVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _GlassMugVariantOff: ImageVector? = null
