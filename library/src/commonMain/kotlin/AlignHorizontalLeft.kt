package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignHorizontalLeft: ImageVector
    get() {
        if (_AlignHorizontalLeft != null) {
            return _AlignHorizontalLeft!!
        }
        _AlignHorizontalLeft = ImageVector.Builder(
            name = "AlignHorizontalLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                moveTo(22f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(16f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _AlignHorizontalLeft!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalLeft: ImageVector? = null
