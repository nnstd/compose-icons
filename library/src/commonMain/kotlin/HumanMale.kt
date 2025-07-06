package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMale: ImageVector
    get() {
        if (_HumanMale != null) {
            return _HumanMale!!
        }
        _HumanMale = ImageVector.Builder(
            name = "HumanMale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(10.5f, 7f)
                horizontalLineTo(13.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 7f)
                close()
            }
        }.build()

        return _HumanMale!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMale: ImageVector? = null
