package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignVerticalDistribute: ImageVector
    get() {
        if (_AlignVerticalDistribute != null) {
            return _AlignVerticalDistribute!!
        }
        _AlignVerticalDistribute = ImageVector.Builder(
            name = "AlignVerticalDistribute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                moveTo(7f, 10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17f)
                verticalLineTo(10.5f)
                horizontalLineTo(7f)
                moveTo(2f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _AlignVerticalDistribute!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalDistribute: ImageVector? = null
