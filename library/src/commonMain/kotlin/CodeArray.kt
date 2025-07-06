package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeArray: ImageVector
    get() {
        if (_CodeArray != null) {
            return _CodeArray!!
        }
        _CodeArray = ImageVector.Builder(
            name = "CodeArray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                moveTo(6f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                moveTo(16f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _CodeArray!!
    }

@Suppress("ObjectPropertyName")
private var _CodeArray: ImageVector? = null
