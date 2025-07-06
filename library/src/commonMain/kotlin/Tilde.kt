package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tilde: ImageVector
    get() {
        if (_Tilde != null) {
            return _Tilde!!
        }
        _Tilde = ImageVector.Builder(
            name = "Tilde",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                curveTo(2f, 15f, 2f, 9f, 8f, 9f)
                curveTo(12f, 9f, 12.5f, 12.5f, 15.5f, 12.5f)
                curveTo(19.5f, 12.5f, 19.5f, 9f, 19.5f, 9f)
                horizontalLineTo(22f)
                curveTo(22f, 9f, 22f, 15f, 16f, 15f)
                curveTo(12f, 15f, 10.5f, 11.5f, 8.5f, 11.5f)
                curveTo(4.5f, 11.5f, 4.5f, 15f, 4.5f, 15f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Tilde!!
    }

@Suppress("ObjectPropertyName")
private var _Tilde: ImageVector? = null
