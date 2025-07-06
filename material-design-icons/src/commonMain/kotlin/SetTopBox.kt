package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetTopBox: ImageVector
    get() {
        if (_SetTopBox != null) {
            return _SetTopBox!!
        }
        _SetTopBox = ImageVector.Builder(
            name = "SetTopBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 16f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.5f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 11f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 16f)
                horizontalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15.5f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(15.5f)
                moveTo(3f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                moveTo(6f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                moveTo(20.5f, 11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 11.5f)
                close()
            }
        }.build()

        return _SetTopBox!!
    }

@Suppress("ObjectPropertyName")
private var _SetTopBox: ImageVector? = null
