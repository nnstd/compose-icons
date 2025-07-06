package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Group: ImageVector
    get() {
        if (_Group != null) {
            return _Group!!
        }
        _Group = ImageVector.Builder(
            name = "Group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 1f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(23f)
                verticalLineTo(1f)
                horizontalLineTo(19f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(6f, 6f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                moveTo(8f, 8f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                moveTo(14f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
            }
        }.build()

        return _Group!!
    }

@Suppress("ObjectPropertyName")
private var _Group: ImageVector? = null
