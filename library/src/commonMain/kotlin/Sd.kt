package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sd: ImageVector
    get() {
        if (_Sd != null) {
            return _Sd!!
        }
        _Sd = ImageVector.Builder(
            name = "Sd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(15f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                moveTo(12f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                moveTo(18f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                close()
            }
        }.build()

        return _Sd!!
    }

@Suppress("ObjectPropertyName")
private var _Sd: ImageVector? = null
