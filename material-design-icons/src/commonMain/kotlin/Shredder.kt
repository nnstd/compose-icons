package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shredder: ImageVector
    get() {
        if (_Shredder != null) {
            return _Shredder!!
        }
        _Shredder = ImageVector.Builder(
            name = "Shredder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                moveTo(5f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                horizontalLineTo(5f)
                moveTo(18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                moveTo(7f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(11f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                moveTo(15f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Shredder!!
    }

@Suppress("ObjectPropertyName")
private var _Shredder: ImageVector? = null
