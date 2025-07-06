package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sausage: ImageVector
    get() {
        if (_Sausage != null) {
            return _Sausage!!
        }
        _Sausage = ImageVector.Builder(
            name = "Sausage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5.3f)
                curveTo(20.2f, 5.8f, 21f, 7.1f, 21f, 8.5f)
                curveTo(21f, 15.4f, 15.4f, 21f, 8.5f, 21f)
                curveTo(7.1f, 21f, 5.9f, 20.2f, 5.3f, 19f)
                lineTo(3f, 20.5f)
                verticalLineTo(14.5f)
                lineTo(5.3f, 16f)
                curveTo(5.9f, 14.8f, 7.1f, 14f, 8.5f, 14f)
                curveTo(11.5f, 14f, 14f, 11.5f, 14f, 8.5f)
                curveTo(14f, 7.1f, 14.8f, 5.9f, 16f, 5.3f)
                lineTo(14.5f, 3f)
                horizontalLineTo(20.5f)
                lineTo(19f, 5.3f)
                close()
            }
        }.build()

        return _Sausage!!
    }

@Suppress("ObjectPropertyName")
private var _Sausage: ImageVector? = null
