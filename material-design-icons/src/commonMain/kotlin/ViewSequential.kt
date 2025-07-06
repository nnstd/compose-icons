package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewSequential: ImageVector
    get() {
        if (_ViewSequential != null) {
            return _ViewSequential!!
        }
        _ViewSequential = ImageVector.Builder(
            name = "ViewSequential",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(3f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ViewSequential!!
    }

@Suppress("ObjectPropertyName")
private var _ViewSequential: ImageVector? = null
