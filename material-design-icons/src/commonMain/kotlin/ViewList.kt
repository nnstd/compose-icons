package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewList: ImageVector
    get() {
        if (_ViewList != null) {
            return _ViewList!!
        }
        _ViewList = ImageVector.Builder(
            name = "ViewList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(9f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                moveTo(9f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(4f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(4f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                moveTo(4f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _ViewList!!
    }

@Suppress("ObjectPropertyName")
private var _ViewList: ImageVector? = null
