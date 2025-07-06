package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spear: ImageVector
    get() {
        if (_Spear != null) {
            return _Spear!!
        }
        _Spear = ImageVector.Builder(
            name = "Spear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                horizontalLineTo(16.41f)
                lineTo(3.41f, 22f)
                lineTo(2f, 20.59f)
                lineTo(15f, 7.59f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(16f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                lineTo(22f, 2f)
                lineTo(16f, 4f)
                close()
            }
        }.build()

        return _Spear!!
    }

@Suppress("ObjectPropertyName")
private var _Spear: ImageVector? = null
