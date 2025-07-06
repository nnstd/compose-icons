package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Poll: ImageVector
    get() {
        if (_Poll != null) {
            return _Poll!!
        }
        _Poll = ImageVector.Builder(
            name = "Poll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                moveTo(10f, 22f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                moveTo(17f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _Poll!!
    }

@Suppress("ObjectPropertyName")
private var _Poll: ImageVector? = null
