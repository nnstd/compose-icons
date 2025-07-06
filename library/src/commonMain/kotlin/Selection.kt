package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Selection: ImageVector
    get() {
        if (_Selection != null) {
            return _Selection!!
        }
        _Selection = ImageVector.Builder(
            name = "Selection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(22f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                moveTo(20f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                curveTo(22f, 21.11f, 21.1f, 22f, 20f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(2f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(20f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                moveTo(2f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Selection!!
    }

@Suppress("ObjectPropertyName")
private var _Selection: ImageVector? = null
