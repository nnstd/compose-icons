package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Keg: ImageVector
    get() {
        if (_Keg != null) {
            return _Keg!!
        }
        _Keg = ImageVector.Builder(
            name = "Keg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                lineTo(13f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                moveTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                close()
            }
        }.build()

        return _Keg!!
    }

@Suppress("ObjectPropertyName")
private var _Keg: ImageVector? = null
