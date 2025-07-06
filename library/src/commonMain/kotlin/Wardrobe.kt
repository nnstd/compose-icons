package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wardrobe: ImageVector
    get() {
        if (_Wardrobe != null) {
            return _Wardrobe!!
        }
        _Wardrobe = ImageVector.Builder(
            name = "Wardrobe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                verticalLineTo(19f)
                curveTo(4f, 20.1f, 4.9f, 21f, 6f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(11.5f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                moveTo(8f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                moveTo(18f, 2f)
                horizontalLineTo(12.5f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                curveTo(19.1f, 21f, 20f, 20.1f, 20f, 19f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                moveTo(16f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Wardrobe!!
    }

@Suppress("ObjectPropertyName")
private var _Wardrobe: ImageVector? = null
