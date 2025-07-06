package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewParallel: ImageVector
    get() {
        if (_ViewParallel != null) {
            return _ViewParallel!!
        }
        _ViewParallel = ImageVector.Builder(
            name = "ViewParallel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(14f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                moveTo(9f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ViewParallel!!
    }

@Suppress("ObjectPropertyName")
private var _ViewParallel: ImageVector? = null
