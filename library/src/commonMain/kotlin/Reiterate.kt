package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Reiterate: ImageVector
    get() {
        if (_Reiterate != null) {
            return _Reiterate!!
        }
        _Reiterate = ImageVector.Builder(
            name = "Reiterate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 4f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 10f)
                horizontalLineTo(1f)
                lineTo(5f, 14f)
                lineTo(9f, 10f)
                horizontalLineTo(6.03f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 10.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(10.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 4f)
                moveTo(19f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.24f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                lineTo(23f, 16f)
                close()
            }
        }.build()

        return _Reiterate!!
    }

@Suppress("ObjectPropertyName")
private var _Reiterate: ImageVector? = null
