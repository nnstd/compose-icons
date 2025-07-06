package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardMultipleOutline: ImageVector
    get() {
        if (_CardMultipleOutline != null) {
            return _CardMultipleOutline!!
        }
        _CardMultipleOutline = ImageVector.Builder(
            name = "CardMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(21f, 4f)
                curveTo(21.53f, 4f, 22.04f, 4.21f, 22.41f, 4.59f)
                curveTo(22.79f, 4.96f, 23f, 5.47f, 23f, 6f)
                verticalLineTo(16f)
                curveTo(23f, 16.53f, 22.79f, 17.04f, 22.41f, 17.41f)
                curveTo(22.04f, 17.79f, 21.53f, 18f, 21f, 18f)
                horizontalLineTo(7f)
                curveTo(5.89f, 18f, 5f, 17.1f, 5f, 16f)
                verticalLineTo(6f)
                curveTo(5f, 4.89f, 5.89f, 4f, 7f, 4f)
                horizontalLineTo(21f)
                moveTo(3f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                curveTo(2.47f, 22f, 1.96f, 21.79f, 1.59f, 21.41f)
                curveTo(1.21f, 21.04f, 1f, 20.53f, 1f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CardMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardMultipleOutline: ImageVector? = null
