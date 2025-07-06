package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignVerticalTop: ImageVector
    get() {
        if (_AlignVerticalTop != null) {
            return _AlignVerticalTop!!
        }
        _AlignVerticalTop = ImageVector.Builder(
            name = "AlignVerticalTop",
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
                moveTo(7f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(14f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _AlignVerticalTop!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalTop: ImageVector? = null
