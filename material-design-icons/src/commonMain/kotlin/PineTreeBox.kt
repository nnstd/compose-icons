package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PineTreeBox: ImageVector
    get() {
        if (_PineTreeBox != null) {
            return _PineTreeBox!!
        }
        _PineTreeBox = ImageVector.Builder(
            name = "PineTreeBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(11f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                lineTo(14f, 13f)
                horizontalLineTo(17f)
                lineTo(13f, 9f)
                horizontalLineTo(16f)
                lineTo(12f, 5f)
                lineTo(8f, 9f)
                horizontalLineTo(11f)
                lineTo(7f, 13f)
                horizontalLineTo(10f)
                lineTo(6f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _PineTreeBox!!
    }

@Suppress("ObjectPropertyName")
private var _PineTreeBox: ImageVector? = null
