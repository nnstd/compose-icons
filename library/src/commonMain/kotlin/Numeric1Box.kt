package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric1Box: ImageVector
    get() {
        if (_Numeric1Box != null) {
            return _Numeric1Box!!
        }
        _Numeric1Box = ImageVector.Builder(
            name = "Numeric1Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                close()
            }
        }.build()

        return _Numeric1Box!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric1Box: ImageVector? = null
