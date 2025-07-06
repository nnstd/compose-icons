package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewArrayOutline: ImageVector
    get() {
        if (_ViewArrayOutline != null) {
            return _ViewArrayOutline!!
        }
        _ViewArrayOutline = ImageVector.Builder(
            name = "ViewArrayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                moveTo(21f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(17f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                moveTo(7f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ViewArrayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewArrayOutline: ImageVector? = null
