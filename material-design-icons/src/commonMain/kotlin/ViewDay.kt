package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDay: ImageVector
    get() {
        if (_ViewDay != null) {
            return _ViewDay!!
        }
        _ViewDay = ImageVector.Builder(
            name = "ViewDay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(20f, 8f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8f)
                moveTo(2f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ViewDay!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDay: ImageVector? = null
