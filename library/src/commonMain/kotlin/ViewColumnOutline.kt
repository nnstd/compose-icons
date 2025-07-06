package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewColumnOutline: ImageVector
    get() {
        if (_ViewColumnOutline != null) {
            return _ViewColumnOutline!!
        }
        _ViewColumnOutline = ImageVector.Builder(
            name = "ViewColumnOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(14f, 7f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(6f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(19f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ViewColumnOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewColumnOutline: ImageVector? = null
