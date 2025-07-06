package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Necklace: ImageVector
    get() {
        if (_Necklace != null) {
            return _Necklace!!
        }
        _Necklace = ImageVector.Builder(
            name = "Necklace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 5f)
                horizontalLineTo(19.5f)
                curveTo(19.5f, 9.14f, 16.14f, 12.5f, 12f, 12.5f)
                curveTo(7.86f, 12.5f, 4.5f, 9.14f, 4.5f, 5f)
                horizontalLineTo(2.5f)
                curveTo(2.55f, 10.11f, 6.59f, 14.29f, 11.7f, 14.5f)
                curveTo(11.1f, 15.4f, 10f, 17.2f, 10f, 18f)
                curveTo(10f, 20.67f, 14f, 20.67f, 14f, 18f)
                curveTo(14f, 17.2f, 12.9f, 15.4f, 12.3f, 14.5f)
                curveTo(17.41f, 14.29f, 21.45f, 10.11f, 21.5f, 5f)
                close()
            }
        }.build()

        return _Necklace!!
    }

@Suppress("ObjectPropertyName")
private var _Necklace: ImageVector? = null
