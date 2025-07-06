package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Muffin: ImageVector
    get() {
        if (_Muffin != null) {
            return _Muffin!!
        }
        _Muffin = ImageVector.Builder(
            name = "Muffin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                curveTo(16f, 5f, 15f, 2f, 12f, 2f)
                curveTo(9f, 2f, 8f, 5f, 8f, 5f)
                curveTo(6f, 5f, 4f, 7f, 4f, 9f)
                curveTo(1.3f, 9f, 1.3f, 13f, 4f, 13f)
                horizontalLineTo(20f)
                curveTo(22.7f, 13f, 22.7f, 9f, 20f, 9f)
                curveTo(20f, 7f, 18f, 5f, 16f, 5f)
                moveTo(5f, 15f)
                lineTo(7f, 22f)
                horizontalLineTo(9f)
                lineTo(8f, 15f)
                horizontalLineTo(5f)
                moveTo(10f, 15f)
                lineTo(11f, 22f)
                horizontalLineTo(13f)
                lineTo(14f, 15f)
                horizontalLineTo(10f)
                moveTo(16f, 15f)
                lineTo(15f, 22f)
                horizontalLineTo(17f)
                lineTo(19f, 15f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Muffin!!
    }

@Suppress("ObjectPropertyName")
private var _Muffin: ImageVector? = null
