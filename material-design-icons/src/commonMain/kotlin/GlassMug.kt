package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassMug: ImageVector
    get() {
        if (_GlassMug != null) {
            return _GlassMug!!
        }
        _GlassMug = ImageVector.Builder(
            name = "GlassMug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                moveTo(8f, 2f)
                horizontalLineTo(20f)
                lineTo(21f, 2f)
                verticalLineTo(3f)
                lineTo(20f, 4f)
                verticalLineTo(20f)
                lineTo(21f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                lineTo(8f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                lineTo(8f, 20f)
                verticalLineTo(18.6f)
                lineTo(4.2f, 16.83f)
                curveTo(3.5f, 16.5f, 3f, 15.82f, 3f, 15f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                lineTo(7f, 3f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                moveTo(5f, 15f)
                lineTo(8f, 16.39f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _GlassMug!!
    }

@Suppress("ObjectPropertyName")
private var _GlassMug: ImageVector? = null
