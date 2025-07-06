package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nutrition: ImageVector
    get() {
        if (_Nutrition != null) {
            return _Nutrition!!
        }
        _Nutrition = ImageVector.Builder(
            name = "Nutrition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                moveTo(4f, 3f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                moveTo(4f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(14f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(4f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                moveTo(8f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(4f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Nutrition!!
    }

@Suppress("ObjectPropertyName")
private var _Nutrition: ImageVector? = null
