package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BreadSlice: ImageVector
    get() {
        if (_BreadSlice != null) {
            return _BreadSlice!!
        }
        _BreadSlice = ImageVector.Builder(
            name = "BreadSlice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 5.36f, 22f, 9.5f)
                curveTo(22f, 11.19f, 21.26f, 12.75f, 20f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                curveTo(2.74f, 12.75f, 2f, 11.19f, 2f, 9.5f)
                curveTo(2f, 5.36f, 6.5f, 2f, 12f, 2f)
                moveTo(8f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _BreadSlice!!
    }

@Suppress("ObjectPropertyName")
private var _BreadSlice: ImageVector? = null
