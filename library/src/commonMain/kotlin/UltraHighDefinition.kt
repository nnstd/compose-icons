package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UltraHighDefinition: ImageVector
    get() {
        if (_UltraHighDefinition != null) {
            return _UltraHighDefinition!!
        }
        _UltraHighDefinition = ImageVector.Builder(
            name = "UltraHighDefinition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(17f, 7f)
                horizontalLineTo(20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                verticalLineTo(14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                moveTo(20f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                moveTo(7f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _UltraHighDefinition!!
    }

@Suppress("ObjectPropertyName")
private var _UltraHighDefinition: ImageVector? = null
