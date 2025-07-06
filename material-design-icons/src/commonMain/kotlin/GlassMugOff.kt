package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassMugOff: ImageVector
    get() {
        if (_GlassMugOff != null) {
            return _GlassMugOff!!
        }
        _GlassMugOff = ImageVector.Builder(
            name = "GlassMugOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(6.66f, 6f)
                lineTo(6.07f, 5.41f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.26f, 6.15f)
                curveTo(3.5f, 6.44f, 3f, 7.16f, 3f, 8f)
                verticalLineTo(15f)
                curveTo(3f, 15.82f, 3.5f, 16.5f, 4.2f, 16.83f)
                lineTo(8f, 18.6f)
                verticalLineTo(20f)
                lineTo(7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(20.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20f, 19.35f)
                moveTo(8f, 16.39f)
                lineTo(5f, 15f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(8f, 9.89f)
                verticalLineTo(16.39f)
                moveTo(8f, 4f)
                lineTo(7f, 3f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                lineTo(20f, 4f)
                verticalLineTo(16.8f)
                lineTo(10.2f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6.8f)
                lineTo(8f, 4.8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _GlassMugOff!!
    }

@Suppress("ObjectPropertyName")
private var _GlassMugOff: ImageVector? = null
