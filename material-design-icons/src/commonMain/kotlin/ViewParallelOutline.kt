package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewParallelOutline: ImageVector
    get() {
        if (_ViewParallelOutline != null) {
            return _ViewParallelOutline!!
        }
        _ViewParallelOutline = ImageVector.Builder(
            name = "ViewParallelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(17f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ViewParallelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewParallelOutline: ImageVector? = null
