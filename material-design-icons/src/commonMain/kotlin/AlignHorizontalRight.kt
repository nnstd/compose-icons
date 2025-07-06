package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignHorizontalRight: ImageVector
    get() {
        if (_AlignHorizontalRight != null) {
            return _AlignHorizontalRight!!
        }
        _AlignHorizontalRight = ImageVector.Builder(
            name = "AlignHorizontalRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                moveTo(2f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                moveTo(8f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _AlignHorizontalRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalRight: ImageVector? = null
