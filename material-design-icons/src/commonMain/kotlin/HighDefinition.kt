package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HighDefinition: ImageVector
    get() {
        if (_HighDefinition != null) {
            return _HighDefinition!!
        }
        _HighDefinition = ImageVector.Builder(
            name = "HighDefinition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(13f, 7f)
                horizontalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                verticalLineTo(14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(16f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _HighDefinition!!
    }

@Suppress("ObjectPropertyName")
private var _HighDefinition: ImageVector? = null
