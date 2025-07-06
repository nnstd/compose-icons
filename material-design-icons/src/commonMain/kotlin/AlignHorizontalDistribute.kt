package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignHorizontalDistribute: ImageVector
    get() {
        if (_AlignHorizontalDistribute != null) {
            return _AlignHorizontalDistribute!!
        }
        _AlignHorizontalDistribute = ImageVector.Builder(
            name = "AlignHorizontalDistribute",
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
                moveTo(22f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                moveTo(13.5f, 7f)
                horizontalLineTo(10.5f)
                verticalLineTo(17f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _AlignHorizontalDistribute!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalDistribute: ImageVector? = null
