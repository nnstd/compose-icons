package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlignVerticalBottom: ImageVector
    get() {
        if (_AlignVerticalBottom != null) {
            return _AlignVerticalBottom!!
        }
        _AlignVerticalBottom = ImageVector.Builder(
            name = "AlignVerticalBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(10f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                moveTo(17f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _AlignVerticalBottom!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalBottom: ImageVector? = null
