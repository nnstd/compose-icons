package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Beaker: ImageVector
    get() {
        if (_Beaker != null) {
            return _Beaker!!
        }
        _Beaker = ImageVector.Builder(
            name = "Beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 21f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(7f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(7f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(10f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                moveTo(12f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(12f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _Beaker!!
    }

@Suppress("ObjectPropertyName")
private var _Beaker: ImageVector? = null
