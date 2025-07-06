package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Billiards: ImageVector
    get() {
        if (_Billiards != null) {
            return _Billiards!!
        }
        _Billiards = ImageVector.Builder(
            name = "Billiards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13.5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                moveTo(12f, 1f)
                curveTo(5.92f, 1f, 1f, 5.92f, 1f, 12f)
                curveTo(1f, 18.08f, 5.92f, 23f, 12f, 23f)
                curveTo(18.08f, 23f, 23f, 18.08f, 23f, 12f)
                curveTo(23f, 5.92f, 18.08f, 1f, 12f, 1f)
                moveTo(12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.build()

        return _Billiards!!
    }

@Suppress("ObjectPropertyName")
private var _Billiards: ImageVector? = null
