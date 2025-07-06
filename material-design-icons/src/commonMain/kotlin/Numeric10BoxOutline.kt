package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric10BoxOutline: ImageVector
    get() {
        if (_Numeric10BoxOutline != null) {
            return _Numeric10BoxOutline!!
        }
        _Numeric10BoxOutline = ImageVector.Builder(
            name = "Numeric10BoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(8f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(14f, 7f)
                horizontalLineTo(16f)
                curveTo(17.11f, 7f, 18f, 7.9f, 18f, 9f)
                verticalLineTo(15f)
                curveTo(18f, 16.11f, 17.11f, 17f, 16f, 17f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                moveTo(14f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Numeric10BoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric10BoxOutline: ImageVector? = null
