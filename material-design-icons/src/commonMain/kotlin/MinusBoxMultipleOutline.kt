package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MinusBoxMultipleOutline: ImageVector
    get() {
        if (_MinusBoxMultipleOutline != null) {
            return _MinusBoxMultipleOutline!!
        }
        _MinusBoxMultipleOutline = ImageVector.Builder(
            name = "MinusBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(20f, 4f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(20f)
                curveTo(21.11f, 18f, 22f, 17.11f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _MinusBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MinusBoxMultipleOutline: ImageVector? = null
