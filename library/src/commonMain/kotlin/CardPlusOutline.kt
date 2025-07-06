package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardPlusOutline: ImageVector
    get() {
        if (_CardPlusOutline != null) {
            return _CardPlusOutline!!
        }
        _CardPlusOutline = ImageVector.Builder(
            name = "CardPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                moveTo(14f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                curveTo(21f, 4.89f, 20.11f, 4f, 19f, 4f)
                horizontalLineTo(3f)
                curveTo(1.9f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.11f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CardPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardPlusOutline: ImageVector? = null
