package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BrushVariant: ImageVector
    get() {
        if (_BrushVariant != null) {
            return _BrushVariant!!
        }
        _BrushVariant = ImageVector.Builder(
            name = "BrushVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                curveTo(5.79f, 3f, 4f, 4.79f, 4f, 7f)
                verticalLineTo(14f)
                curveTo(4f, 15.1f, 4.9f, 16f, 6f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                curveTo(9f, 21.1f, 9.9f, 22f, 11f, 22f)
                horizontalLineTo(13f)
                curveTo(14.1f, 22f, 15f, 21.1f, 15f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                curveTo(19.1f, 16f, 20f, 15.1f, 20f, 14f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                moveTo(8f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                curveTo(6f, 5.9f, 6.9f, 5f, 8f, 5f)
                moveTo(6f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _BrushVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BrushVariant: ImageVector? = null
