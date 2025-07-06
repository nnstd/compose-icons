package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassMugVariant: ImageVector
    get() {
        if (_GlassMugVariant != null) {
            return _GlassMugVariant!!
        }
        _GlassMugVariant = ImageVector.Builder(
            name = "GlassMugVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 3f)
                curveTo(7.56f, 3f, 5.85f, 4.24f, 5.23f, 6.08f)
                curveTo(3.36f, 6.44f, 2f, 8.09f, 2f, 10f)
                curveTo(2f, 12.21f, 3.79f, 14f, 6f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(20.55f, 20f, 21f, 19.55f, 21f, 19f)
                verticalLineTo(11f)
                curveTo(21f, 10.45f, 20.55f, 10f, 20f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                curveTo(18f, 5.79f, 16.21f, 4f, 14f, 4f)
                horizontalLineTo(12.32f)
                curveTo(11.5f, 3.35f, 10.53f, 3f, 9.5f, 3f)
                moveTo(9.5f, 5f)
                curveTo(10.29f, 5f, 11.03f, 5.37f, 11.5f, 6f)
                horizontalLineTo(14f)
                curveTo(15.11f, 6f, 16f, 6.9f, 16f, 8f)
                horizontalLineTo(12f)
                curveTo(10f, 8f, 9.32f, 9.13f, 8.5f, 10.63f)
                curveTo(7.68f, 12.13f, 6f, 12f, 6f, 12f)
                curveTo(4.89f, 12f, 4f, 11.11f, 4f, 10f)
                curveTo(4f, 8.9f, 4.89f, 8f, 6f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7.5f)
                curveTo(7f, 6.12f, 8.12f, 5f, 9.5f, 5f)
                moveTo(17f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _GlassMugVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GlassMugVariant: ImageVector? = null
