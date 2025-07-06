package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewArray: ImageVector
    get() {
        if (_ViewArray != null) {
            return _ViewArray!!
        }
        _ViewArray = ImageVector.Builder(
            name = "ViewArray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                moveTo(18f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(4f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ViewArray!!
    }

@Suppress("ObjectPropertyName")
private var _ViewArray: ImageVector? = null
